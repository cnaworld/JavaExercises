import java.util.Scanner;
public class AccountTest {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter your withdraw amount : ");
        int amount = input.nextInt();
        Account moneyManagement = new Account();
        moneyManagement.withdraw(amount);


    }



}
