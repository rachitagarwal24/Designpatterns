package com.designpatterns.creational.singleton;

import java.io.Serializable;

/**
 *
 */
public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID=-760472348784238L;

    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton INSTANCE=new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    protected Object readResolve(){
        return getInstance();
    }

}
