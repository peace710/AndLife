package me.peace.basic.js;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.util.Random;

import me.peace.basic.R;

/**
 * Created by User_Kira on 2016/10/20.
 */
@TargetApi(19)
public class JavaScriptActivity extends AppCompatActivity {
    private WebView webview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javascript);
        webview = (WebView)findViewById(R.id.webview);
        initWebView();
        addScript();
        loadUrl("file:///android_asset/andLife/andLife.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.add_button){
            String label = getString(R.string.button) + new Random().nextInt(100);
            String call = "javascript:jsAddButton(\"" + label + "\"," +  new Random().nextBoolean() + ")";
            webview.loadUrl(call);
        }else if (id == R.id.remove_button){
            String call = "javascript:jsRemoveButton()";
            webview.loadUrl(call);
        }else if (id == R.id.obtain_date){
            webview.evaluateJavascript("jsGetDate()", new ValueCallback<String>() {
                @Override
                public void onReceiveValue(String value) {
                    setTitle(value);
                }
            });
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        webview = null;
    }

    private void initWebView(){
        WebSettings settings = webview.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setAppCacheEnabled(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setSupportZoom(true);

        webview.setWebChromeClient(new ChromeClient());
        webview.setWebViewClient(new WebClient());
    }

    private void addScript(){
        webview.addJavascriptInterface(new ScriptControl(),"android");
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

    class ScriptControl {
        @JavascriptInterface
        public void toast(String text){
            Toast.makeText(JavaScriptActivity.this,text,Toast.LENGTH_LONG).show();
        }

        @JavascriptInterface
        public void startCapture(){
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            if (null != intent.resolveActivity(getPackageManager())){
                startActivity(intent);
            }
        }
    }
}
