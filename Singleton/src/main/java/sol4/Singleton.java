/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol4;

/**
 *
 * @author Sheko
 */

/* Double Check
    the  last solution and the best 
    if n thread call get instance at the same time for the first time 
    they will be synchronized and only the first one will create instance from the class
    and the rest will follow one by one 
    if the n+1 thread call get instance it will return the instance and will not wait
 */
public class Singleton {

    private static Singleton instance;
    private String someThing;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void setSomeThing(String someThing) {
        this.someThing = someThing;
    }

    public void SaySomeThing() {
        System.out.println(someThing);
    }
}
