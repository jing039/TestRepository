package first_java;

public class BasicJava {

	public static void main(String[] args) {

		System.out.println("I am learning Java!");

		//Open a browser
		//Go to shop.com
		//Select software cat
		//Enter a software name
		//Hit enter or click go
		//Software items should be seen on the site under results
		
		//1)What is automated testing?
		//2)What is smoke testing?
		//3)What is regression testing?
		
		//Data types in Java
		int MathGrade = 100; //Declaring a variable to represent grade value
		int JavaGrade = 95;
		int TotalGrade = MathGrade + JavaGrade;
		System.out.println("My total grade is :" + TotalGrade);
		
		int grade = 99;
		long Credit_Card = 4535545475755L;
		double banRake = 8.09;
		float pie = 0.1679877989879897987f;
		boolean isDone = false;
		char Answer = 'N';
		
		// >, <, >=, <=, ==, !=  comparison operators
		
		if(MathGrade>JavaGrade) {
			System.out.println("You are good in Math! Need to work on Java!");
		}
		
		if(JavaGrade>MathGrade) {
			System.out.println("You are good in Java! but need to work on Math!");
		}
	}
}
