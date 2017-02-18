/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import prototype.Employee;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sheko
 */
public class Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp=new Employee();
        Employee emp1=null;
        try {
             emp1=(Employee)emp.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Prototype.class.getName()).log(Level.SEVERE, null, ex);
        }
        emp1.addEmp("emp");
        
        emp.print();
        emp1.print();
    }
    
}
