package Pra2;
public class P2_4Main {
    public static void main(String[] args) {
        P2_4 a1=new P2_4();
        P2_4 a2=new P2_4(123456,100000);
        a2.setdata(1289031,100000, 5.6, "12-5-2020");
        System.out.println("Account Details:\n");
        System.out.println("Balance :"+a2.getBal());
        System.out.println("Annual Interest :"+a2.getAnn());
        System.out.println("Monthly Interest Rate:"+a2.getMonthlyInterestRate());
        System.out.println("Monthly Interest :"+a2.getMonthlyInterest());
        System.out.println("Account was created on "+a2.getDt());
        a2.withdraw(12000);
        a2.deposit(15000);
        System.out.print("------------------------\n");
        SavingAccount a=new SavingAccount(900);  //Make the object to pass the argument
        ChkAccount b=new ChkAccount(1000);  //Make the object to pass the argument
        System.out.println("For Saving Account:\n");
        System.out.println(a);
        System.out.print("------------------------\n");
        System.out.println("For Checking Account:\n");
        System.out.println(b);
        System.out.println("This program is made by 21CE039 Harsh");
    }
}