package mycollections;

public class Customer implements Comparable<Customer> {
	private String customerName;
	private String customerPhone;
	private int customerID;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerPhone=" + customerPhone + ", customerID="
				+ customerID + "]";
	}
	@Override
	public int compareTo(Customer c) {
		if(c.getCustomerID()==this.customerID && c.getCustomerName().equals(this.customerName) && c.getCustomerPhone().equals(this.customerPhone))
				return 1;
		else
		       return 0;
	}
	
	
	//study java.util.Comparator
	

}
