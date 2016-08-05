
package invoicetest;


public class InvoiceTest {

   
    public static void main(String[] args) {
        
        //invoice m = new invoice("H05","hammer",-4,200);
                invoice m = new invoice("H05","hammer",-4,200);
            m.setP(40);
            m.setQua(30);
        m.getInvoiceAmount();
    }
    
}
