package springCore.SpringCore.lifeCycle;

public class Car {

	private double price;

	public void setUp()
	{
		System.out.println("init() method");
	}
	
	public String mileadge() {
		return "20kmpl";
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getVehiclePrice() {
		return price;
	}
	
	public void destroy()
	{
		System.out.println("destroy() method");
	}
	
}
