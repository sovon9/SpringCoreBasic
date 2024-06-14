package springCore.SpringCore.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// I need a bus so below code is written to give me a bus
//		Vehicle bus = new Bus();
//		System.out.println(bus.mileadge());
		/*
		 *  now if I need a Car then I have change in the code(Main class)
		 *  for getting a Car object
		 */
//		Vehicle car = new Car();
//		System.out.println(car.mileadge());
		/*
		 * this is where spring spring comes in with IOC container where we don't have
		 * to make a change in the code rather then we will tell spring
		 * application context(IOC container) to create an object for me through some configuration
		 * generally we provide configuration through XML for xml based config file
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/springCore/SpringCore/bean/vehicleConfig.xml");
		
		/* get the Bean just by using the ID of the Bean */
		//Vehicle vehicle = (Vehicle) context.getBean("vehicleBean");
		
		// if we directly want to cast to Vehicle while getting Bean then
		Vehicle vehicle = context.getBean("vehicleBean", Vehicle.class);
		System.out.println(vehicle.mileadge());

	}

}
