/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.AdExchangeEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AdExchangeBiddersManager.BiddersManagerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vaibhavagarwal
 */
public class AdExchangeBiddersManager extends Role {
    public AdExchangeBiddersManager()
    {
        super(Role.RoleType.AdExchangeBiddersManager.getValue());
    }
  
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        
        return new BiddersManagerJPanel(userProcessContainer,enterprise,system);
             
         
    }
    
}
