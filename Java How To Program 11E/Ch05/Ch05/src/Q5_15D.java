public class Q5_15D {
    public static void main(String[] args) {
        int i , j , k ; 
        for (i = 1 ; i <= 10 ; i++ )
        {
            for( k= 10 ; k >= i  ; k-- )
            {
             System.out.print( ' ');
             }
            
                for( j = 1 ; j <= i  ; j ++ )
                {
                 System.out.print('*');

                 }

            
            System.out.println();
           
        }
    }
    
}

