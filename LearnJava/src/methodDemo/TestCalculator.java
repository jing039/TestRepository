package methodDemo;

public class TestCalculator {

	public void dogSound() {
		sound();
		System.out.println("I can also make dog sound.");
	}
	
	public static void main(String[] args) {

		//Created an object of Calculator class.
		Calculator calc = new Calculator();
		
		System.out.println("Addition of a and b is : " + calc.doAdd(67,12));

		System.out.println("Value of a - b is :" + calc.doAdd(83,12));
		
		System.out.println(calc.concatStr("Hello,", "I am learning Java! It's fun!"));
		TestCalculator obj = new TestCalculator ();
		
		System.out.println(obj.doMul(54, 95));
		System.out.println(doDiv(34,7));
		obj.sound();
		//System.out.println(Calculator.do3Mul(4, 722, 67));
		
		
		
	}

	public int doMul(int a, int b) {
		int c = a * b;
		System.out.println("I am doing action in doMul class.");
		return c;
	}
	
	public static double doDiv(int a, int b) {
		int c = a / b;
		return c;
	}
	
	public void sound() {
		System.out.println("This is a generic sound.");
	}
	
		

	
	
}
