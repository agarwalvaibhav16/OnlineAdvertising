/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Publisher;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.user.AdSpaceJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vaibhavagarwal
 */
public class UserRole extends Role {
    public UserRole()
    {
        super(Role.RoleType.User.getValue());
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AdSpaceJPanel(userProcessContainer,account,(Publisher)enterprise);
    }
    
    
}
