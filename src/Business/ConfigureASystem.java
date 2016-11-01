/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Ad.AdImpression;
import Business.Employee.Employee;
import Business.Enterprise.AdExchangeEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ProductCompany;
import Business.Enterprise.Publisher;
import Business.Network.Network;
import Business.Product.Product;
import Business.Role.AdminRole;

import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author raunak
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();  //Creating sysstemadmin account

        Employee employee = new Employee();
        employee.setName("Raunak Agarwal");

        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("sysadmin");
        userAccount.setPassword("sysadmin");
        userAccount.setEmployee(employee);
        userAccount.setRole(new SystemAdminRole());
        system.getUserAccountDirectory().getUserAccountList().add(userAccount);//adding systemadmin account to system useraccount dir
       /*
         Enterprise e1=new Publisher("Facebook");    //Creating 3 types of enterprises and adding them in enterprise dir of system
         Enterprise e2=new Publisher("Ebay");
         Enterprise e3=new Publisher("amazon");
         Enterprise e4=new AdExchangeEnterprise("Adwords");
         Enterprise e5=new ProductCompany("HP");
         Enterprise e6=new ProductCompany("Dell");
         Enterprise e7=new ProductCompany("Reebok");
         Network n1=new Network();
         system.getNetworkList().add(n1);
         n1.getEnterpriseDirectory().getEnterpriseList().add(e1);
         n1.getEnterpriseDirectory().getEnterpriseList().add(e2);
         n1.getEnterpriseDirectory().getEnterpriseList().add(e3);
         //syste.getEnterprisedir().getEnterpriseList().add(e4);
         // system.getEnterprisedir().getEnterpriseList().add(e5);
         //system.getEnterprisedir().getEnterpriseList().add(e6);
         //system.getEnterprisedir().getEnterpriseList().add(e7);
         Employee employee1 = new Employee();  //creating admin account  for AdExchange
         employee1.setName("Vaibhav Agarwal");
         UserAccount u1 = new UserAccount();
         u1.setUsername("ad");
         u1.setPassword("ad");
         u1.setEmployee(employee);
         u1.setRole(new AdminRole());
         e4.getUserAccountDirectory().getUserAccountList().add(u1);//adding AdExchange admin account to its useraccount dir
         e4.getEmployeeDirectory().getEmployeeList().add(employee1);//adding admin employee to the employee dir of AdExchange
         AdExchangeEnterprise ad1=(AdExchangeEnterprise)e4;
         ad1.getPublishers().add((Publisher)e1);   //Adding publishers to the AdExchange
         ad1.getPublishers().add((Publisher)e2);
         ad1.getPublishers().add((Publisher)e3);
         ad1.getProductcompanies().add((ProductCompany)e5);//Adding product Companies to the AdExchange
         ad1.getProductcompanies().add((ProductCompany)e6);
         ad1.getProductcompanies().add((ProductCompany)e7);
        
         //Add products to the product companies
         ProductCompany p1=(ProductCompany)e5; //for HP
         ProductCompany p2=(ProductCompany)e6; // for Dell
         ProductCompany p3=(ProductCompany)e7; // for Reebok
       
         Product pr1=new Product(); 
         pr1.setName("Ultra Book");
         pr1.setPrice(Integer.parseInt("1500"));
         pr1.setCategory("Laptop");
         pr1.setPhoto("/Users/vaibhavagarwal/Pictures/ultrabook.jpg");
         Product pr2=new Product();
         pr2.setName("Tablet");
         pr2.setPrice(Integer.parseInt("2500"));
         pr2.setCategory("Laptop");
         pr2.setPhoto("/Users/vaibhavagarwal/Pictures/tablet.jpg");
         Product pr3=new Product();
         pr3.setName("Yoga Book");
         pr3.setPrice(Integer.parseInt("3500"));
         pr3.setCategory("Laptop");
         pr3.setPhoto("/Users/vaibhavagarwal/Pictures/yogabook.jpg"); 
         Product pr4=new Product();
         pr4.setName("Cricket Bat");
         pr4.setPrice(Integer.parseInt("1500"));
         pr4.setCategory("Sports");
         pr4.setPhoto("/Users/vaibhavagarwal/Pictures/bat.jpg");
         p1.getProddir().getProductlist().add(pr1);
         p1.getProddir().getProductlist().add(pr2);
         p2.getProddir().getProductlist().add(pr3);
         p3.getProddir().getProductlist().add(pr4);
        
        
         //setting the bid ranges for few Product companies,for others it will be done after logging in
         /* p1.setMaximumbudget(6800);
         p2.setMaximumbudget(5900);
         p3.setMaximumbudget(6500);/*
        
         Publisher pub1=(Publisher)e1;
         pub1.setPhotopath("/Users/vaibhavagarwal/Pictures/facebook-icon.jpg");
         Publisher pub2=(Publisher)e2;
         pub2.setPhotopath("/Users/vaibhavagarwal/Pictures/Ebay-icon.png");
         Publisher pub3=(Publisher)e3;
         pub3.setPhotopath("/Users/vaibhavagarwal/Pictures/amazon-icon.jpg");
        
        
         AdImpression ai1=new AdImpression();
         ai1.setImpressionno(1);
         ai1.setHeight(100);
         ai1.setWidth(200);
         pub1.getAdinventory().getImpressions().add(ai1);
        
         AdImpression ai2=new AdImpression();
         ai2.setImpressionno(2);
         ai2.setHeight(100);
         ai2.setWidth(250);
         pub1.getAdinventory().getImpressions().add(ai2);
         */

        return system;
    }
}
