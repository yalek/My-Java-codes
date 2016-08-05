
package breaktest;

public class BreakTest {

    
    public static void main(String[] args) {
        System.out.println("Welcome\n");
        
        int count;
        
        for(count=1; count<=10; count++)
                {
                        if(count==5)
                        break;
                   System.out.printf("%d", count);
                }
        
                
        System.out.printf("\nBroke from the loop at count: %d\n", count);
        System.out.println("\nBroke from the loop at count: \n"+count);
        
    }
    
}
