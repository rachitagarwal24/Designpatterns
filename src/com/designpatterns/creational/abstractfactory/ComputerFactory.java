package com.designpatterns.creational.abstractfactory;

/**
 * Created by rachit on 18/1/18.
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory){
        return computerAbstractFactory.createComputer();

    }
}
