/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.PublisherSales.getValue())){
            organization = new PublisherSales();
            organizationList.add(organization);
        }
        
         if (type.getValue().equals(Type.ProductCompaniesSelection.getValue())){
            organization = new ProductCompaniesManagement();
            organizationList.add(organization);
        }
         else if(type.getValue().equals(Type.PublishersManagement.getValue()))
         {
           organization = new PublishersManagement();
            organizationList.add(organization);  
         }
        else if (type.getValue().equals(Type.FinanceOrganization.getValue())){
            organization = new FinanceOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.AdInventoryManagementOrganization.getValue())){
            organization = new AdInventoryManagementOrganization(); 
            organizationList.add(organization);
         }
        
         else if(type.getValue().equals(Type.CustomerOrganization.getValue()))
         {
             organization=new CustomerOrganization();
             organizationList.add(organization);
         }
         else if(type.getValue().equals(Type.ManageProducts.getValue()))
         {
             organization=new ManageProducts();
             organizationList.add(organization);
         }
          else if(type.getValue().equals(Type.AdexchangeFinanceOrganization.getValue()))
         {
             organization=new AdexchangeFinanceOrganization();
             organizationList.add(organization);
         }
         else if(type.getValue().equals(Type.ProductCompanyBidViewerOrganization.getValue()))
         {
             organization=new ProductCompanyBidViewerOrganization();
             organizationList.add(organization);
         }
        return organization;
    }
}