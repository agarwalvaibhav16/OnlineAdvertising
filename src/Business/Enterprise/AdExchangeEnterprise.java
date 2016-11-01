/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Bidding.Bid;
import Business.Customer.Customer;
import Business.Finance.FinancialAccount;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author raunak
 */
public class AdExchangeEnterprise extends Enterprise {

    private FinancialAccount fa;
    String s = "Winner";

    public FinancialAccount getFa() {
        return fa;
    }

    public void setFa(FinancialAccount fa) {
        this.fa = fa;
    }
    ArrayList<ProductCompany> productcompanies = new ArrayList<>();
    ArrayList<ProductCompany> bidderslist = new ArrayList<>();

    ArrayList<Publisher> publishers = new ArrayList<>();

    int t = 0;
    ArrayList<Bid> bidlist = new ArrayList<>();

    public ArrayList<Bid> getBidlist() {
        return bidlist;
    }

    public void setBidlist(ArrayList<Bid> bidlist) {
        this.bidlist = bidlist;
    }
    Bid maxbid = null;
    Bid temp = null;
    ProductCompany highestbidder = null;
    public static int i = 0;
    int k = 0;
    int j = 0;

    public ArrayList<ProductCompany> getBidderslist() {
        return bidderslist;
    }

    public ArrayList<ProductCompany> getProductcompanies() {
        return productcompanies;
    }

    public void addPublisher(Publisher pub) {
        publishers.add(pub);
    }

    public void addProductCompany(ProductCompany p) {
        productcompanies.add(p);
    }

    public ArrayList<Publisher> getPublishers() {
        return publishers;
    }

    public AdExchangeEnterprise(String name) {
        super(name, EnterpriseType.ADEXCHANGE);
    }

    public void highestbidtoPublisher(Enterprise e) {
        for (ProductCompany p : bidderslist) {
            if (p == null) {
                bidderslist.remove(p);
                continue;
            }
        }
        for (ProductCompany p : bidderslist) {
            if (p == null||p.getBid()==null) {
                continue;
            }
            System.out.println("P.getBid: "+p.getBid().getBidvalue());
            System.out.println("getmaxbid().getBidvalue(): "+getmaxbid().getBidvalue());
            if (p.getBid().getBidvalue()==getmaxbid().getBidvalue()) {
                //p.setBidstatus("Winner");
                this.highestbidder = p;
                //winners.add(p);

                break;
            }
        }

        
        Publisher pub = (Publisher) e;
        pub.addHighestBidder(highestbidder);
        if(highestbidder==null)
            return;
        System.out.println("highest bidder is"+highestbidder.getName());
        this.bidlist.removeAll(this.bidlist);

    }

    public void identifybiddfers() {//bidding decision is set based on budget and customer profile

        //bidderslist.removeAll(bidderslist);
        for (ProductCompany prodcomp : this.productcompanies) //while(!prodcomp.getBiddecision().equals("Outbid"))
        {
//            if ((prodcomp.getBiddecision().equals("interested")) && (prodcomp.getBidstatus() != "Winner")) {
//                bidderslist.add(prodcomp);
//
//            }

            if ((prodcomp.getBiddecision().equals("interested"))) {
                bidderslist.add(prodcomp);

            }

        }

//        if (bidderslist.isEmpty()) {
//            JOptionPane.showConfirmDialog(null, "Advertisers have too low budgets.Log in Again", "Warning", JOptionPane.YES_NO_OPTION);
//        }
//
//        return;
    }

    public void takebiddecision(Customer customer, int minimumbid) {

        for (ProductCompany prodcomp : this.productcompanies) {
            //if (!prodcomp.getBidstatus().equals("Winner") ){ //System.out.println("Winner was"+prodcomp.getName());
            System.out.println("takebiddecision");
            System.out.println("product company is"+prodcomp.getName());
            prodcomp.setBiddecision(customer, minimumbid);

            //}
            //else {
            //  System.out.println("Winner was" + prodcomp.getName());
            //}
        }

        identifybiddfers();
    }

    public Bid getmaxbid() {
        Bid maxbid = bidlist.get(0);
        for (Bid b : bidlist) {
            if (b.getBidvalue() > maxbid.getBidvalue()) {
                maxbid = b;
            }
        }

        return maxbid;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public void takebidfromAdvertiser(Customer customer, int minimumbid) {

        for (ProductCompany p : bidderslist) {
            Bid b = p.getBid(customer, minimumbid);
            System.out.println(p.getName()+"bid is"+b.getBidvalue());
            this.bidlist.add(b);
        }

    }

    //    public void sendrequest(Customer customer, int minimumbid) {
//        i = i + 1;
//
//        bidlist.removeAll(bidlist);
//
//        for (int i = 0; i < bidderslist.size(); i++) {
//            ProductCompany prodcomp = bidderslist.get(i);
//
//            if (prodcomp.getK() != 1) {
//                Bid b = prodcomp.getbid(minimumbid);     //asking for bids from all the companies who were interested in bidding
//                if (b == null && bidderslist.size() > 1) {
//                    prodcomp.setK(1);
//                    bidderslist.remove(prodcomp);
//
//                    sendrequest(customer, minimumbid);
//                    if (bidderslist.size() == 1) {
//                        return;
//                    }
//                } //bidderslist.add(prodcomp);
//                else {
//                    bidlist.add(b);
//
//                    //temp=b;
//                }
//            }
//
//        }
//
//        maxbid = getmaxbid();
//        ProductCompany.highestbid = maxbid.getStartbidvalue();
//
//        if (bidderslist.size() != 1) {
//            sendrequest(customer, minimumbid);
//        }
//
//        if (bidderslist.size() == 1) {
//            bidderslist.get(0).setBidstatus("Winner");
//        }
//
//    }

    /*
     @Override
     public String toString()
     {
     return EnterpriseType.ADEXCHANGE.getType();
     } 
     */
}
