package first_java;

public class AssignmentOperatorsDemo {

	public static void main(String[] args) {
		/** Assignment Operators (=, +=, -=, *=, /=, %=)
		 * 
		 * a = 7 meaning a = 7
		 * a += 7 meaning a + 7
		 * a -= 7 meaning a - 7
		 * a *= 7 meaning a * 7
		 * a /= 7 meaning a / 7
		 * a %= 7 meaning a % 7
		 * 
		 */

		int a = 88;
		int result = a-7;
		int result1 = a/=7;
		System.out.println(a+=7);
		System.out.println(result);
		System.out.println(a*=7);
		System.out.println(result1);
		System.out.println(a%=7);
		
		
	}

}
