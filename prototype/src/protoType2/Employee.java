/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protoType2;

import java.util.ArrayList;

/**
 *
 * @author Sheko
 */
public class Employee implements Cloneable {

    ArrayList<String> emp;

    public Employee() {
        emp = new ArrayList<>();
        emp.add("A");
        emp.add("B");
        emp.add("C");
        emp.add("D");
    }

 public void print() {
        System.out.println("====================================================");
        for (String name : emp) {
            System.out.println(name);
        }
     
    }

    public Employee(ArrayList emp) {
        this.emp = emp;
    }

    void addEmp(String employeeName) {
        emp.add(employeeName);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ArrayList<String> temp = new ArrayList<>(emp);
        return new Employee(temp);

    }

}
