package me.peace.basic.js;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import me.peace.basic.R;

/**
 * Created by User_Kira on 2016/11/2.
 */

public class ReactActivity extends AppCompatActivity {
    private WebView webview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javascript);
        webview = (WebView)findViewById(R.id.webview);
        initWebView();
        loadUrl("file:///android_asset/react/index.html");
    }

    @Override
    protected void onResume() {
        if (null != webview){
            webview.onResume();
        }
        super.onResume();
    }

    @Override
    protected void onPause() {
        if (null != webview){
            webview.onPause();
        }
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        if (null != webview){
            webview.destroy();
        }
        webview = null;
        super.onDestroy();
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void initWebView(){
        WebSettings settings = webview.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setAppCacheEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setSupportZoom(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccessFromFileURLs(true);

        webview.setWebChromeClient(new ChromeClient());
        webview.setWebViewClient(new WebClient());
    }


    private void loadUrl(String url){
        webview.loadUrl(url);
    }

    class ChromeClient extends WebChromeClient {
        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            super.onProgressChanged(view, newProgress);
        }

        @Override
        public void onReceivedTitle(WebView view, String title) {
            super.onReceivedTitle(view, title);
            setTitle(title);
        }
    }

    class WebClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (!TextUtils.isEmpty(url)){
                view.loadUrl(url);
            }
            return true;
        }

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (KeyEvent.ACTION_DOWN == event.getAction()){
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (webview.canGoBack()) {
                        webview.goBack();
                        return true;
                    }
                    break;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}
