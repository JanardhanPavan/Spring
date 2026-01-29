package Demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import Demo1.config;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(configuratiom.class);
		Car car = applicationContext.getBean(Car.class);
		System.out.println(car);
		car.start();
		
	}

}
