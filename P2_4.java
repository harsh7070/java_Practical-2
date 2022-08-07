package Pra2;
public class P2_4 {
    private int id=0;
    double balance=500,annualInterest=7,amount;
    String dateCreated;
    P2_4()   //Here we use constructor
    {
        id=0;
        balance=50000;
        annualInterest=7;
    }
    P2_4(int i,double bal)   //Here we use constructor
    {
        id=i;
        balance=bal;
    }
    void setdata(int i,double bal,double aInt,String dt)
    {
        id=i;
        balance=bal;
        annualInterest=aInt;
        dateCreated=dt;
    }
    int getId()   //Here we use getter
    {
        return id;
    }
    double getBal()   //Here we use getter
    {
        return balance;
    }
    double getAnn()    //Here we use getter
    {
        return annualInterest;
    }
    double getMonthlyInterestRate()    //Here we use getter
    {
        return (annualInterest*100)/12;
    }
    double getMonthlyInterest()   //Here we use getter
    {
        return balance*(annualInterest*100)/12;
    }
    String getDt()  //Here we use getter
    {
        return dateCreated;
    }
    void withdraw(double amount)
    {
        balance-=amount;
        if(balance>0)
            System.out.println("The balance left after withdrawal of Rs."+amount+" is Rs."+balance);
        else
            System.out.println("Withdrawal of Rs."+amount+" is not possible!!");
    }
    void deposit(double amount)
    {
        balance+=amount;
        System.out.println("The balance left after deposit of Rs."+amount+" is Rs."+balance);
    }
}
class SavingAccount extends P2_4    //Here we make a new class for more bank details.
{
    SavingAccount(double a)
    {
        amount=a;
        balance-=amount;
    }
    public String toString()
    {
        if(balance>=3000)   //Here we use if else to check balance left after widrawal and for minimum balance required
        {
            return "The balance left after withdrawal of Rs."+amount+" is Rs. "+balance;
        }
        else
        {
            return "Beyond1 Over Draft Limit Not Possible!!\nMinimum balance of Rs. 3000 is required.";
        }
    }
}
class ChkAccount extends P2_4   //Here we make a class for check account details
{
    ChkAccount(double am)
    {
        amount = am;
        balance-=amount;
    }
    public String toString()
    {
        System.out.println("Withdrawal Successful!!");
        return "Now the balance left is Rs."+balance+" after the withdrawal of Rs."+amount;
    }
}