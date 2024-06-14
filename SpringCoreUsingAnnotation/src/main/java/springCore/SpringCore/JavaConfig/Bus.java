package springCore.SpringCore.JavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Bus implements Vehicle {

	@Autowired
	@Qualifier("engineImpl")
	private Engine engine;
	@Value("${bus.price}")
	private double price;
	
	@Override
	public String mileadge() {
		return "18kmpl";
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
