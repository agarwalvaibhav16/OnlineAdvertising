/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Ad.AdImpression;
import Business.Ad.AdInventory;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vaibhavagarwal
 */
public class Publisher extends Enterprise {

    private CustomerDirectory custdir;
    ArrayList<ProductCompany> winners = new ArrayList<>();
    ProductCompany winner;
   // private int minimumbid;
    private int setstartingbid;
    
  
    private AdInventory adinventory;
    private static int  credits = 0;
    
   

    public static int creditvalue;
     public static int creditscore= 0;
    public ArrayList<ProductCompany> getWinners() {
        return this.winners;
    }

    public void setWinners(ArrayList<ProductCompany> winners) {
        this.winners = winners;
    }

    public AdInventory getAdinventory() {
        return adinventory;
    }

    public void setAdinventory(AdInventory adinventory) {
        this.adinventory = adinventory;
    }

//    public ProductCompany getHighestBidder() {
//        return winner;
//    }

    public CustomerDirectory getCustdir() {
        return custdir;
    }

    public Publisher(String name) {
        super(name, EnterpriseType.PUBLISHER);
        this.custdir = new CustomerDirectory();
        this.adinventory = new AdInventory();
    }

    public void addHighestBidder(ProductCompany prodcomp) {
        this.winners.add(prodcomp);      
    }

   public int getminimumbidamount() {
       return this.setstartingbid;
    }
   
   public void setstartBid(int n)
   {
       this.setstartingbid=n;
   }
    public void setminimumBidamount(Customer cust, AdImpression adimp) {
        //this.setstartingbid = 1000;
        creditvalue=2000;
        creditscore=0;
        credits=0;
        if (cust.getCookie().getNoofvisits() == 4 || (adimp.getHeight() >= 300 && adimp.getHeight() < 400) || (adimp.getWidth() >= 300 && adimp.getWidth() < 400) || adimp.getImpressionno() == 1) {
            credits = 4;
            creditscore = creditscore + credits;
            
             //System.out.println("Minimum bid is "+this.setstartingbid);
        }
        if (cust.getCookie().getNoofvisits() == 3 || (adimp.getHeight() >= 200 && adimp.getHeight() < 300) || (adimp.getWidth() >= 200 && adimp.getWidth() < 300) || adimp.getImpressionno() == 2) {
            credits = 3;
            creditscore = creditscore + credits;
             //System.out.println("Minimum bid is "+this.setstartingbid);
        }
        if (cust.getCookie().getNoofvisits() == 2 || (adimp.getHeight() >= 100 && adimp.getHeight() < 200) || (adimp.getWidth() >= 100 && adimp.getWidth() < 200) || adimp.getImpressionno() == 3) {
            credits = 2;
            creditscore = creditscore + credits;
             //System.out.println("Minimum bid is "+this.setstartingbid);
        }
        if (cust.getCookie().getNoofvisits() == 1 || (adimp.getHeight() >= 0 && adimp.getHeight() < 100) || (adimp.getWidth() >= 0 && adimp.getWidth() < 100) || adimp.getImpressionno() == 4) {
            credits = 1;
            creditscore = creditscore + credits;
           
       
        }
        
        setstartBid(creditscore * this.creditvalue);
      

        

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
