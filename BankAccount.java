public class BankAccount{

    public static void main(String[] args){
	/*
	BankAccountFunds bobsAccount = new BankAccountFunds();
	//("1234", 0.00, "Bob Brown", "myemail@bob.com", "(087)123-4567");
	System.out.println(bobsAccount.getNumber());
	System.out.println(bobsAccount.getBalance());

       	bobsAccount.setNumber("1234");
	bobsAccount.setBalance(0.00);
	bobsAccount.setCustomerName("Bob Brown");
	bobsAccount.setCustomerEmailAddress("myemailaddress@bob.com");
	bobsAccount.setCustomerPhoneNumber("(087)123-4567");
	

	bobsAccount.withdrawal(100.0);

	bobsAccount.deposit(50.0);
	bobsAccount.withdrawal(100.0);

	bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

	BankAccountFunds robsAccount = new BankAccountFunds("Rob", "Rob@rob.com", "12345");
	System.out.println(robsAccount.getNumber() + " name " + robsAccount.getCustomerName());
	*/
	VipCustomer person1 = new VipCustomer();
	System.out.println(person1.getName());
	VipCustomer person2 = new VipCustomer("Rob", 25000.00);
	System.out.println(person2.getName());
	VipCustomer person3 = new VipCustomer("Grammit", 100.00, "grammit@email.com");
	System.out.println(person3.getName());
	System.out.println(person3.getEmailAddress());
    }
}