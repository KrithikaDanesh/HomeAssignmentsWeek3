package week3.assignments;

public class AxisBankOverride extends BankInfoOverride{
	public void deposit() {
		System.out.println("Overrided Deposit amount - $2000");
	}

	public static void main(String[] args) {
		AxisBankOverride bank = new AxisBankOverride();
		bank.savings();
		bank.fixed();
		bank.deposit();

	}

}
