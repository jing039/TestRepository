package exceptionHandling;

public class Exception_Demo {

	public static void main(String[] args) {
		try {
		System.out.println("Let us figure out an exception!");
		String[]name = {"ProSmart", "Java", "Selenium", "Eclipse"};
		
		System.out.println(name[4]);
		System.out.println("Possible example of another dead code.");
		
	} catch(Exception e) {
		System.out.println("Exception occured!" + e.getMessage());
		//System.out.println("Exception occured!" + e.getStackTrace());
		//System.out.println("Exception occured!" + e.getCause());
		System.out.println("OMG, I could handle on.");
	}
		System.out.println("I am out of the catch block now!");
}
}