/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Finance.Invoice;
import Business.Finance.Order;
import java.util.ArrayList;

/**
 *
 * @author vaibhavagarwal
 */
public class Customer {

    public enum InterestType {

        Adventure("Adventure"), Biking("Biking"), Books("Books"), Laptop("Laptop"), ZipCar("zipcar"),
        Cars("Cars"), Sports("Sports"), Travel("Travel"), Music("Music"), Grocery("Groceryitems"), Cosmetics("Cosmetics"),
        Furniture("Furniture"), Clothes("Clothes"), AlcoholicBeverages("AlcoholicBeverages"), HealthInsurance("HealthInsurance");

        private String value;

        private InterestType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    private String customername;
    private String interest1;
    private String interest2;
    private String interest3;
    private Cookie cookie;
    int clicks = 0;
    private ArrayList<Order> customerorders = new ArrayList<>();

    public void calcClicks() {
        this.clicks = clicks + 1;

    }

    public int getClicks() {
        return clicks;
    }

    public ArrayList<Order> getCustomerorders() {
        return customerorders;
    }

    public void setCustomerorders(ArrayList<Order> customerorders) {
        this.customerorders = customerorders;
    }

    public ArrayList<Invoice> getInvoicelistofcustomer() {
        return invoicelistofcustomer;
    }

    public void setInvoicelistofcustomer(ArrayList<Invoice> invoicelistofcustomer) {
        this.invoicelistofcustomer = invoicelistofcustomer;
    }
    private ArrayList<Invoice> invoicelistofcustomer = new ArrayList<>();

    public Cookie getCookie() {
        return cookie;
    }

    public void setCookie(Cookie cookie) {
        this.cookie = cookie;
    }

    public String getInterest1() {
        return interest1;
    }

    public void setInterest1(String interest1) {
        this.interest1 = interest1;
    }

    public String getInterest2() {
        return interest2;
    }

    public void setInterest2(String interest2) {
        this.interest2 = interest2;
    }

    public String getInterest3() {
        return interest3;
    }

    public void setInterest3(String interest3) {
        this.interest3 = interest3;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public void addinorderlist(Order order) {
        //customerorders=new ArrayList<>();
        customerorders.add(order);
        //return salespersonorders;
    }

    public void addinInvoiceList(Invoice invoice) {
        invoicelistofcustomer.add(invoice);
    }

    @Override
    public String toString() {
        return customername;
    }

}
