/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Sheko
 */
public class checkStrategy implements Payable{

    @Override
    public void pay(int amounts) {
        System.err.println("pay by check amount"+amounts);
    }
    
}
