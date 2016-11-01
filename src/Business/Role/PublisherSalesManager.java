/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.PublisherSales.PublisherSalesManagerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vaibhavagarwal
 */

    public class PublisherSalesManager extends Role{
   public PublisherSalesManager()
    {  super(Role.RoleType.PublisherSalesManager.getValue());
    
    }
   
   
   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) 
    {
        
        return new PublisherSalesManagerJPanel(userProcessContainer,enterprise);
             
         
    }
}
