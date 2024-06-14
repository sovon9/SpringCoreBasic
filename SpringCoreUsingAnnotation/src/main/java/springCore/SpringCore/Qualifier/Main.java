package springCore.SpringCore.Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springCore/SpringCore/Qualifier/vehicleConfig.xml");
		// chaange car to bus to get bus object
		Vehicle vehicle = context.getBean("car",Vehicle.class);
		System.out.println(vehicle.mileadge());
		System.out.println(vehicle.getEngineType());
		System.out.println(vehicle.getVehiclePrice());

	}

}
