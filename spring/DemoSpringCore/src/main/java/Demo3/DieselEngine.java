package Demo3;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEngine implements Engine{

	@Override
	public void start() {
		System.out.println("Diesel Engisne Started.");
	}

}
