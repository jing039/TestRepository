package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throwable_Demo {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {


		System.out.println("Exception handling does not make any sense to me!");
		Thread.sleep(3000);
		try {
		FileInputStream fis = new FileInputStream("");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Maybe it is something, not sure about the use of it.");
		
		
		
		
		
		
		
		
		
		

	}

}
