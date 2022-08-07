package Pra2;
import java.util.Date;
class P2_2
{
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated = new Date();
    public P2_2()
    {
        id=1;
        balance=500;
        annualInterestRate=7;
    }
    public P2_2(int newId, double newBalance)  //Here we use constructor
    {
        id=newId;
        balance=newBalance;
        annualInterestRate=0.07;
    }
    public P2_2(int newId, double newBalance, double newAnnualInterestRate)  //Here we use constructor
    {
        id=newId;
        balance=newBalance;
        annualInterestRate=newAnnualInterestRate;
    }

    public int getId()  //Here We use Getter
    {
        return id;
    }
    public double getBalance()  //Here We use Getter
    {
        return balance;
    }
    public double getAnnualInterestRate()  //Here We use Getter
    {
        return annualInterestRate;
    }
    public void setId(int newId)      //Here we use setter
    {
        id=newId;
    }
    public void setBalance(int newBalance)     //Here we use setter
    {

        balance=newBalance;
    }
    public void setAnnualInterestRate(int newAnnualInterestRate)     //Here we use setter
    {

        annualInterestRate =newAnnualInterestRate;
    }

    double getMonthlyInterestRate()
    {
        return(annualInterestRate/12);
    }
    double getMonthlyInterest()
    {
        return(balance*(
                annualInterestRate/12));
    }
    public java.util.Date getDate()
    {

        return this.dateCreated;
    }
    double Withdraw(double amount)
    {
        if(balance-amount < 0)
        {}
        else
        {
            balance-=amount;
        }
        return balance;
    }
    double Deposit(double amount)
    {
        return balance+=amount;
    }
}

