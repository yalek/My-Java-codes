
package oddeven;

import java.util.Scanner;
public class Oddeven {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b, result, result1, result2;
        
        System.out.println("Enter a number");
        a=input.nextInt();
        System.out.println("Enter b number");
        b=input.nextInt();
        
        result = a%2;
        
        if(result == 0){
        System.out.println("Even");}
        if(result!=0){
        System.out.println("Odd");}
        
        result1 = a%b;
        
        if(result1==0){
            result2=a/b;
        System.out.printf("%d",result2);}
        
    }
    
}
