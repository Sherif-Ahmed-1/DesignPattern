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
public class Factory {

    public Pizza createPizza(String type) {
        switch (type) {
            case "seafood":
                return new SeaFood();
            case "cheese":
                return new CheesePizza();
            case "vegetable":
                return new VegetablePizza();
        }
        return null;
    }
}
