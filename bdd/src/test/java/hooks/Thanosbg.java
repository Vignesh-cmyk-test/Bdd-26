package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Thanosbg {

	@Before(value="@backtag",order=1)
	public void beforeall() {
		System.out.println("Just before all");
	
	}
	@After(value="@backtag",order=1)
	public void afterAll() {
		System.out.println("Just after all");
	}
}
