package BankAccount;

public interface Account {
    public void withdraw(int amt);
    public void deposit(int amt);
    public String getOwner();
    public String getDetails();
    public int getBalance();
}
