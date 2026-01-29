package Demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("${id}")
	private int id;
	@Value("${name}")
	private String name;
	@Value("${age}")
	private int age;
	@Autowired
	private IdCard idCard;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public IdCard getIdCard() {
		return idCard;
	}
	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}
	public Student(int id, String name, int age, IdCard idCard) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.idCard = idCard;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", idCard=" + idCard + "]";
	}
	
	
	
	
}
