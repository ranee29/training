package bankingSystem;

public class Main {
    public static void main(String [] args){
        double balance = 10_000;
        banking bank = new banking();
//        bank.withdraw("Ranee", 900);
        bank.computeAvailableBalance(balance);
        bank.checkRemainingBalance();
//        System.out.println(bank.getAvailableBalance());
    }
}
