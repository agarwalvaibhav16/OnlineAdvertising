/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Bidding.Bid;
import Business.Customer.Customer;
import Business.Finance.FinancialAccount;
import Business.Product.Product;
import Business.Product.ProductDirectory;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author vaibhavagarwal
 */
public class ProductCompany extends Enterprise {

    int clicksbycustomer = 0;
    private ProductDirectory proddir;
    private FinancialAccount fa;
    private Product advertisedproduct;
    private int noofclicks = 0;
    private ArrayList<Customer> listofcustomers = new ArrayList<>();
    private Bid bid;
    private String biddecision;
    private int maximumbudget;
    int targetmatches = 0;
    private int inc = 0;

    public ArrayList<Customer> getListofcustomers() {
        return listofcustomers;
    }

    public void setListofcustomers(ArrayList<Customer> listofcustomers) {
        this.listofcustomers = listofcustomers;
    }

    public void addcustomer(Customer c) {
        this.listofcustomers.add(c);
    }

    public int calNoofclicks() {
        this.noofclicks = noofclicks + 1;
        return noofclicks;
    }

    public int getNoofclicks() {
        return noofclicks;
    }

    public Product getAdvertisedproduct() {
        return advertisedproduct;
    }

    public void setAdvertisedproduct(Product advertisedproduct) {
        this.advertisedproduct = advertisedproduct;
    }

    public FinancialAccount getFa() {
        return fa;
    }

    public void setFa(FinancialAccount fa) {
        this.fa = fa;
    }
    private int balance = 100000;

    public int getBal() {
        return balance;
    }

    public void setBal(int bal) {
        this.balance = this.balance + bal;

    }

    public int getMaximumbudget() {
        return maximumbudget;
    }

    public Bid getBid() {
        return bid;
    }

    public void setBid(Bid bid) {
        this.bid = bid;
    }
    private int k = 0;
    ;
    static int oldtargetvalue = 0;

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getTargetmatches() {
        return targetmatches;
    }

    public String getBidstatus() {
        return bidstatus;
    }

    public void setBidstatus(String bidstatus) {
        this.bidstatus = bidstatus;
    }
    private String bidstatus;
    int i = 0;

    public static int j = 0;

    public static int highestbid;

    public String getBiddecision() {
        return biddecision;
    }

    public void setBiddecision(Customer cust, int min) {

        //this.bidstatus = null;
        this.bid = null;
        this.biddecision = null;
        this.bidstatus = null;
        this.k = 0;
        //this.maximumbudget = 0;
        this.targetmatches = 0;

        for (Product p : proddir.getProductlist()) {
            if (cust.getInterest1().equals(p.getCategory()) || cust.getInterest2().equals(p.getCategory())
                    || cust.getInterest3().equals(p.getCategory())) { // customers interests are matched with the products in the porodcutcompany
                this.targetmatches = targetmatches + 1;              //it will count the number of products that match with customer's interests
            }
        }

        //setmaximumbudget(targetmatches, min, cust); //now maximum budget will be set by the product company
//        if (min < this.maximumbudget && this.targetmatches > 0) {
//            this.biddecision = "interested";
//            setincvalue(this.targetmatches);
//            i = i + 1;
//            //targetmatches=targetmatches+1;
//
//        } else {
//            this.biddecision = "notinterested";
//
//        }
        System.out.println("This is my balance" + this.balance);
        System.out.println("This is the minimum bid" + min);
        System.out.println("target matches" + targetmatches);
        if (min < this.balance && this.targetmatches > 0) {
            this.biddecision = "interested";
            System.out.println("I am interested in bidding");
            //setincvalue(this.targetmatches);
            //i = i + 1;
            //targetmatches=targetmatches+1;

        } else {
            this.biddecision = "notinterested";
            System.out.println("I am not interested in bidding");

        }

//        oldtargetvalue = targetmatches;
//        targetmatches = 0;
    }

    public ProductCompany(String name) {
        super(name, EnterpriseType.PRODUCTCOMPANY);
        this.proddir = new ProductDirectory();

    }

    public ProductDirectory getProddir() {
        return proddir;
    }

    public Bid getBid(Customer customer, int minimumbid) {
        Bid bid1 = new Bid();
        Random random = new Random();
        int val = random.nextInt((this.balance - minimumbid) + 1) + minimumbid;
        bid1.setBidvalue(val);
        if (bid == null || bid.getBidvalue() < bid1.getBidvalue()) {
            setBid(bid1);
        }
        return bid1;
    }

//    public Bid getbid(int minbid) {   //for(Product p:proddir.getProductlist())
//
//        if (this.bid == null) {   //this will be visited only once
//            Bid bid1 = new Bid();
//            bid1.setBidmaxvalue(this.maximumbudget);
//            bid1.setStartbidvalue(minbid + inc);
//            System.out.println("Starting bid is" + bid1.getStartbidvalue() + "Product company is" + this.getName());
//
//            bid1.setProductcompanyname(this.getName());
//            this.bid = bid1;
//            j = j + 1;
//            return bid;
//        } else if (highestbid <= this.bid.getBidmaxvalue() && this.bid != null) //when bid for this prod comp has been given earlier
//        {
//
//            this.bid.setStartbidvalue(highestbid + this.inc);
//
//            j = j + 1;
//            return bid;
//        } else if (highestbid > this.bid.getBidmaxvalue()) {
//            j = 0;
//            this.bidstatus = "Outbid";
//            return null;
//        }
//        return null;
//
//        //return null;
//    }
//    public void setmaximumbudget(int t, int m, Customer c) {
//        //this.maximumbudget = (int) (Math.random() * 10000);
//
//        if (t > 0) {
//            this.maximumbudget = m + t * 1000;
//        } //this.maximumbudget = (int) (Math.random() * 10000);
//        else {
//            this.maximumbudget = 0;
//        }
//
//    }
//    public void setincvalue(int tv) {
//
//        this.inc = tv * 100;
//    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    /// may have to modify it
   /*@Override
     public String toString()
     {
     return EnterpriseType.PRODUCTCOMPANY.getType();
     }
     */
    public boolean equals(ProductCompany p2) {
        return (this.getName().equals(p2.getName()));
    }
}
