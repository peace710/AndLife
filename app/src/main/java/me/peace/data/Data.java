package me.peace.data;

/**
 * Created by User_Kira on 2016/10/21.
 */

public class Data{
    public int resId;
    public Class cls;
    //common string or json string
    public String addon;

    public Data(int resId, Class cls) {
        this.resId = resId;
        this.cls = cls;
        this.addon = "";
    }

    public Data(int resId,Class cls,String addon){
        this.resId = resId;
        this.cls = cls;
        this.addon = addon;
    }
}