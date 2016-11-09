package me.peace.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User_Kira on 2016/10/20.
 */

public class Computer implements Observable {
    private List<Observer> list;
    private int memory;

    public Computer(){
        list = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        list.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyUpdate() {
        for (Observer observer : list){
            observer.update(memory);
        }
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void install(Observer observer){
        subscribe(observer);
    }

    public void uninstall(Observer observer){
        unsubscribe(observer);
    }
}
