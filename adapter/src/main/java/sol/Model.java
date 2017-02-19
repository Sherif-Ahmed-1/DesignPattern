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
public class Model {

    Format2  format2;
    public Model() {
        String [] data=new String[]{"name","address"};
        format2=new Format2(data, 10);
    }
    public  void print()
    {
        new adapter().adapt(format2);
    }
    
}
