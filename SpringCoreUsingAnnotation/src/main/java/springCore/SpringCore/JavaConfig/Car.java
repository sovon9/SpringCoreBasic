package springCore.SpringCore.JavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Car implements Vehicle {

	@Autowired
	@Qualifier("engineImpl2")
	private Engine engine;
	@Value("${car.price}")
	private double price;
	
	@Override
	public String mileadge() {
		return "20kmpl";
	}
	
	public String getEngineType()
	{
		return engine.engineType();
	}

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
