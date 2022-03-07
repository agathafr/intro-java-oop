
public class TestGetAndSet {

	public static void main(String[] args) {
		Account account = new Account(1337, 24226);
		
		System.out.println(account.getAccountNumber());

		Client paulo = new Client();
		
		account.setAccountOwner(paulo);
		
		paulo.setName("Paulo Silveira");
		
		account.setAccountOwner(paulo);
		
		System.out.println(account.getAccountOwner().getName());
		
		account.getAccountOwner().setProfession("Programer");
		
		Client accountOwner = account.getAccountOwner();
		accountOwner.setProfession("Programer");
	}

}
