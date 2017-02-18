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
public class BeefSandwich  extends Sandwich{

    @Override
    public String description() {
        return  "beef Sandwich";
    }

    @Override
    public float cost() {
    return  10f;
    }
    
    
}
