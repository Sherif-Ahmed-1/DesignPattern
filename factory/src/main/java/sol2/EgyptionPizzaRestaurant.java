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
public class EgyptionPizzaRestaurant extends PizzaRestaurants{

    public EgyptionPizzaRestaurant(EgyptionFactory factory) {
        super(factory);
    }

    @Override
    public Pizza create(String type) {
       Pizza pizza= factory.createPizza(type);
       pizza.createPizza();;
       return  pizza;
    }
    
}
