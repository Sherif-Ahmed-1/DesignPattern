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
public class Cheese extends CondimentDecorator{

    Sandwich sandwich ;

    public Cheese(Sandwich sandwich) {
        this.sandwich = sandwich;
    }
     
    @Override
    public String description() {
        return  sandwich.description()+" with Cheese";
    }

    @Override
    public float cost() {
        return sandwich.cost()+5;
    }
    
}
