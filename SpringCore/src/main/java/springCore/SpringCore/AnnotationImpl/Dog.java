package springCore.SpringCore.AnnotationImpl;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("Bhou");
	}

}
