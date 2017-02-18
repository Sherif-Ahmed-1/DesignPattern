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
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PayStrategy ps = new PayStrategy(new CashStrategy());
        ps.payMethod(1000);
        ps = new PayStrategy(new CreditCard());
        ps.payMethod(1000);
        ps = new PayStrategy(new checkStrategy());
        ps.payMethod(1000);
    }

}
