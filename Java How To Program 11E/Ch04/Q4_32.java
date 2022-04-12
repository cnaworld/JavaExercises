public class Q4_32 {
    public static void main (String[] args)
    {
        int repeat = 0  ;
        do {
            int stars = 0;
            while (stars < 8) {
                System.out.print("* ");
                stars++;

            }
            stars = 0;
            System.out.println();
            System.out.print(" ");
            while (stars < 8) {
                System.out.print("* ");
                stars++;
            }
            System.out.println();
            repeat++;
        } while (repeat <= 3);

    }
}
