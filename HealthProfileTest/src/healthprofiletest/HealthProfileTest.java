package healthprofiletest;
import java.util.Scanner;
public class HealthProfileTest {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your first name");
        String fname = input.next();
        
        System.out.println("Enter your last Name");
        String lname = input.next();
        
        System.out.println("Enter your gender ");
        String gender = input.next();
        
        System.out.println("Enter your month of birth");
        int month = input.nextInt();
        
        System.out.println("Enter your day of birth");
        int day = input.nextInt();
        
        System.out.println("Enter your year of birth");
        int year = input.nextInt();
        
        System.out.println("Enter your weight in kgs?");
        double weight = input.nextDouble();
        
        System.out.println("Enter your height metres");
        double height = input.nextDouble();

        HealthProfile prof = new HealthProfile(fname, lname, gender, month,day,year, weight, height);
        
        prof.bmi();
        prof.age();
        prof.mhr();
        prof.thr();
    }
    
}
