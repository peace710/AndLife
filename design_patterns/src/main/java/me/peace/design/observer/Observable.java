package me.peace.design.observer;

/**
 * Created by User_Kira on 2016/10/20.
 */

public interface Observable {
    public void subscribe(Observer observer);
    public void unsubscribe(Observer observer);
    public void notifyUpdate();
}
