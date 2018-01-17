package com.designpatterns.creational.singleton;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Constructor;

/**
 * Created by rachit on 17/1/18.
 */
public class ReflectionSingletonTest {

    public static void main(String[] args){
        EagerInitializedSingleton instanceOne=EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instancetwo=null;
        try {
            Constructor[] constructors=EagerInitializedSingleton.class.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                //this code will break the singleton Pattern
                constructor.setAccessible(true);
                instancetwo=(EagerInitializedSingleton)constructor.newInstance();
                break;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instancetwo.hashCode());
    }
}

