package springCore.SpringCore.scope;

public class Car implements Vehicle {

	private Engine engine;
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
		// TODO Auto-generated method stub
		return 0;
	}

}
