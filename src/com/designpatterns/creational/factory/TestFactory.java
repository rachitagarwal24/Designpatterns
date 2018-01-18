package com.designpatterns.creational.factory;

/**
 * Created by rachit on 18/1/18.
 */
public class TestFactory {

    public static void main(String[] args){

        ComputerFactory computerFactory=ComputerFactory.getInstance();
        /*Computer pc = computerFactory.getComputerFactory("PC","2 Gb","1000 GB","2.4GHz");
        Computer server = computerFactory.getInstance().getComputerFactory("SERVER","1 GB","500 GB","1.2GHz");
*/
        ComputerFactory computerFactory1=ComputerFactory.getInstance();
        System.out.println(computerFactory.getComputerFactory("PC","2 Gb","1000 GB","2.4GHz"));
        System.out.println(computerFactory.getComputerFactory("SERVER","1 GB","500 GB","1.2GHz"));
    }
}
