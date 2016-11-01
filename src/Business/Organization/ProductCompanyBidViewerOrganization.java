/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import Business.Role.ProdCompBidViewer;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vaibhavagarwal
 */
public class ProductCompanyBidViewerOrganization extends Organization{
     public ProductCompanyBidViewerOrganization() {
        super(Type.ProductCompanyBidViewerOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProdCompBidViewer());
        return roles;
    }
}
