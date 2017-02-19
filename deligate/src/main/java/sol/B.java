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
public class B {
    C c;

    public B(C c) {
        this.c = c;
    }
    public void saySomeThing(String someThing)
    {
        c.saySomeThing(someThing);
    }
}
