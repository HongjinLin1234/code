package exercises8;

public class BankAccount implements Valuable{
    private int balance;
    public BankAccount(int initialBal){
    	this.balance=initialBal;
    }
	public int getBalance() {
		return balance;
	}
    public void deposit(int funds){
    	this.balance=this.balance+funds;
    	this.balance=this.balance-1;
    }
    public String toString(){
    	return "Bank Balance: "+this.balance;
    }
	@Override
	public int getLiquidValue() {
		// TODO Auto-generated method stub
		return this.getBalance();
	}
}
