package actio_items;

public class ActionItem2 {

	public static void main(String[] args) {
		
		// 03. Write a program that initializes the following variables:
		// name, city, age, college, profession, animal, petName.
		// Print the following statement using the variables:
		String name = "Apple_Juice";
		String city = "Ayo";
		int age = 4000;
		String college = "Fruit College";
		String profession = "Fruit Ninja";
		String animal = "Organge";
		String petName = "Oragnge_Jucie";
		
		System.out.println("Once there was a person named " +  name + " who lived in " + city + "." + " At the age of " + age + 
				" years old, " + name + " went to college at " + college + ". " + name + " graduated and went to work as a " + 
				profession + "." + " Then, " + name + " adopted a(n) animal named " + petName + ".");
		
		
		// Q5. Write a program that sums the numbers from 0 to 15 using for, while and do while loop.
		// For loop:
		System.out.println("For loop:");
		int sum = 0;
		for(int i = 0; i <= 15; i++) {
			sum = sum + i;
		// Result = sum + i
		}
		System.out.println("The sum from 0 to 15 is " + sum + ".");
		
		// While loop:
		System.out.println("While loop:");
		int a = 0;
		int b = 0;
		while (a <= 15) {
			  b = b + a;
			  a++;
			}
		System.out.println("The sum from 0 to 15 is " + b + ".");
		
		// Do While loop:
		System.out.println("Do While loop:");
		int x = 0;
		int y = 0;
		do {
			y = y + x;
			x++;		
		} while ( x <= 15);
		System.out.println("The sum from 0 to 15 is " + y + ".");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
