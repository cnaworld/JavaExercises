import java.security.SecureRandom ;

public class Q6_12F {
    public static void main(String[] args){
        int x ; 
        SecureRandom randomNumber = new SecureRandom() ;
     
        x =  -3 + randomNumber.nextInt(15) ; 
        System.out.println(x);
   

    }
    
}
