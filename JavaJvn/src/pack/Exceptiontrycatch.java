package pack;

import java.io.IOException;

public class Exceptiontrycatch {
	
	static void muthu() {
		
		System.out.println("Open Browser");
		try {
			System.out.println("Login"+10/0);	
		}catch(Exception e) {
			System.out.println("Zero is not dividable value"+e);
			//throw new ArithmeticException("Muthu Exception");
			throw new ArithmeticException("Muthu Exception");
			
		}
		
		System.out.println("business validation");
		System.out.println("Logout");
		System.out.println("Close Browser");
	}

	public static void main(String[] args) {
		
		muthu();
		
	}
}
