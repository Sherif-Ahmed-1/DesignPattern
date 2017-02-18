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
/* problem getInstance is not synchronized so if 2 thread checked instance==null 
   at the same time both of them well have different instance 
*/
public class Singleton {
    private  static  Singleton instance;
    private String  someThing;
    private Singleton() {
    }
    public  static  Singleton getInstance()
    {
        if(instance==null)
            instance=new Singleton();
        return instance;
    }
    public void setSomeThing(String someThing) {
        this.someThing = someThing;
    }
    public void SaySomeThing()
    {   
        System.out.println(someThing);   
    }
}