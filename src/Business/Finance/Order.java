/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Finance;

import java.util.ArrayList;

/**
 *
 * @author vaibhavagarwal
 */
public class Order {
     public static int count=0;
    private ArrayList<OrderItem> ois=new ArrayList<>();
    private Invoice invoice;
    private int ordernum;
    /*private String orderdate;
    
  
    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }
    */
    
    public Order()
    {
        //non-static attribute and method can not  be called in static method 
        count++;
        ordernum=count;
        
        
    }

    public int getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(int ordernum) {
        this.ordernum = ordernum;
    }
    
    
    
   public OrderItem createorderitem()
    {
     OrderItem oi=new OrderItem();
     ois.add(oi);
     return oi;
    }

    public ArrayList<OrderItem> getOis() {
        return ois;    
    }
    
    public void setOis(ArrayList<OrderItem> ois) {
        this.ois = ois;
    }
    
    
    public Invoice createinvoice()
    {
        this.invoice=new Invoice();
        return invoice;
    }
    @Override
        public String toString()
        {
            return String.valueOf(ordernum);
        }
}
