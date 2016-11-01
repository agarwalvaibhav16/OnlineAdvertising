/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdInventoryOrganizer;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vaibhavagarwal
 */
public class AdInventoryManagementOrganization extends Organization{
    
     public AdInventoryManagementOrganization() {
        super(Type.AdInventoryManagementOrganization.getValue());
    }
    
     
     
   /* public enum PublisherType
    {
        SalesOrganization("Sales"),BiddingAccounts("BiddingAccounts");
        private String value;
        private PublisherType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }*/
     @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
       roles.add(new AdInventoryOrganizer());
        return roles;
    }
}
