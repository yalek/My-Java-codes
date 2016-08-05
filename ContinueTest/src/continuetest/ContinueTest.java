
package continuetest;


public class ContinueTest {

    public static void main(String[] args) {
    
        for(int count=0; count<=10; count++)
            {if(count==5)
                continue;
            System.out.printf("%d", count);
            }
        System.out.println("\nSkipped the loop at5 using continue");
    }
    
}
