package com.designpatterns.creational.factory;

/**
 * Created by rachit on 18/1/18.
 */
public class Server extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    @Override
    public String getCPU() {
        return cpu;
    }
}
