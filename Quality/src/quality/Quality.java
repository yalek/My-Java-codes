

package quality;

import java.util.Scanner;
public class Quality {
public static int ans;
public static int average;
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter the students average");
        average = input.nextInt();
        
       System.out.println(qaulityPoints(average));
       
    }
    public static int qaulityPoints(int average){
        
                if(average>=90)
                     ans =4;
                else if(average>=80)
                    ans=3;
                else if(average>=70)
                    ans=2;
                else if(average>=60)
                       ans=1;
                else if(average<60)
                    ans=0;
        
    return ans;
    }
    
}
