package Demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Value("101")
	private int carid;
	@Value("BMW")
	private String carname;
	@Value("m4")
	private String model; 
	@Autowired
	private Engine engine;
	public void start() {
		engine.start();
	}

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Car(int carid, String carname, String model, Engine engine) {
		super();
		this.carid = carid;
		this.carname = carname;
		this.model = model;
		this.engine = engine;
	}

	public Car() {
		super();
	}

	@Override
	public String toString() {
		return "Car [carid=" + carid + ", carname=" + carname + ", model=" + model + ", engine=" + engine + "]";
	}

	
	
}
