

package multiples;

import java.util.Scanner;
public class Multiples {
    public static int int1;
    public static int int2;
    public static boolean ans;
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
            
       System.out.println("Enter your pair separated by space: ");
       int1 = input.nextInt();
       int2 = input.nextInt();
       System.out.println(isMultiple(int1,int2));
      // if()
    }
    public static boolean isMultiple(int int1, int int2){
      if(int2%int1==0)
          ans = true;
      else
          ans = false;
    
    return ans;
    }
    
}
