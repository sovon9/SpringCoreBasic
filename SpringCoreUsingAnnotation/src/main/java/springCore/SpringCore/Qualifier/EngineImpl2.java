package springCore.SpringCore.Qualifier;

import org.springframework.stereotype.Component;

@Component
public class EngineImpl2 implements Engine {

	@Override
	public String engineType() {
		return "6v 6cylinder engine";
	}

}
