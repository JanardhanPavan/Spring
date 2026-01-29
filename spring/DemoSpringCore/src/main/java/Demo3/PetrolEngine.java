package Demo3;

import org.springframework.stereotype.Component;

@Component("petrol")

public class PetrolEngine implements Engine {
	@Override
	public void start() {
		System.out.println("Petrol Engine Started");
	}

}
