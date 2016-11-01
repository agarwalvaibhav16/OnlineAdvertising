/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.ProductCompanyProductManager.ManageProductsJPanel;
import UserInterface.ProductCompanyProductManager.ProductManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vaibhavagarwal
 */
public class ProductManager extends Role {
    public ProductManager()
    {  super(Role.RoleType.ProductManager.getValue());
    }
    
    
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) 
    {
        
        return new ProductManagerWorkAreaJPanel(userProcessContainer,enterprise,system);
             
         
    }
}
