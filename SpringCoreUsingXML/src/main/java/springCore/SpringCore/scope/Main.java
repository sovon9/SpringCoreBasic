package springCore.SpringCore.scope;

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
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springCore/SpringCore/scope/vehicleConfig.xml");
		
		/* get the Bean just by using the ID of the Bean */
		//Vehicle vehicle = (Vehicle) context.getBean("vehicleBean");
		
		// by default spring always makes singleton
		Vehicle vehicle1 = context.getBean("vehicleBean", Vehicle.class);
		Vehicle vehicle2 = context.getBean("vehicleBean", Vehicle.class);
		// for singleton it's true and for prototype it's false
		System.out.println(vehicle1==vehicle2);

	}

}
