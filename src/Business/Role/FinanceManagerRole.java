/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.ProductCompanyFinanceManager.FinanceMangerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vaibhavagarwal
 */
public class FinanceManagerRole extends Role {
    
    public FinanceManagerRole()
    {
       super(Role.RoleType.FinanceManager.getValue());
    }
    
    
    
    
    
    
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) 
    {
        
        return new FinanceMangerWorkAreaJPanel(userProcessContainer,organization,enterprise);
             
         
    }
}

