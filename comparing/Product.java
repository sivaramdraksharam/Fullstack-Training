package comparing;

public class Product<T> implements Comparable{
	private T  obj;
	private long serialNumber;
	private int price;
	private String model;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	Product()
	{
		this.obj=obj;
	}
	
	public void setProduct(T obj)
	{
		this.obj=obj;
	}
	
	public T getProduct()
	{
		return obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public int compareTo(Object newproduct) {
		// TODO Auto-generated method stub
		
		Product<T> newProduct=(Product<T>) newproduct;
		
		if(this.getModel().equals(newProduct.getModel()) && this.getSerialNumber()==this.getSerialNumber() && this.getObj().equals(newProduct.getObj()))
			
			return 1;
		else
			return 0;
	}
	
	

}
