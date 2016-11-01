/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.Customer;
import Business.Enterprise.Enterprise;
import Business.EcoSystem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    String rolename;

    public String getRolename() {
        return rolename;
    }
    
    public Role(String name)
    {
       this.rolename=name;
    }      
    
    public enum RoleType{
        Admin("Admin"),
        FinanceManager("Finance Manager"),
        User("User"),
        SystemAdminRole("System Admin"),
        AdExchangeBiddersManager("AdExchange Bidders Manager"),ProductManager("Products Manager"),AdInventoryOrganizer("AdInventory Organizer"),AdExchangePublishersManager("AdExchangePublisherManager"),
        AdExchangeFinanceManagerRole("Adexchange FinanaceManager Role"),ProdCompBidViewer("Product Company Bid Viewer"),PublisherSalesManager("PublisherSalesManager");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}