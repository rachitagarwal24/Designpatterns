package com.designpatterns.creational.singleton;

//Easiest Method to create Singleton Class

//Instance of SingleTon Class is created at the time of class Loading

//it has a Drawback that instance of SingleTon Class is created Even the client Application is not in use

public class EagerInitializedSingleton {
    
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}

