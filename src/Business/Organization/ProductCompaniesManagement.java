/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdExchangeBiddersManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vaibhavagarwal
 */
public class ProductCompaniesManagement extends Organization {
    
    public ProductCompaniesManagement() {
        super(Type.ProductCompaniesSelection.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdExchangeBiddersManager());
        return roles;
    }
     
}
