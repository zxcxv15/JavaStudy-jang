package j16_스태틱;

public class Car {
	private int serialNmber;
	private	String company;
	private	String model;
	
	public Car() {
		
	}
	public Car(int serialNmber, String company, String model) {
		this.serialNmber = serialNmber;
		this.company = company;
		this.model = model;	
	}
	public int getSerialNmber() {
		return serialNmber;
	}
	public void setSerialNmber(int serialNmber) {
		this.serialNmber = serialNmber;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
