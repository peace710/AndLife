package me.peace;

import me.drakeet.multitype.MultiTypePool;
import me.peace.items.TextItem;
import me.peace.provider.TextItemViewProvider;

/**
 * Created by User_Kira on 2016/10/13.
 */

public class MultiTypeInstaller {
    static void install(){
        MultiTypePool.register(TextItem.class,new TextItemViewProvider());
    }
}
