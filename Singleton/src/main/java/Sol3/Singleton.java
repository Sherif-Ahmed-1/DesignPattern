/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol3;



/**
 *
 * @author Sheko
 */

/* Eager Instantiation
   solve the problem in solution 2  but create another problem
   it rely on the way jvm load and initialize static attributes
   problem if 10 thread call the class at the same time all of them will wait in queue
   untill the static attributes are initialized and will run one by one by the jvm 
   but if the 11 thread comes and the instance is already initialized it will also
   have to wait in the queue 
*/
public class Singleton {
    private  static  Singleton instance=new Singleton();
    private String  someThing;
    private Singleton() {
    }
    public  static  Singleton getInstance()
    {
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