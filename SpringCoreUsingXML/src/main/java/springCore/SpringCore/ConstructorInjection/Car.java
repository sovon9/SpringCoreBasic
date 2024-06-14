package springCore.SpringCore.ConstructorInjection;

public class Car implements Vehicle {

	private Engine engine;
	
	@Override
	public String mileadge() {
		return "20kmpl";
	}
	
	public String getEngineType()
	{
		return engine.engineType();
	}

}
