package springCore.SpringCore.Qualifier;

import org.springframework.stereotype.Component;

@Component
public class EngineImpl implements Engine {

	@Override
	public String engineType() {
		return "4v 6cylinder engine";
	}

}
