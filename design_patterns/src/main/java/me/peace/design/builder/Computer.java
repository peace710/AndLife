package me.peace.design.builder;

/**
 * Created by User_Kira on 2016/10/19.
 */
//建造者模式
public class Computer {
    private int core;
    private String ram;
    private String cpu;

    protected Computer(){

    }

   public void printComputerInfo(){
       System.out.println("Computer{" +
               "core=" + core +
               ", ram='" + ram + '\'' +
               ", cpu='" + cpu + '\'' +
               '}');
   }

    static class Builder{
        private Computer computer;

        public Builder(){
            computer = new Computer();
        }

        public Builder setCore(int core) {
            computer.core = core;
            return this;
        }

        public Builder setRam(String ram) {
            computer.ram = ram;
            return this;
        }

        public Builder setCpu(String cpu) {
            computer.cpu = cpu;
            return this;
        }

        public Computer create(){
            return computer;
        }
    }

    public static void main(String[] args){
        Computer.Builder builder = new Computer.Builder();
        Computer computer = builder.setCore(8).setCpu("CoreI7").setRam("8G").create();
        computer.printComputerInfo();
    }
}
