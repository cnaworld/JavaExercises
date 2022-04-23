import java.util.Scanner;
public class Q6_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
		int n1 = input.nextInt();

		System.out.printf("%nIs %d even? %s", n1, isEven(n1));

    }
    public static boolean isEven(int number ) {
        if ( number % 2 == 0 )
            return true ; 
        else 
            return false ; 
        
    }
    
}

