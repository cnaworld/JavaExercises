public class InvoiceTest {
    public static void main (String[] args)
    {
        Invoice invoice1 = new Invoice("456" , "computer " , 2 , 55.6 ) ;
        Invoice invoice2 = new Invoice("123" , "laptop " , 1 , 95.5 ) ;

        System.out.printf("INVOICE 1%nNumber: %s%nDescription: %s%nQuantity: %d%nPrice per item: $ %,.2f%nInvoice amount: $ %,.2f%n%n",
                invoice1.getNumber() ,invoice1.getDescription() , invoice1.getQuantity() , invoice1.getPrice() , invoice1.getInvoiceAmount());
        System.out.printf("\nINVOICE 2%nNumber: %s%nDescription: %s%nQuantity: %d%nPrice per item: $ %,.2f%nInvoice amount: $ %,.2f%n%n",
                invoice2.getNumber() ,invoice2.getDescription() , invoice2.getQuantity() , invoice2.getPrice() , invoice2.getInvoiceAmount());

    }
}
