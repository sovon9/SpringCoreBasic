package springCore.SpringCore.AnnotationImpl;

import org.springframework.stereotype.Component;

@Component("testbean")
public class Test {

	public void doPrint()
	{
		System.out.println("it's working ");
	}
	
}
