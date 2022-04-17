public class Q5_24 {
    public static void main(String[] args) {
        int i , j , k ; 

        for(i = 1 ; i <= 9 ; i+=2){
            for(j = 1 ; j <= (9-i)/2 ; j++){
                System.out.print(" ");
            }
            for(k = 1 ; k <= 9-(2*(j-1)) ; k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        k = 7 ;
        for(i = 1 ; i <= 4 ; i++){
            for(j = 1 ; j <= (9-k)/2 ; j++){
                System.out.print(" ");
            }
            for(j = 1 ; j <= k ; j++){
                System.out.print("*");
            }
            k-=2;
            System.out.println();
        }
    }
        
    }

