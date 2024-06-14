package springCore.SpringCore.JavaConfig;

import org.springframework.stereotype.Component;

@Component
public class EngineImpl implements Engine {

	@Override
	public String engineType() {
		return "4v 6cylinder engine";
	}

}
