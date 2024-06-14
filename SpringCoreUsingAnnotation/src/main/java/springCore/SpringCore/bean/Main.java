package springCore.SpringCore.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springCore/SpringCore/bean/vehicleConfig.xml");
		
		Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
		System.out.println(vehicle.mileadge());

	}

}
