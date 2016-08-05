
package analysis;
import java.util.Scanner;
public class Analysis {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int passes = 0;
        int failures=0;
        int ans;
        int total;
        int studentcounter=1;
        
        while(studentcounter<=10){
            System.out.println("Enter the results: 1 for pass; 2 for fail");
            ans = input.nextInt();
            
            if(ans==1)
                passes = passes+1;
                //passes+=1;
            if(ans==2)
                    failures=failures+1;
                    else
                             while(ans!=1 || ans!=2){
                                System.out.println("Entered Wrong results.Try again\n Enter the results: 1 for pass; 2 for fail");
                                ans = input.nextInt(); 
                                if(ans==1 || ans==2)
                                    break;
                                    }
                //failures+=1;
                //failures++;
            studentcounter = studentcounter+1;
        }
        
        System.out.printf("Total number is: %d\nPassed:%d\nFailed:%d",studentcounter,passes,failures);
        
        if(passes>=8)
            System.out.println("Bonus to Instructor");
        else
            System.out.println("Improve");
    }
    
}
