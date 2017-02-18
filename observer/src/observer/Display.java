/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Sheko
 */
public class Display implements Observable {

    @Override
    public void print(int val1, int val2, int val3) {
        System.out.println(val1 + "  " + val2 + "  " + val3);
    }

}
