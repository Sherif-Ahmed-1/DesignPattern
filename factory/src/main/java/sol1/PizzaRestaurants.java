/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol1;

/**
 *
 * @author Sheko
 */
public class PizzaRestaurants {
    Factory factory;

    public PizzaRestaurants(Factory factory) {
        this.factory = factory;
    }
    public void orderPizza(String type){
    Pizza pizza=factory.createPizza(type);
    pizza.createPizza();
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    }
}
