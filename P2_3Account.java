package Pra2;
import java.lang.*;
import java.util.*;
class P2_3
{
    String id;
    int balance;
    P2_3(String i)
    {
        id = i;
        balance = 300;
    }
    void BalanceInq()
    {
        System.out.println("ID :- " + id);
        System.out.println("Balance :- " + balance);
    }
    void withdraw()
    {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw :- ");
        temp = sc.nextInt();
        if(balance - temp < 300)                        //We ues if else condition for minimum balance and check current balance
            System.out.println("Minimum 300 balance is needed");
        else
        {
            balance = balance - temp;
            System.out.println("Current balance :- " + balance);
        }
    }
    void deposit()
    {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit :- ");
        temp = sc.nextInt();
        balance = balance + temp;
        System.out.println("Currently available balance :- " + balance);
    }
    void moneyTransfer(ArrayList ar)
    {
        int temp;
        String id;
        Scanner sc = new Scanner(System.in);
        P2_3 ac = null;
        System.out.print("Enter ID to transfer :- ");
        id = sc.next();
        Iterator itr = ar.iterator();
        while(itr.hasNext())
        {
            P2_3 a = (P2_3) itr.next();
            if(id.equals(a.id))
                ac = a;

        }
        if(ac == null)               //Here we use if else for account transfer and for balance inquiry
            System.out.println("Account not found");
        else
        {
            System.out.print("Enter amount to transfer :- ");
            temp = sc.nextInt();
            if(temp > balance)
                System.out.println("Not enough balane to transfer");
            else
            {
                ac.balance = ac.balance + temp;
                balance = balance - temp;
            }

        }
    }
    void Create(ArrayList arr)  //We use create to create the new id
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID :- ");
        str = sc.next();
        P2_3 ac = new P2_3(str);
        arr.add(ac);
    }
    void delete(ArrayList arr)     //Here we use delete to delete a id
    {
        String str;
        Scanner sc = new Scanner(System.in);
        P2_3 ac = null;
        System.out.print("Enter ID :- ");
        str = sc.next();
        Iterator itr = arr.iterator();
        while(itr.hasNext())
        {
            P2_3 a = (P2_3) itr.next();
            if(str.equals(a.id))
                ac = a;

        }
        if(ac == null)   //Here we use if else for account found or not and account remove
            System.out.println("Account not found");
        else
        {
            arr.remove(ac);
            System.out.println("Account removed successfully");
        }
    }
}