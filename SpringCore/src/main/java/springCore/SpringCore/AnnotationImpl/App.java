package springCore.SpringCore.AnnotationImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App app=new App();
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Test test = context.getBean(Test.class);
        test.doPrint();
        Animal dog = context.getBean(Dog.class);
        dog.sound();
        Animal cat = context.getBean(Cat.class);
        cat.sound();
    }
}
