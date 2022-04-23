import java.security.SecureRandom ;

public class Q6_12a {
    public static void main(String[] args){
        int x ; 
        SecureRandom randomNumber = new SecureRandom() ;
        x = 1 + randomNumber.nextInt(2) ; 
        System.out.println(x);

    }
}
