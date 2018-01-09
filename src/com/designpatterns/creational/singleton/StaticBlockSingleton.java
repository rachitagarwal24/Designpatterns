package com.designpatterns.creational.singleton;

//Similar to Eger Initialization Except that instance of class is created in the static block
// That's Provide Option for Exception Handling

public class StaticBlockSingleton {

    private static StaticBlockSingleton staticBlockSingleton;

    private StaticBlockSingleton(){
    }


    //static block initialization for Exception Handling
    static {
        try {
            staticBlockSingleton = StaticBlockSingleton.getInstance();
        }
        catch (Exception e){
            throw new RuntimeException("Exception occurred in creating SingleTon instance");
        }

    }

    public static StaticBlockSingleton getInstance(){
        return staticBlockSingleton;
    }

}
