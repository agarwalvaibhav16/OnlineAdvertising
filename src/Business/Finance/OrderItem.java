/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Finance;

import Business.Ad.AdImpression;
import Business.Product.Product;

/**
 *
 * @author vaibhavagarwal
 */
public class OrderItem {
  private int quantity;
    private Product product;
   private AdImpression adimp;

    public AdImpression getAdimp() {
        return adimp;
    }

    public void setAdimp(AdImpression adimp) {
        this.adimp = adimp;
    }
   
    private int totalquantity=0;
 
    
    public OrderItem()
    {
        totalquantity=totalquantity + this.quantity;
    }
    
            

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    @Override
    public String toString()
    {
        return product.toString();
    }  
}
