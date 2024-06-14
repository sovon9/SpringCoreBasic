package springCore.SpringCore.ConstructorInjection;

public class Bus implements Vehicle {

	private Engine engine;
	
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
