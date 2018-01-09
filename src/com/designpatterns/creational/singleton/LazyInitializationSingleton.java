package com.designpatterns.creational.singleton;

/**
 *Creates the instance in global access Method.
 *
 * In singleThreaded Environment It works Fine but in MultiThreaded Environment (if multiple Thread inside inside the same Loop)
 * At this time it will destroy the SingleTon Patterns
 *
 */

public class LazyInitializationSingleton {

    private static LazyInitializationSingleton lazyInitializationSingleton;

    private LazyInitializationSingleton(){
    }

    public static LazyInitializationSingleton getInstance(){
        if(lazyInitializationSingleton==null){
            lazyInitializationSingleton=new LazyInitializationSingleton();
        }
        return lazyInitializationSingleton;

    }

}
