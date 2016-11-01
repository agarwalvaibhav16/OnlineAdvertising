/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Publisher;
import Business.Role.UserRole;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Business.Customer.Customer.InterestType;
import Business.Network.Network;

/**
 *
 * @author vaibhavagarwal
 */
public class RegisterJPanel extends javax.swing.JPanel {

    private JPanel container;
    private EcoSystem system;
    int c = 0;
    private Customer customer;
    private UserAccount useraccount;

    /**
     * Creates new form RegisterJPanel
     */
    public RegisterJPanel(JPanel container, EcoSystem system) {
        initComponents();
        this.container = container;
        this.system = system;

        popNetworkComboBox();
        Network network = (Network) NetworkJComboBox.getSelectedItem();
        popPublisherComboBox(network);

    }

    public void popNetworkComboBox() {
        NetworkJComboBox.removeAllItems();
        for (Network n : system.getNetworkList()) {

            NetworkJComboBox.addItem(n);
        }

    }

    public void popPublisherComboBox(Network n) {
        PublisherJComboBox.removeAllItems();

        for (Enterprise enterprise : n.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise instanceof Publisher) {
                PublisherJComboBox.addItem(enterprise);
            }
        }

    }

    private void populateCombo1() {
        Interest1JCombobox.removeAllItems();
        for (InterestType type : Customer.InterestType.values()) {
            //System.out.println(type);
            //if (!type.getValue().equals(Type.Admin.getValue()))
            Interest1JCombobox.addItem(type);
        }
    }

    private void populateCombo2() {
        Interest2JCombobox.removeAllItems();
        for (InterestType type : Customer.InterestType.values()) {
            //System.out.println(type);
            //if (!type.getValue().equals(Type.Admin.getValue()))
            Interest2JCombobox.addItem(type);
        }
    }

    private void populateCombo3() {
        Interest3JCombobox.removeAllItems();
        for (InterestType type : Customer.InterestType.values()) {
            //System.out.println(type);
            //if (!type.getValue().equals(Type.Admin.getValue()))
            Interest3JCombobox.addItem(type);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CustomerNameJTextfield = new javax.swing.JTextField();
        SaveJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        UsernameJTextfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PasswordJPasswordField = new javax.swing.JPasswordField();
        PublisherJComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        SaveCustomerJbutton = new javax.swing.JButton();
        Interest1JCombobox = new javax.swing.JComboBox();
        Interest2JCombobox = new javax.swing.JComboBox();
        Interest3JCombobox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        NetworkJComboBox = new javax.swing.JComboBox();

        jLabel1.setText("Customer Name");

        jLabel2.setText("Interest 1");

        jLabel3.setText("Interest 2");

        jLabel4.setText("Interest3");

        SaveJButton.setText("Save");
        SaveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveJButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("User Name");

        jLabel6.setText("Password");

        PasswordJPasswordField.setText("jPasswordField1");

        PublisherJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Register with Website");

        SaveCustomerJbutton.setText("Save");
        SaveCustomerJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveCustomerJbuttonActionPerformed(evt);
            }
        });

        Interest1JCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Interest2JCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Interest3JCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Network");

        NetworkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        NetworkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetworkJComboBoxActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(81, 81, 81)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(jLabel4)
                            .add(jLabel2)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(SaveCustomerJbutton)
                                .add(layout.createSequentialGroup()
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(jLabel6)
                                        .add(jLabel1)
                                        .add(jLabel5)
                                        .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(PublisherJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(PasswordJPasswordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .add(CustomerNameJTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(UsernameJTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(NetworkJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(Interest2JCombobox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(Interest3JCombobox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, Interest1JCombobox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                    .add(layout.createSequentialGroup()
                        .add(172, 172, 172)
                        .add(SaveJButton)))
                .addContainerGap(461, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(NetworkJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(6, 6, 6)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(PublisherJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 47, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(CustomerNameJTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(37, 37, 37)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(UsernameJTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5))
                .add(43, 43, 43)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel6)
                    .add(PasswordJPasswordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(40, 40, 40)
                .add(SaveCustomerJbutton)
                .add(33, 33, 33)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel2)
                        .add(78, 78, 78)
                        .add(jLabel3)
                        .add(83, 83, 83)
                        .add(jLabel4))
                    .add(layout.createSequentialGroup()
                        .add(Interest1JCombobox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(67, 67, 67)
                        .add(Interest2JCombobox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(72, 72, 72)
                        .add(Interest3JCombobox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(61, 61, 61)
                .add(SaveJButton)
                .add(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SaveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveJButtonActionPerformed
        // TODO add your handling code here:

        InterestType type1 = (InterestType) Interest1JCombobox.getSelectedItem();
        InterestType type2 = (InterestType) Interest2JCombobox.getSelectedItem();
        InterestType type3 = (InterestType) Interest3JCombobox.getSelectedItem();

        customer.setInterest1(type1.getValue());
        customer.setInterest2(type2.getValue());
        customer.setInterest3(type3.getValue());
        useraccount.setCustomer(customer);
        //System.out.println(user.getCustomer().getInterest1());

        Enterprise enterprise = (Enterprise) PublisherJComboBox.getSelectedItem();
        // for(Enterprise enterprise:system.getEnterprisedir().getEnterpriseList())
        //{
        //if(enterprise instanceof Publisher)
        // {

        Publisher publisher = (Publisher) enterprise;
        publisher.getCustdir().addCustomer(customer);
        publisher.getUserAccountDirectory().getUserAccountList().add(useraccount);

            //}
        //System.out.println(c);

    }//GEN-LAST:event_SaveJButtonActionPerformed

    private void SaveCustomerJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveCustomerJbuttonActionPerformed
        // TODO add your handling code here:
        UserAccount user = new UserAccount();
        user.setUsername(UsernameJTextfield.getText());
        user.setPassword(PasswordJPasswordField.getText());
        user.setRole(new UserRole());
        this.useraccount = user;
        Customer cust = new Customer();
        cust.setCustomername(CustomerNameJTextfield.getText());
        this.customer = cust;
        populateCombo1();
        populateCombo2();
        populateCombo3();
    }//GEN-LAST:event_SaveCustomerJbuttonActionPerformed

    private void NetworkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetworkJComboBoxActionPerformed
        Network network = (Network) NetworkJComboBox.getSelectedItem();
        if(network!=null)
        popPublisherComboBox(network);
    }//GEN-LAST:event_NetworkJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CustomerNameJTextfield;
    private javax.swing.JComboBox Interest1JCombobox;
    private javax.swing.JComboBox Interest2JCombobox;
    private javax.swing.JComboBox Interest3JCombobox;
    private javax.swing.JComboBox NetworkJComboBox;
    private javax.swing.JPasswordField PasswordJPasswordField;
    private javax.swing.JComboBox PublisherJComboBox;
    private javax.swing.JButton SaveCustomerJbutton;
    private javax.swing.JButton SaveJButton;
    private javax.swing.JTextField UsernameJTextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}