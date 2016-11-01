/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Finance.FinancialAccount;
import Business.Finance.Invoice;
import Business.Finance.Order;
import Business.Role.FinanceManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class FinanceOrganization extends Organization{
     
    ArrayList<Invoice> listofinvoice =new ArrayList<>();
    ArrayList<Order> listoforders =new ArrayList<>();
    
    public ArrayList<Order> getListoforders() {
        return listoforders;
    }

    public void setListoforders(ArrayList<Order> listoforders) {
        this.listoforders = listoforders;
    }
    

    public ArrayList<Invoice> getListofinvoice() {
        return listofinvoice;
    }

    public void setListofinvoice(ArrayList<Invoice> listofinvoice) {
        this.listofinvoice = listofinvoice;
    }
    
    public void addininvoicelist(Invoice inv)
    {
        listofinvoice.add(inv);
    }
    
    public void addinorderlist(Order o)
    {
        listoforders.add(o);
    }
    
    public FinanceOrganization() {
        super(Organization.Type.FinanceOrganization.getValue());
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FinanceManagerRole());
        return roles;
    }
     
   
    
    
}
