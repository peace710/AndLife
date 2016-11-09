package me.peace.provider;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import me.drakeet.multitype.ItemViewProvider;
import me.peace.R;
import me.peace.items.TextItem;
import me.peace.router.Router;

/**
 * Created by User_Kira on 2016/10/13.
 */

public class TextItemViewProvider extends ItemViewProvider<TextItem,TextItemViewProvider.TextHolder> {
    private static final String KEY_ADDON = "addon";

    static class TextHolder extends RecyclerView.ViewHolder{
        @NonNull private final LinearLayout item;
        @NonNull private final TextView textView;
        TextHolder(@NonNull View itemView){
            super(itemView);
            this.item = (LinearLayout)itemView.findViewById(R.id.item);
            this.textView = (TextView) itemView.findViewById(R.id.text);
        }
    }

    @NonNull
    @Override
    protected TextHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View root = inflater.inflate(R.layout.item_text,parent,false);
        return new TextHolder(root);
    }

    @Override
    protected void onBindViewHolder(@NonNull TextHolder holder, @NonNull final TextItem textItem) {
        holder.textView.setText(textItem.text);
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Class cls = textItem.cls;
                if (null != cls) {
                    String addon = textItem.addon;
                    if (TextUtils.isEmpty(addon)) {
                        Router.go(context, new Intent(context, cls));
                    }else{
                        Intent intent = new Intent(context,cls);
                        intent.putExtra(KEY_ADDON,addon);
                        Router.go(context,intent);
                    }
                }
            }
        });
    }
}
