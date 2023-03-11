package encapsulation;

public class Bank {

	int accountNumber = 12345678;
	int pinNumber = 1234;
	double balance = 150000;
	
	public void drawMoney(int acctNo, int pinNo, int amount) {
		if(acctNo == accountNumber && pinNo == pinNumber) {
			if(amount <= balance) {
			balance = balance - amount;
			System.out.println("Amount withdrawn" + amount);
			}else {
				System.out.println("Insufficient balance.");
			}
		} else {
			System.out.println("Invalid credentials.");
		}
		
	}
	
	public void updatePin(int accountNo, int oldPin, int newPin) {
		if(accountNo == accountNumber && oldPin == pinNumber) {
			pinNumber = newPin;
			System.out.println("Pin is updated.");
		}else {
			System.out.println("Invalid credentials."); 
			
		}
	}
	

	
	
	
	
	
}
