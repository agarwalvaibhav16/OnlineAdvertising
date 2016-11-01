/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import java.util.ArrayList;

/**
 *
 * @author vaibhavagarwal
 */
public class ProductDirectory {
    ArrayList<Product> productlist =new ArrayList<>();

    public ArrayList<Product> getProductlist() {
        return productlist;
    }

    public void setProductlist(ArrayList<Product> productlist) {
        this.productlist = productlist;
    }
    
    public Product createandaddProduct()
    {  Product p=new Product();
       productlist.add(p);
       return p;
    }
            
    
}
