/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.ProductCompanyBidTracker.ProductCompanyBidViewerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vaibhavagarwal
 */
public class ProdCompBidViewer  extends Role{
   public ProdCompBidViewer()
    {  super(Role.RoleType.ProdCompBidViewer.getValue());
    
    }
   
   
   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) 
    {
        
        return new ProductCompanyBidViewerJPanel(userProcessContainer,enterprise);
             
         
    }
}
