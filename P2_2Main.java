package Pra2;
public class P2_2Main {
    public static void main(String[] args) {
        P2_2 sc = new P2_2();
        System.out.println("ID : " + sc.getId());
        System.out.println("Balance: " + sc.getBalance());
        System.out.println("Annual Interest Rate: " + sc.getAnnualInterestRate());
        System.out.println("Monthly Interest Rate: " + sc.getMonthlyInterestRate());
        System.out.println("Monthly Interest: " + sc.getMonthlyInterest());
        System.out.println("Balance after withdraw: " + sc.Withdraw(250)); //Here we take a value
        System.out.println("Balance after deposit: " + sc.Deposit(120));  //take a value
        System.out.println("This program is created by 21CE039 Harsh");
    }
}
