package javabasics;

//bean
public class Car  extends Vehicle{
	//private instance variables
	private String carModel;
	private String carNumber;
	private String carName;
	private Fuel fuelType;
	
	
	//no-arg constructor
	public Car() {
		super();
		super.vehicleID=carNumber;
		fuelType=Fuel.PETROL;
		
	}
	//constructor overloading
	public Car(String carModel, String carNumber, String carName) {
		super();
		this.carModel = carModel;
		this.carNumber = carNumber;
		this.carName = carName;
	}
	public Car(String carModel, String carNumber, String carName, Fuel fuelType) {
		super();
		this.carModel = carModel;
		this.carNumber = carNumber;
		this.carName = carName;
		this.fuelType = fuelType;
	}
	
	
	
	
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Fuel getFuelType() {
		return fuelType;
	}
	public void setFuelType(Fuel fuelType) {
		this.fuelType = fuelType;
	}
	public static void showCardetails(Car c) {
		System.out.println("Car Number:"+c.getCarNumber());
		System.out.println("Name:"+c.getCarName());
		System.out.println("Model"+c.getCarModel());
		System.out.println("It uses "+c.getFuelType()+" as fuel");
	}
	@Override
	public String toString() {
		return "Car [carModel=" + carModel + ", carNumber=" + super.vehicleID + ", carName=" + carName + ", fuelType="
				+ fuelType + "]";
	}
	
	
	
	
	

}
