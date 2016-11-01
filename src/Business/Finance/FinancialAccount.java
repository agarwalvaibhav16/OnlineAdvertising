/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Finance;

/**
 *
 * @author vaibhavagarwal
 */
public class FinancialAccount {

    private static int amount = 100000;
    private int creditamt;
    private int debitamt = 0;

    public int getCreditamt() {
        return creditamt;
    }

    public void setCreditamt(int creditamt) {
        this.creditamt = creditamt;
    }

    public int getDebitamt() {
        return debitamt;
    }

    public void setDebitamt(int debitamt) {
        this.debitamt = debitamt;
    }

    public int getAmount() {
        return amount;
    }

    public void calcAmount() {
        this.amount = this.amount + this.creditamt - this.debitamt;
    }

}
