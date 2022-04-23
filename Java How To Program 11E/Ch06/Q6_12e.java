import java.security.SecureRandom ;

public class Q6_12e {
    public static void main(String[] args){
        int x ; 
        SecureRandom randomNumber = new SecureRandom() ;
     
        x =  -1 + randomNumber.nextInt(3) ; 
        System.out.println(x);
   

    }
    
}
