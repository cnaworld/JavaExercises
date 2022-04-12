public class Account {
    private int money = 1000 ;
    public void withdraw ( int amount )
    {
        if (money >= amount)
        {
            money -= amount ;
            System.out.printf("now you have %d balance", money);
        }
        else
            System.out.println("Withdrawal amount exceeded account balance.");
    }

}
