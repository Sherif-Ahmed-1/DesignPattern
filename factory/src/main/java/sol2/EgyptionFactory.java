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
public class EgyptionFactory {

    public Pizza createPizza(String type) {
        switch (type) {
            case "seafood":
                return new EgyptionSeaFood();
            case "cheese":
                return new EgyptionCheesePizza();
            case "vegetable":
                return new EgyptionVegetablePizza();
        }
        return null;
    }
}
