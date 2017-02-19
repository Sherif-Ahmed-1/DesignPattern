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
public class A {
    String someThing="hello";
    B b;

    public A(B b) {
        this.b = b;
    }
    void saySomeThing()
    {
        b.saySomeThing(someThing);
    }
}
