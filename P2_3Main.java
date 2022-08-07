package Pra2;
import java.util.ArrayList;
import java.util.Scanner;
public class P2_3Main {
    public static void main(String[] args) {
        ArrayList<P2_3> arr = new ArrayList<P2_3>();
        Scanner sc = new Scanner(System.in);
        boolean f = true;    ////Here we use boolean for print true value
        String str;
        int op;
        P2_3 ac = null;
        P2_3 a = new P2_3(null);
        arr.add(new P2_3("AC001"));    //Here we use array list for printing the account numbers
        arr.add(new P2_3("AC002"));
        arr.add(new P2_3("AC003"));
        arr.add(new P2_3("AC004"));
        arr.add(new P2_3("AC005"));
        arr.add(new P2_3("AC006"));
        arr.add(new P2_3("AC007"));
        arr.add(new P2_3("AC008"));
        arr.add(new P2_3("AC009"));
        arr.add(new P2_3("AC010"));
        System.out.print("Enter your ID :- ");
        str = sc.next();

        for (P2_3 p2_3 : arr) {           //here we use for loop for check the all details
            if (str.equals(p2_3.id)) {
                ac = a;
                break;
            }
        }
        {
            if (ac == null) {
                System.out.println("Invalid ID");
                System.exit(0);
            } else {
                do {

                    op = sc.nextInt();
                    switch (op) {                           //Here we use switch case for all account details
                        case 1 -> ac.BalanceInq();
                        case 2 -> ac.withdraw();
                        case 3 -> ac.deposit();
                        case 4 -> ac.moneyTransfer(arr);
                        case 5 -> ac.Create(arr);
                        case 6 -> ac.delete(arr);
                        case 0 -> System.out.println("Thank you");
                        default -> System.out.println("Invalid input");
                    }
                } while (op != 0);
            }
        }
    }
}