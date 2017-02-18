/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol2;



/**
 *
 * @author Sheko
 */
public abstract class PizzaRestaurants {
    EgyptionFactory factory;

    public PizzaRestaurants(EgyptionFactory factory) {
        this.factory = factory;
    }
    public abstract Pizza create(String type);
    public void orderPizza(String type){
    Pizza pizza= create(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    }
}
