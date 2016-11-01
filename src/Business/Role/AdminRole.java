/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.EcoSystem;
import Business.Enterprise.AdExchangeEnterprise;
import Business.Enterprise.ProductCompany;
import Business.Enterprise.Publisher;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.EnterpriseAdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AdminRole extends Role{
    
    public AdminRole()
    {
        super(Role.RoleType.Admin.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        if(enterprise instanceof AdExchangeEnterprise)
        return new AdminWorkAreaJPanel(userProcessContainer,(AdExchangeEnterprise)enterprise);
        else if(enterprise instanceof ProductCompany)
         return new AdminWorkAreaJPanel(userProcessContainer,(ProductCompany)enterprise);
        return new AdminWorkAreaJPanel(userProcessContainer,(Publisher)enterprise);
             
         
    }

    
    
}
