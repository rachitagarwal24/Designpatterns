package com.designpatterns.creational.builder;

/**
 * Created by rachit on 18/1/18.
 */
public class Computer {

    //Required Parameters
    private String ram;
    private String hdd;

    //Optional Paramerters
    private boolean isGraphicCardEnable;
    private boolean isBluetoothEnable;

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public boolean isGraphicCardEnable() {
        return isGraphicCardEnable;
    }

    public boolean isBluetoothEnable() {
        return isBluetoothEnable;
    }

    private Computer(ComputerBuilder computerBuilder){
        this.hdd=computerBuilder.hdd;
        this.ram=computerBuilder.ram;
        this.isGraphicCardEnable=computerBuilder.isGraphicCardEnable;
        this.isBluetoothEnable=computerBuilder.isBluetoothEnable;

    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", isGraphicCardEnable=" + isGraphicCardEnable +
                ", isBluetoothEnable=" + isBluetoothEnable +
                '}';
    }

    public static class ComputerBuilder{
        private String hdd;
        private String ram;

        private boolean isBluetoothEnable;
        private boolean isGraphicCardEnable;

        public ComputerBuilder(String hdd, String ram) {
            this.hdd = hdd;
            this.ram = ram;
        }

        public ComputerBuilder setGraphicCardEnable(boolean isGraphicCardEnable){
            this.isGraphicCardEnable=isGraphicCardEnable;
            return this;
        }

        public ComputerBuilder setBluetoothEnable(boolean isBluetoothEnable){
            this.isBluetoothEnable=isBluetoothEnable;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }


    }

}
