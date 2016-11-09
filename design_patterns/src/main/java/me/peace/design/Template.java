package me.peace.design;

/**
 * Created by User_Kira on 2016/10/21.
 */
//模板方法方式
public class Template {
    public static void main(String[] args){
        PersonalComputer pc = new PersonalComputer();
        pc.execute();
    }
}

abstract class AbstractComputer{
    public void powerOn(){
        System.out.println("电脑开机");
    }

    public abstract void runApp();

    public void powerOff(){
        System.out.println("电脑关机");
    }

    public void execute(){
        powerOn();
        runApp();
        powerOff();
    }
}

class PersonalComputer extends AbstractComputer{
    @Override
    public void runApp() {
        System.out.println("打开QQ");
        System.out.println("打开爱奇艺播放器");
    }
}
