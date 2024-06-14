package springCore.SpringCore.ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "vehicleBean")
public class Bus implements Vehicle {

	private Engine engine;
	
	@Autowired // constructor injection suing Autowired
	public Bus(Engine engine)
	{
		this.engine=engine;
	}
	
	@Override
	public String mileadge() {
		return "18kmpl";
	}
	
	public String getEngineType()
	{
		return engine.engineType();
	}

}
