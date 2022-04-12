import java.util.Scanner;

public class Exe2_30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, n1, n2, n3, n4, n5;

        System.out.print("Enter a 5 digits number: ");
        num = input.nextInt();

        n1 = num / 10000;
        num = num % 10000;
        n2 = num / 1000;
        num = num % 1000;
        n3 = num / 100;
        num = num % 100;
        n4 = num / 10;
        n5 = num % 10;

        System.out.print(n1 + "   " + n2 + "   " + n3 + "   " + n4 + "   " + n5);
    }
}
