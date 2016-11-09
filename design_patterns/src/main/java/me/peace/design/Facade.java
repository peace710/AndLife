package me.peace.design;

/**
 * Created by User_Kira on 2016/10/21.
 */
//外观模式
public class Facade {
    public static void main(String args[]){
        OS os = new OS();
        os.powerOn();
        os.connect();
        os.turnUp();
        os.turnDown();
        os.disconnect();
        os.powerOff();
    }
}

class OS{
    private VoiceSystem voiceSystem = new VoiceSystem();
    private PowerSystem powerSystem = new PowerSystem();
    private NetworkSystem networkSystem = new NetworkSystem();

    public void turnUp(){
        voiceSystem.turnUp();
    }

    public void turnDown(){
        voiceSystem.turnDown();
    }

    public void powerOn(){
        powerSystem.powerOn();
    }

    public void powerOff(){
        powerSystem.powerOff();
    }

    public void connect(){
        networkSystem.connect();
    }

    public void disconnect(){
        networkSystem.disconnect();
    }
}

class VoiceSystem{
    public void turnUp(){
        System.out.println("调高音量");
    }

    public void turnDown(){
        System.out.println("调低音量");
    }
}

class PowerSystem{
    public void powerOn(){
        System.out.println("开机");
    }

    public void powerOff(){
        System.out.println("关机");
    }
}

class NetworkSystem{
    public void connect(){
        System.out.println("连接网络");
    }

    public void disconnect(){
        System.out.println("断开网络");
    }
}

