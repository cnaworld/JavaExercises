import java.util.Scanner;

public class Exe2_28 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int r;

        System.out.print("radius:");
        r = input.nextInt();

        System.out.println("Diameter = " + (2*r));
        System.out.println("Circumference = " + (2 * r * Math.PI));
        System.out.println("Area = " + (r * r * Math.PI));
    }
}
