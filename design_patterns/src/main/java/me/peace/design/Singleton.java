package me.peace.design;

/**
 * Created by User_Kira on 2016/10/19.
 */

//单例模式
public class Singleton {
    public static void main(String[] args){
        Singleton1.getInstance().print();
        Singleton2.getInstance().print();
        Singleton3.getInstance().print();
        Singleton4.getInstance().print();
        Singleton5.getInstance().print();
        Singleton6.instance.print();
    }
}

class Singleton1{
    private static Singleton1 instance = new Singleton1();

    private Singleton1(){

    }

    public static Singleton1 getInstance(){
        return instance;
    }

    public void print(){
        System.out.println("饿汉式");
    }
}

class Singleton2{
    private static Singleton2 instance;

    private Singleton2(){

    }

    public static Singleton2 getInstance(){
        if (null == instance){
            instance = new Singleton2();
        }
        return instance;
    }

    public void print(){
        System.out.println("懒汉式");
    }
}

class Singleton3{
    private static Singleton3 instance;

    private Singleton3(){

    }

    public static Singleton3 getInstance(){
        synchronized (Singleton3.class) {
            if (null == instance) {
                instance = new Singleton3();
            }
        }
        return  instance;
    }


    public void print(){
        System.out.println("懒汉式同步锁");
    }
}

class Singleton4{
    private static volatile Singleton4 instance;

    private Singleton4(){

    }

    public static Singleton4 getInstance(){
        if (null == instance) {
            synchronized (Singleton4.class) {
                if (null == instance){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

    public void print(){
        System.out.println("双重校验锁");
    }
}

class Singleton5{
    private Singleton5(){

    }

    private static class SingletonHolder{
        private static  Singleton5 instance = new Singleton5();
    }

    public static Singleton5 getInstance(){
        return SingletonHolder.instance;
    }

    public void print(){
        System.out.println("静态内部类方式");
    }
}

enum Singleton6{
    instance;

    public void print(){
        System.out.println("枚举方式");
    }
}










