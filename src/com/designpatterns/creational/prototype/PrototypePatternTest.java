package com.designpatterns.creational.prototype;

import java.util.List;

/**
 * Created by rachit on 18/1/18.
 */
public class PrototypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employees employees=new Employees();
        employees.loadData();

        Employees employees1=(Employees)employees.clone();
        Employees employees2= (Employees) employees.clone();

        List<String> list = employees1.getEmpList();
        list.add("rachit1");

        List<String> list1 = employees2.getEmpList();
        list1.remove("rachit");

        System.out.println(list);
        System.out.println(list1);


    }
}
