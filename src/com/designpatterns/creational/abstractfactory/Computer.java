package com.designpatterns.creational.abstractfactory;

/**
 * Created by rachit on 18/1/18.
 */
public abstract class Computer {

    public abstract String getRam();
    public abstract String getHdd();
    public abstract String getCpu();

    public String toString(){
        return "RAM = "+this.getRam()+" HDD = "+this.getHdd()+" CPU = "+this.getCpu();
    }

}
