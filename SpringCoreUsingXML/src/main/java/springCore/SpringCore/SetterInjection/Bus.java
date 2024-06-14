package springCore.SpringCore.SetterInjection;

public class Bus implements Vehicle {

	private Engine engine;
	
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

}
