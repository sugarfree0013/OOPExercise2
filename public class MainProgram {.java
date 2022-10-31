public class MainProgram {
	public static void main(String[] args) {
		Account acc;
		subaccount_1 acc_1= new subaccount_1("John Brian","3691215","dogcat");
		subaccount_2 acc_2= new subaccount_2("Karl Moises","5101520","catdog");
		acc = acc_1;
		System.out.println(acc.ForgotPass());
		System.out.println("This is your first account.");
		System.out.println("Accoount name: "+acc.getName());
		System.out.println("Account number: "+acc.getId());
		System.out.println("Password: "+acc_1.getPassword());
		
		acc = acc_2;
		System.out.println("\This is your second account.");
		System.out.println("Accoount name: "+acc.getName());
		System.out.println("Account number: "+acc.getId());
		System.out.println("Password: "+acc_2.getPassword());
		
	}
}