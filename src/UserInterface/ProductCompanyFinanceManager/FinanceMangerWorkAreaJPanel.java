/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ProductCompanyFinanceManager;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ProductCompany;
import Business.Organization.FinanceOrganization;
import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author vaibhavagarwal
 */
public class FinanceMangerWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel container;
//private UserAccount account;
    private FinanceOrganization organization;
    private ProductCompany pc;
   // private EcoSystem system; 
    /**
     * Creates new form FinanceMangerWorkAreaJPanel
     */
    public FinanceMangerWorkAreaJPanel(JPanel container,Organization organization,Enterprise enterprise) {
        initComponents();
        this.container=container;
        this.organization=(FinanceOrganization)organization;
        this.pc=(ProductCompany)enterprise;
        
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ViewOrdersJButton = new javax.swing.JButton();
        ViewInvoiceJbutton = new javax.swing.JButton();
        ViewBalanceJbutton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Finance Role");

        ViewOrdersJButton.setText("View Orders");
        ViewOrdersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewOrdersJButtonActionPerformed(evt);
            }
        });

        ViewInvoiceJbutton.setText("View Invoice");
        ViewInvoiceJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewInvoiceJbuttonActionPerformed(evt);
            }
        });

        ViewBalanceJbutton.setText("View Balance");
        ViewBalanceJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBalanceJbuttonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(147, 147, 147)
                        .add(jLabel1))
                    .add(layout.createSequentialGroup()
                        .add(220, 220, 220)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(ViewInvoiceJbutton)
                            .add(ViewOrdersJButton)
                            .add(ViewBalanceJbutton))))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(40, 40, 40)
                .add(jLabel1)
                .add(61, 61, 61)
                .add(ViewOrdersJButton)
                .add(42, 42, 42)
                .add(ViewInvoiceJbutton)
                .add(42, 42, 42)
                .add(ViewBalanceJbutton)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ViewOrdersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewOrdersJButtonActionPerformed
        // TODO add your handling code here:
         ViewOrdersJPanel vojp = new ViewOrdersJPanel(container,organization);
        container.add("View Orders JPanel",vojp);

        CardLayout layout = (CardLayout)container.getLayout();
        layout.next(container);
        
        
    }//GEN-LAST:event_ViewOrdersJButtonActionPerformed

    private void ViewInvoiceJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewInvoiceJbuttonActionPerformed
        // TODO add your handling code here:
        ViewInvoiceJPanel vijp = new ViewInvoiceJPanel(container,organization);
        container.add("View Invoice JPanel",vijp);

        CardLayout layout = (CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_ViewInvoiceJbuttonActionPerformed

    private void ViewBalanceJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBalanceJbuttonActionPerformed
        // TODO add your handling code here:
        ViewBalanceJPanel vbjp = new ViewBalanceJPanel(container,organization,pc);
        container.add("View Balance JPanel",vbjp);

        CardLayout layout = (CardLayout)container.getLayout();
        layout.next(container);
        
        
    }//GEN-LAST:event_ViewBalanceJbuttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewBalanceJbutton;
    private javax.swing.JButton ViewInvoiceJbutton;
    private javax.swing.JButton ViewOrdersJButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}