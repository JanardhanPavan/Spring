package Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		Student stu1 = (Student) applicationContext.getBean("s1");
		System.out.println(stu1);
		
		Student stu2 = (Student) applicationContext.getBean("s2");
		System.out.println(stu2);
	}

}
