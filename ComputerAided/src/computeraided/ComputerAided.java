
package computeraided;

import java.util.Scanner;
import java.util.Random;
public class ComputerAided {
    private static   Random a = new Random();
    private static Random b = new Random();
    private static int a1;
    private static int b1;
    private static int mult;
    private static int ans;
    private static int y;
    private static int n;
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int correctAns = 0;
        int wrongAns = 0;
        int questions = 5;
        
        while(counter < questions){
                boolean correct = true;
                multiple();
                
                while(correct){
                            counter++;
                            System.out.printf("What is %d times %d\n", a1,b1);
                            ans = input.nextInt();
                            mult = a1*b1;
                            if(ans!=mult){
                                if (counter < questions){
                                    y = 1 + a.nextInt(4);
                                    responsen2(y);
                                } else {
                                    correct = false;
                                }
                                wrongAns++;
                            } else {
                                correctAns++;
                                correct = false;
                            }
                }
                //counter++;
                y = 1 + a.nextInt(4);
                //response(y);
                System.out.println(response(y));
        }
        System.out.println("Counter: "+ counter +"\tCorrect: "+ correctAns +" \tWrong: "+ wrongAns);
    }
    public static void multiple(){
     
     a1 = 1 + a.nextInt(9);
     b1 = 1 + b.nextInt(9);
    }
    public static String response(int y){
    //y = 1 + a.nextInt(4);
        String str = "";
        switch(y){
            case(1):
                str = "Very good!";
                break;
            case(2):
                str = "Excellent!";
                break;
            case(3):
                str = "Nice work!"; 
                break;
            case(4):
                str = "Keep up the good work!";  
                break;
    }
        return str;
    
    }
    public static void responsen2(int n){
        //n =1+ b.nextInt(4);
        switch(n){
            case(1):
                System.out.println("No. Please try again.");
                break;
            case(2):
                System.out.println("Wrong. Try once more.");
                break;
            case(3):
                System.out.println("Don't give up!"); 
                break;
            case(4):
                System.out.println("No. Keep trying.");  
                break;}
    
    
    }
    
}
