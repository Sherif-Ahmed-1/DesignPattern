/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol2;
/**
 *
 * @author Sheko
 */

/*solve the problem in solution 1 by using synchronize
` problem using synchronize with static method synchronize the whole class now 
  for a thread to get Instance it must be the only thread working in the class
*/
public class Singleton {
    private  static  Singleton instance;
    private String  someThing;
    private Singleton() {
    }
    public  static synchronized Singleton getInstance()
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