package springCore.SpringCore.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springCore/SpringCore/lifeCycle/vehicleConfig.xml");
		Car car = context.getBean("carBean", Car.class);
		System.out.println(car.getVehiclePrice());
		((ClassPathXmlApplicationContext)context).close();
	}

}
