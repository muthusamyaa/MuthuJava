package pack;

public class Exceptionthrows {

	static void testmethod() throws Exception {

		System.out.println("Open Browser");
		Thread.sleep(1000);
		System.out.println("Login");
		Thread.sleep(1000);
		System.out.println("business validation");
		Thread.sleep(1000);
		System.out.println("Logout");
		Thread.sleep(1000);
		System.out.println("Close Browser");
	}

	public static void main(String[] args) throws Exception {

		testmethod();
		
	}

}
