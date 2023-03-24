package groupsConcept;

import org.testng.annotations.Test;

public class MetaGroups {

	
	@Test(groups = { "regration", "sanity" })
	public void tc01() {
		System.out.println("This is TC01 concept");
	}

	@Test(groups = { "regration", "sanity", "smoke" })
	public void tc02() {
		System.out.println("This is TC02 concept");
	}

	@Test(groups = "sanity")
	public void tc03() {
		System.out.println("Thos is TC03 concept");
	}

	@Test(groups = { "smoke" })
	public void tc04() {
		System.out.println("This is TC04 concept");
	}

	@Test(groups = { "regration" })
	public void tc05() {
		System.out.println("This is TC05 concept");
	}
}

