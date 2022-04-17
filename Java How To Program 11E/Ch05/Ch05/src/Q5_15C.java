public class Q5_15C {
    public static void main(String[] args) {
        int i , j , k ; 
        for (i = 1 ; i <= 10 ; i++ )
        {
            for( k= 1 ; k <= i  ; k++ )
            {
             System.out.print( ' ');
             }
                for( j = 10 ; j >= i  ; j -- )
                {
                 System.out.print('*');

                 }
            
            System.out.println();
        }
    }
    
}
