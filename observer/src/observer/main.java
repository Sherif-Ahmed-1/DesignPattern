/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Sheko
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Observer observer=new Observer();
        observer.addObservable(new Display());
        observer.addObservable(new Display());
        observer.addObservable(new Display());
        observer.setVal1(1);
        observer.setVal2(2);
        observer.setVal3(3);
        observer.displayall();
    }
    
}
