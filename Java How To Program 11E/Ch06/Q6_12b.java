import java.security.SecureRandom ;

public class Q6_12b {
    public static void main(String[] args){
        int x ; 
        SecureRandom randomNumber = new SecureRandom() ;
        x = 1 + randomNumber.nextInt(100) ; 
        System.out.println(x);

    }
}
