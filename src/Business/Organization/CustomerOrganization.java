/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.UserRole;
import java.util.ArrayList;

/**
 *
 * @author vaibhavagarwal
 */
public class CustomerOrganization extends Organization{
    
    public CustomerOrganization()
    {
        super(Type.CustomerOrganization.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        //roles.add(new UserRole());
        return null;
    }
  
    
}
