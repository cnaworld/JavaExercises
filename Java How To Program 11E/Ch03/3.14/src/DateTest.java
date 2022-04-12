public class DateTest {
    public static void main(String[] args)
    {
        Date date = new Date(10 , 11 , 2022) ;

        date.displayDate();

        date.setMonth(3);
        date.setDay(2);
        date.setYear(1999);

        date.displayDate();
    }
}
