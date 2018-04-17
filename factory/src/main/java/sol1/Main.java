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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Factory factory= new  Factory();
        PizzaRestaurants pizzaRestaurants=new  PizzaRestaurants(factory);
        pizzaRestaurants.orderPizza("cheese");
        System.out.println("hi");
    }
    
}
