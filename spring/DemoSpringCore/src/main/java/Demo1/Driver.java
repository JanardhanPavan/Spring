package Demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(config.class);
		
		Student s =  applicationContext.getBean(Student.class);
		System.out.println(s);
	}

}
