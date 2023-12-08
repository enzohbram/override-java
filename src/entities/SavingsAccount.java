package entities;

public class SavingsAccount extends Account{

	private double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	/** nesta classe na há desconto na operação de saque, desta forma
     para informar ao compilador que há uma sobreposição de método
     foi utilizado a anotação @Override. s*/
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}
