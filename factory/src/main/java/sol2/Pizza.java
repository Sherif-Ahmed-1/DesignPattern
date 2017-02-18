/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol2;
/**
 *
 * @author Sheko
 */
public interface Pizza {
   void  createPizza();
   default void prepare()
   {
       System.out.println("prepare Pizza");
   }
   default  void bake()
   {
       System.out.println("bake pizza");
   }
   default void cut()
   {
       System.out.println("cutt Pizza");
   }
}
