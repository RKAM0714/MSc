
public class TestSavingsAccount {

	public static void main(String[] args) {
		/* Create SavingsAccount object and 
		 * call the methods
		 */
		SavingsAccount s=new SavingsAccount();
		s.initialiseAccountDetails();
		s.deposit();
		s.printStatement();
		s.withdraw();
		s.printStatement();
	}
}