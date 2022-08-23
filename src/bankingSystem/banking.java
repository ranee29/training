package bankingSystem;

public class banking {

    int withdraw_amount, remaining_bal;
    double balance;
    double availableBalance;
    String name;
    private final double maintaining_balance = 500;


    public double getAvailableBalance(){
        return availableBalance;
    }
    public void computeAvailableBalance(double balance){
        this.availableBalance = (balance - maintaining_balance);
        this.balance = balance;
    }
    public void checkRemainingBalance(){

        System.out.println("Available: " + getAvailableBalance());
        System.out.println("Overall balance: "+ balance);
    }



}
