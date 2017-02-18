/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

/**
 *
 * @author Sheko
 */
public abstract class Drink implements Ingrediant{

    public Drink() {
        boilWater();
        addIngrediant();
        drink();
    }

    
    void boilWater()
    {
        System.out.println("boil water");
    }
    void drink()
    {
        System.out.println("Drink");
    }
    
    
}
