package newpackage.Bank;

public class Main {
	
	public static void main(String args[]) {
	BankA a = new BankA();
    
	System.out.println(a.getBalance());
    BankB b = new BankB();
    System.out.println(b.getBalance());
    BankC c = new BankC();
    System.out.println(c.getBalance());
	}

}
