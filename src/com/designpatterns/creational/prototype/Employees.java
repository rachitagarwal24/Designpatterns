package com.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rachit on 18/1/18.
 */
public class Employees implements Cloneable {

    private List<String> empList;

    public Employees(){
        empList = new ArrayList<>();
    }

    public Employees(List<String> empList) {
        this.empList = empList;
    }

    public void loadData(){
        empList.add("rachit");
        empList.add("babu");
        empList.add("neha");
        empList.add("aditi");

    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp=new ArrayList<>();
        for (String s : this.empList) {
            temp.add(s);
        }
        return new Employees(temp);
    }
}


