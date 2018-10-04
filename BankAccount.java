public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(double d, int i, String s){
    balance = d;
    accountID = i;
    password = s;
  }
  public double getBalance(){
    return balance;
  }
  public int getID(){
    return accountID;
  }

  public void setPassword(String p){
    password = p;
  }

  public String toString(){
    return accountID + "\t" + balance;
  }

  public boolean deposit(double n){
    if (n >= 0){
      balance += n;
      return true;
    } else {
      return false;
    }
  }

  public boolean withdraw(double n){
    if (n <= balance){
      balance -= n;
      return true;
    } else {
      return false;
    }
  }
}
