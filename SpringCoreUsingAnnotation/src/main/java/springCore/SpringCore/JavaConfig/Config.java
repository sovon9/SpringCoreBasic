package springCore.SpringCore.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "springCore.SpringCore.JavaConfig")
@PropertySource("springCore/SpringCore/JavaConfig/value.properties")
public class Config {

	@Bean // method name by default is the bean id
	public Vehicle bus()
	{
		return new Bus();
	}
	
	@Bean(name="car1") // method name by default is the bean id
	public Vehicle car()
	{
		return new Car();
	}
	
}
