/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.decorator;

/**
 *
 * @author Sheko
 */
public class Order {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sandwich chicken=new ChickenSandwich();
        chicken=new Cheese(chicken);
        chicken=new ketchup(chicken);
        System.out.println(chicken.description());
        System.out.println(chicken.cost());
        Sandwich beef=new BeefSandwich();
        beef=new Cheese(beef);
        beef = new Cheese(beef);
        beef=new Cheese(beef);
        System.out.println(beef.description());
        System.out.println(beef.cost());
    }
    
}
