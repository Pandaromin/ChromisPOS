/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.chromis.pos.payment;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import uk.chromis.format.Formats;
import uk.chromis.pos.customers.CustomerInfoExt;
import uk.chromis.pos.forms.AppLocal;
import uk.chromis.pos.util.RoundUtils;
/**
 *
 * @author Earl Aromin
 * File is used to add a new payment method using the credit accumulated by customers.
 */
public class JPaymentCredit extends javax.swing.JPanel implements JPaymentInterface{

    @Override
    public void activate(CustomerInfoExt customerext, double dTotal, String transactionID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PaymentInfo executePayment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Component getComponent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
