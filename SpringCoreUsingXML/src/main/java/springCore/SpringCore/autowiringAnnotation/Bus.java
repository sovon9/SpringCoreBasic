package springCore.SpringCore.autowiringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Bus implements Vehicle {

	@Autowired // for field injection
	private Engine engine;
	private double price;
	
	// @Autowired for constructor injection
	/*public Bus(Engine engine) {
		super();
		this.engine = engine;
	} */

	@Override
	public String mileadge() {
		return "18kmpl";
	}
	
	public String getEngineType()
	{
		return engine.engineType();
	}

	//@Autowired you can put it at setter method for setter injection
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public double getVehiclePrice() {
		return price;
	}

}
