package first_java;

public class Switch_Demo {

	public static void main(String[] args) {

		/** Switch Statement syntac
		 * 
		 * Switch (expression){
		 * case value1: 
		 * 	code to be executed
		 * break;
		 * case value2:
		 * 	code to be executed
		 * break
		 * case value3:
		 * 	code to be executed
		 * break;
		 * default: 
		 * 	code to be executed
		 * }
		 */

		int dayNumber = 3;
		switch (dayNumber) {
		case 1:{
			System.out.println("SIGHHH...Today is Monday...");
		}
		break;
		case 2:{
			System.out.println("Oh god. Today is Tuesday...");
		}
		break;
		case 3:{
			System.out.println("Tsk. Today is Wednesday...");
		}
		break;
		case 4:{
			System.out.println("Almosy there. Today is Thursday.");
		}
		break;
		case 5:{
			System.out.println("YES!!! Today is Friday!");
		}
		break;
		case 6:{
			System.out.println("OOH HOO! Today is Saturday!!");
		}
		break;
		case 7:{
			System.out.println("Damn already. Today is Sunday......");
		}
		break;
		default:
			System.out.println("Invalid day.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
