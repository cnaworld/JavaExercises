import java.security.SecureRandom ;

public class Q6_12d {
    public static void main(String[] args){
        int x ; 
        SecureRandom randomNumber = new SecureRandom() ;
        x =  1000 + randomNumber.nextInt(112) ; 
        System.out.println(x);
        

    }
}
