package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	


	public int getNumber() {  //não criamos set para number porque o numero da conta não pode ser alterado
		return number;
	}
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	
	public double getBalance() { // o saldo da conta só pode ser alterado por la opeção de saque ou deposito.
		return balance;
	}

	public void deposit(double amount) {
			balance += amount;

	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public String toString() {
		return "Account " 
	                   + number 
	                   + ", Holder: " 
	                   + holder 
	                   + ", Balance: $ "
	                   + String.format("%.2f", balance);
	}

}
