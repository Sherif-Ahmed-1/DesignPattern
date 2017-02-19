/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol;

/**
 *
 * @author Sheko
 */
public class adapter {
    public void adapt(Format2 format2)
    {
        Format1 format1=new Format1(format2.data[0], format2.data[1],format2.age);
        new View().display(format1);
    }
}
