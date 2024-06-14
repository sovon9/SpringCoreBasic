package springCore.SpringCore.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springCore/SpringCore/ConstructorInjection/vehicleConfig.xml");
		
		Vehicle vehicle = context.getBean("vehicleBean", Vehicle.class);
		System.out.println(vehicle.mileadge());
		System.out.println(vehicle.getEngineType());

	}

}
