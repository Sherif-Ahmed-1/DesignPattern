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
public class PayStrategy {

    Payable strategy;

    public PayStrategy(Payable strategy) {
        this.strategy = strategy;
    }

    public void payMethod(int amount) {
        strategy.pay(amount);
    }
}
