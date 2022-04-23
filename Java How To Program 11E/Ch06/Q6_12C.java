import java.security.SecureRandom ;

public class Q6_12C {
    public static void main(String[] args){
        int x ; 
        SecureRandom randomNumber = new SecureRandom() ;
        x =  randomNumber.nextInt(10) ; 
        System.out.println(x);

    }
}
