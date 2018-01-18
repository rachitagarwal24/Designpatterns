package com.designpatterns.creational.builder;

/**
 * Created by rachit on 18/1/18.
 */
public class TestBuilderPattern {

    public static void main(String[] args) {

        Computer computer=new Computer.ComputerBuilder("500GB","2GB")
                .setBluetoothEnable(true).setGraphicCardEnable(true).build();
        System.out.println(computer);
    }
}
