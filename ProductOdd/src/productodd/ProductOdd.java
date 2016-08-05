
package productodd;

public class ProductOdd {

    public static void main(String[] args) {
        
        int odd;
          int tot=0;
        for(odd=1; odd<=15; odd+=2){
        int prod = odd*odd;
        System.out.println(prod);
        tot = tot+prod;
        }
         System.out.println(tot);
    }
    
}
