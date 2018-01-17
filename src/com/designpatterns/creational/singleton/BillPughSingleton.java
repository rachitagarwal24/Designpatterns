package com.designpatterns.creational.singleton;

/**
 * staticblock, eager, lazy, threadsafe all the singleton class fail in different scenarios
 */
public class BillPughSingleton {

    private BillPughSingleton(){}

    private static class SingleHelper{
        private final static BillPughSingleton INSTANCE=new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingleHelper.INSTANCE;
    }


}
