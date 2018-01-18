package com.designpatterns.creational.factory;

/**
 * Created by rachit on 18/1/18.
 */
public class ComputerFactory {

    private ComputerFactory(){}

    private static class ComputerFactoryInner{

        private final static ComputerFactory INSTANCE=new ComputerFactory();
    }

    public static ComputerFactory getInstance(){
        return ComputerFactoryInner.INSTANCE;
    }

    public static Computer getComputerFactory(String type,String ram,String hdd,String cpu){
        if(type.equalsIgnoreCase("PC"))
            return new PC(ram, hdd, cpu);
        else if(type.equalsIgnoreCase("SERVER"))
            return new Server(ram, hdd, cpu);
        else
            return null;
    }
}
