import java.io.Serializable;

/*
 * the process of persisting an object is termed as serialization
 * when an object needs to be serialized it must be of type Serializable interface
 * when a class object needs to be serialized , the class must implement Serializable interface
 * Serializable interface does not contain any method
 * it is a marker interface
 */
public class Customer implements Serializable{
	private int customerId;
	private String customerName;
	private String customerAddress;
	
	public Customer() {}

	public Customer(int customerId, String customerName, String customerAddress) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + "]";
	}
	
	
	
}

