package me.peace.items;

import android.app.Activity;
import android.support.annotation.NonNull;

import me.drakeet.multitype.Item;
import me.drakeet.multitype.Savable;

/**
 * Created by User_Kira on 2016/10/13.
 */

public class TextItem implements Item ,Savable{
    @NonNull
    public String text;
    @NonNull
    public Class cls;
    @NonNull
    public String addon;

    public TextItem(@NonNull String text, Class cls) {
        this.text = text;
        this.cls = cls;
        this.addon = "";
    }

    public TextItem(@NonNull String text, Class cls,@NonNull String addon) {
        this.text = text;
        this.cls = cls;
        this.addon = addon;
    }

    @Override
    public void init(@NonNull byte[] data) {
        text = new String(data);
    }

    @NonNull
    @Override
    public byte[] toBytes() {
        return text.getBytes();
    }

    @NonNull
    @Override
    public String describe() {
        return "Text";
    }
}
