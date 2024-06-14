package springCore.SpringCore.JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		// chaange car to bus to get bus object
		Vehicle vehicle = context.getBean("car1",Vehicle.class);
		System.out.println(vehicle.mileadge());
		System.out.println(vehicle.getEngineType());
		System.out.println(vehicle.getVehiclePrice());

	}

}
