package array;

public class Array_Demo {

	public static void main(String[] args) {
		//This is a one dimentional array.
		//Declaring array
		String[] myArray = new String[3];

		//Assigning value to the array
		myArray[0] = "Selenium";
		myArray[1] = "Eclipse";
		myArray[2] = "Java";
		System.out.println(myArray[1]);
		
		for (int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		//Another way of declaring array
		int [] number = {4,2,7};
		for (int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		
		//Another enhanced loop
		System.out.println("Example of enhanced loop");
		for (int val:number) {
			System.out.println("val");
		}
		 String Apple$ = "apple";
		
		
		
		
		
		
		
		
	}

}
