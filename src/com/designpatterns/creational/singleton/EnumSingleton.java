package com.designpatterns.creational.singleton;

/**
 * To overcome the situation with Reflection, Joshua Bloch suggests the use of
 * enum to implement the singleton
 *
 * Since Java enum are globally accessible
 * but they are inflexible
 * they don't support lazyInitialization
 */
public enum  EnumSingleton {

    ENUM_SINGLETON;

    public static void doSomething(){}


}
