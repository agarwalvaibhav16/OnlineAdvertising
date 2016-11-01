/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

/**
 *
 * @author vaibhavagarwal
 */
public class Product {
    
    private String category;
    private int price;
    private String name;
    private String photo;
     public enum ProductType
   {   Adventure("Adventure"),Biking("Biking"),Books("Books"),Laptop("Laptop"),ZipCar("zipcar"),
       Cars("Cars"),Sports("Sports"),Travel("Travel"),Music("Music"),Grocery("Groceryitems"),Cosmetics("Cosmetics"),
       Furniture("Furniture"),Clothes("Clothes"),AlcoholicBeverages("AlcoholicBeverages"),HealthInsurance("HealthInsurance");
       
       
        private String value;
        private ProductType(String value){
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
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString()
    {
        return name;
        
    }
    
    
}
