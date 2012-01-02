package ch.masrad.mre.banque2dot0.buisness;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person paul = new Person("Paul");
		Person georges = new Person("Georges");
		Bank aBank = new Bank();
		
		Account paulsAccount = new Account(paul);
		Account georgsAccount = new Account(georges); 
		
		System.out.println(paulsAccount.getBalance());
		aBank.Transaction(paulsAccount,georgsAccount,10);
		System.out.println(paulsAccount.getBalance());
		System.out.println(georgsAccount.getBalance());
	}

}