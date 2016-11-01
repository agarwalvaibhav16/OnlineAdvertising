/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.ProductManager;
import Business.Role.PublisherSalesManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class PublisherSales extends Organization{

    public PublisherSales() {
        super(Type.PublisherSales.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
       roles.add(new PublisherSalesManager());
        return  roles;
    }
  
}