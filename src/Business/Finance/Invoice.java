/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Finance;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author vaibhavagarwal
 */
public class Invoice {

    private String Decription;
    private int invoiceno;
    private String dategenereted;
    private int amountdue;
    private String invoicestatus;
    //private static int dueday=10;
    public static int count = 1;
    /*DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
     java.util.Date date= new java.util.Date();
     private String dategenereted=dateFormat.format(date);*/

    /* public int getDueday() {
     return dueday;
     }
     */
    public String getInvoicestatus() {
        return invoicestatus;
    }

    public void setInvoicestatus(String invoicestatus) {
        this.invoicestatus = invoicestatus;
    }

    public Invoice() {
        invoiceno = count++;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        java.util.Date date = new java.util.Date();
        this.dategenereted = dateFormat.format(date);

    }

    public String getDecription() {
        return Decription;
    }

    public void setDecription(String Decription) {
        this.Decription = Decription;
    }

    /*public int getInvoiceno() {
     return invoiceno;
     }

     public void setInvoiceno(int invoiceno) {
     this.invoiceno = invoiceno;
     }
     */
    public String getDategenereted() {
        return dategenereted;
    }

    public void setDategenereted(String dategenereted) {
        this.dategenereted = dategenereted;
    }

    public int getAmountdue() {
        return amountdue;
    }

    public void setAmountdue(int amountdue) {
        this.amountdue = amountdue;
    }

    @Override
    public String toString() {
        return String.valueOf(invoiceno);
    }

}
