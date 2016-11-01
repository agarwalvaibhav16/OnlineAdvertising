/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author vaibhavagarwal
 */
public class Cookie {

    private static int noofvisits = 0;
  //private String publishername;

    public Cookie() {
        this.noofvisits = noofvisits + 1;
    }

    public int getNoofvisits() {
        return noofvisits;
    }

    public void setNoofvisits(int noofvisits) {
        this.noofvisits = noofvisits;
    }

    /*public String getPublishername() {
     return publishername;
     }

     public void setPublishername(String publishername) {
     this.publishername = publishername;
     }
     */
}
