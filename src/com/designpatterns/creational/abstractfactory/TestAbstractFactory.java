package com.designpatterns.creational.abstractfactory;

/**
 * Created by rachit on 18/1/18.
 */
public class TestAbstractFactory {

    public static void main(String[] args){
        Computer pc = ComputerFactory.getComputer(new PCFactory("2GB","1000GB","2.4Ghz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("2GB","1000GB","1.2 GHz"));

        System.out.println(pc);
        System.out.println(server);
    }
}
