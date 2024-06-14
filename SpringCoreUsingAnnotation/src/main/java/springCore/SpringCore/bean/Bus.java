package springCore.SpringCore.bean;

import org.springframework.stereotype.Component;

@Component(value = "vehicle")
public class Bus implements Vehicle {

	@Override
	public String mileadge() {
		return "18kmpl";
	}

}
