/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ProductManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vaibhavagarwal
 */
public class ManageProducts extends Organization {
    public ManageProducts() {
        super(Type.ManageProducts.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProductManager());
        return roles;
    }
}
