package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Thanos2tagged {
	
	@Before(value="@hooks",order=1)
	public void beforeall() {
		System.out.println("Before that thanos should be born");
	
	}
	@After(value="@hooks",order=1)
	public void afterAll() {
		System.out.println("After all thanos should be died");
	}
	
	@Before(value="@positive",order=2)
	public void beforefirst() {
		System.out.println("Thanos should grow up positive");
	}
	@After(value="@positive",order=2)
	public void afterfirst() {
		System.out.println("Thanos is aged now");
	}
	
	@Before(value="@negative",order=3)
	public void beforesecond() {
		System.out.println("Thanos should grow up negative");
	}
	@After(value="@negative",order=3)
	public void aftersecond() {
		System.out.println("Thanos is aged now");
	}
	
	 // Runs only before @nuetral scenarios
    @Before(value = "@nuetral", order = 4)
    public void beforeNeutral() {
        System.out.println("Thanos should grow up nuetral");
    }

    @After(value = "@nuetral", order = 4)
    public void afterNeutral() {
        System.out.println("Thanos is aged now");
    }

}
