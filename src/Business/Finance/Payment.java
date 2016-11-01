/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Finance;

/**
 *
 * @author vaibhavagarwal
 */
public class Payment {
   // public static final ArrayList<> CATEGORIES=()
           
    public static final String CREDITCARD="creditcard";
    public static final String DEBITCARD="debitcard";
    public static final String TRAVELCARD="travelcard";
    private String Bankcreditcardinfo;
    private String Bankdebitcardinfo;
    private int creditcardno;
    private int ccpinno;
    private int debitcardno;
    private int dcpinno;
    private String Banktravelcardinfo;
    private int travelcardno;

    public String getBanktravelcardinfo() {
        return Banktravelcardinfo;
    }

    public void setBanktravelcardinfo(String Banktravelcardinfo) {
        this.Banktravelcardinfo = Banktravelcardinfo;
    }

    public int getTravelcardno() {
        return travelcardno;
    }

    public void setTravelcardno(int travelcardno) {
        this.travelcardno = travelcardno;
    }

    public int getTcpinno() {
        return tcpinno;
    }

    public void setTcpinno(int tcpinno) {
        this.tcpinno = tcpinno;
    }
    private int tcpinno;

    public String getBankcreditcardinfo() {
        return Bankcreditcardinfo;
    }

    public void setBankcreditcardinfo(String Bankcreditcardinfo) {
        this.Bankcreditcardinfo = Bankcreditcardinfo;
    }

    public String getBankdebitcardinfo() {
        return Bankdebitcardinfo;
    }

    public void setBankdebitcardinfo(String Bankdebitcardinfo) {
        this.Bankdebitcardinfo = Bankdebitcardinfo;
    }

    public int getCreditcardno() {
        return creditcardno;
    }

    public void setCreditcardno(int creditcardno) {
        this.creditcardno = creditcardno;
    }

    public int getCcpinno() {
        return ccpinno;
    }

    public void setCcpinno(int ccpinno) {
        this.ccpinno = ccpinno;
    }

    public int getDebitcardno() {
        return debitcardno;
    }

    public void setDebitcardno(int debitcardno) {
        this.debitcardno = debitcardno;
    }

    public int getDcpinno() {
        return dcpinno;
    }

    public void setDcpinno(int dcpinno) {
        this.dcpinno = dcpinno;
    }
    
    
}
