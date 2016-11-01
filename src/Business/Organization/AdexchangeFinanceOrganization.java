/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdExchangeFinanceManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vaibhavagarwal
 */
public class AdexchangeFinanceOrganization extends Organization{
    
    public AdexchangeFinanceOrganization() {
        super(Type.AdexchangeFinanceOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
      roles.add(new AdExchangeFinanceManagerRole());
        return roles;
    }
}
