/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.LinkedList;

/**
 *
 * @author Sheko
 */
public class Observer {

    LinkedList<Observable> observableList = new LinkedList<>();
    public int val1, val2, val3;

    public void addObservable(Observable display) {
        observableList.add(display);
    }

    public void removeObservable(Observable display) {
        observableList.remove(display);
    }

    public void displayall() {
        for (Observable observable : observableList) {
            observable.print(val1, val2, val3);
        }
    }

    public int getVal1() {
        return val1;
    }
    
    public void setVal1(int val1) {
        this.val1 = val1;
    }
    
    public int getVal2() {
        return val2;
    }
    
    public void setVal2(int val2) {
        this.val2 = val2;
    }
    
    public int getVal3() {
        return val3;
    }
    
    public void setVal3(int val3) {
        this.val3 = val3;
    }
    
}
