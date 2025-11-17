package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before(order=1)
	public void beforeMeth() {
		System.out.println("Before that thanos should be born");
	}
	
	@Before(order=2)
	public void beforeMeth1() {
		System.out.println("Thanos should think about killing");
	}
	
	@After(order=1)
	public void afterMeth() {
		System.out.println("After all thanos should be died");
	}
	
	@After(order=2)
	public void afterMeth1() {
		System.out.println("Thanos accomplished mission");
	}

}
