package first_java;

public class WhileLoop_Demo {

	public static void main(String[] args) {

		/** Syntax for while loop
		 * 
		 * initialization;
		 * while(condition){
		 * increment/decrement
		 * }
		 * 
		 ** Syntax for do while loop
		 * initialization
		 * do{
		 *	statement
		 * increment/decrement
		 * }While (condition)
		 * 
		 */

		// Type "I am from +" variable 3 times using for, while and do while loop using string variable for referring to your place
		// For loop:
		System.out.println("For loop:");
		for(int i = 1; i <= 3; i++) {
			System.out.println("I am from Queens NY.");
		}
	
		// While: 
		System.out.println("While loop:");
		int i = 0;
		while (i < 3) {
		  System.out.println("I am from Queens NY");
		  i++;
		}
		
		// Do While:
		System.out.println("Do while loop:");
		int i1 = 0;
		do {
		  System.out.println("I am from Queens NY");
		  i1++;
		}
		while (i1 <= 2);
	
		
		//Change location
		String place = "Queens";
		int start = 1;
		while(start<=3) {
			System.out.println("I am from " + place);
			start++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
