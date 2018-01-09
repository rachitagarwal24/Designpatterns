package com.designpatterns.creational.singleton;

/**
 * Works
 *
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton;
    private ThreadSafeSingleton(){
    }

    private static synchronized ThreadSafeSingleton getInstance(){
        if(threadSafeSingleton==null){
            threadSafeSingleton=new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }

}
