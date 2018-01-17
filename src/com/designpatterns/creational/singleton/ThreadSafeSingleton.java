package com.designpatterns.creational.singleton;

/**
 * Provides the thread safety but it reduces the performance because of the cost
 * associated with the synchronized
 *
 * to Avoid the extra overhead every time, Double Checked Locking Principle
 * the second Method is based on double checked locking principle
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton() {
    }

    private static synchronized ThreadSafeSingleton getInstance() {
        if (threadSafeSingleton == null) {
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }

    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (threadSafeSingleton == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (threadSafeSingleton == null) {
                    threadSafeSingleton = new ThreadSafeSingleton();
                }
            }
        }
        return threadSafeSingleton;
    }
}