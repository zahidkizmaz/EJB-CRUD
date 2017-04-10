package pl.polsl.lastname.firstname;

import javax.ejb.EJB;
import pl.polsl.report2.Airplane;
import pl.polsl.report2.Customer;
import pl.polsl.report2.Report2SesionBeanRemote;

/**
 * Here is where we will make all the CRUD operations.
 * @author Kizmaz Zahid - Hernandez Raul
 * @version 1.0
 */

public class Controller {

    /**
     * This is how we will inject the bean.
     */
    @EJB
    private static Report2SesionBeanRemote beanremote;
    
    public static void main(String[] args) {
        
        //Please, when testing, comment the other ones.
        
        /****************THIS WILL INSERT DATA TO THE TABLES******************/
        
        //AIRPLANE TABLE
        Airplane a1 = new Airplane();
        a1.setName_airplane("Avianca127");
        a1.setPassenger(150);
        beanremote.insert(a1);
        
        //CUSTOMER TABLE
        Customer c1 = new Customer();
        c1.setName("Raul");
        c1.setLastname("Hernandez");
        beanremote.insert(c1);
        
        /****************THIS WILL FIND DATA FROM THE TABLES******************/
        beanremote.find(1);
               
        /****************THIS WILL UPDATE DATA TO THE TABLES******************/
        c1.setName("Zahid");
        c1.setLastname("Kizmaz");
        beanremote.updateC(c1);
        
        /****************THIS WILL DELETE DATA TO THE TABLES******************/
        a1 = beanremote.find(1);
        beanremote.delete(a1);
    }
    
}
