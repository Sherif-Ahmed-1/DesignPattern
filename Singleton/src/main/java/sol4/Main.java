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
public class Main {

    /**
     * @param args the command line arguments
     */
    static Singleton singleton;
    static Singleton singleton1;

    public static void main(String[] args) {
        // TODO code application logic here
        new Thread(() -> {
            singleton = Singleton.getInstance();
            singleton.setSomeThing("hello");
            singleton.SaySomeThing();
        }).start();
        new Thread(() -> {
            singleton1 = Singleton.getInstance();
            singleton1.SaySomeThing();
        }).start();
        
        
    }

}
