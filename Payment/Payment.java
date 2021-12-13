package payment.payment;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PAYMENT")
public class Payment {
	
	    @Id
	    @GeneratedValue
	    private int paymentId;
	    private String paymentStatus;
	    private String txId;
	    private int orderId;
	    private double totalAmount;

	    public int getOrderId() {
	        return orderId;
	    }

	    public void setOrderId(int orderId) {
	        this.orderId = orderId;
	    }

	    public double getAmount() {
	        return totalAmount;
	    }

	    public void setAmount(double totalAmount) {
	        this.totalAmount = totalAmount;
	    }

	    public String getPaymentStatus() {
	        return paymentStatus;
	    }

	    public void setPaymentStatus(String paymentStatus) {
	        this.paymentStatus = paymentStatus;
	    }

	    public String getTxId() {
	        return txId;
	    }

	    public void setTxId(String txId) {
	        this.txId = txId;
	    }
}
