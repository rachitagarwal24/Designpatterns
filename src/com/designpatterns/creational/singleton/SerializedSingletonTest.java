package com.designpatterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 *
 * without readResolve method it destroy the serialized Singleton Pattern
 *
 */
public class SerializedSingletonTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializedSingleton instanceOne=SerializedSingleton.getInstance();
        ObjectOutput out=new ObjectOutputStream(new FileOutputStream("rachit.ser"));
        out.writeObject(instanceOne);
        out.close();

        ObjectInput input=new ObjectInputStream(new FileInputStream("rachit.ser"));
        SerializedSingleton instanceTwo=(SerializedSingleton) input.readObject();
        input.close();

        System.out.println("InstanceOne hasCode"+instanceOne.hashCode());
        System.out.println("InstanceTwo hasCode"+instanceTwo.hashCode());




    }
}
