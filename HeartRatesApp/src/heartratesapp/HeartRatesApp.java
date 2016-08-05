
package heartratesapp;

import java.util.Scanner;
public class HeartRatesApp {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your first Name:");
        String name = input.next();
        
        System.out.println("Enter your last Name");
        String last = input.next();
        
        System.out.println("Enter your month");
        int month = input.nextInt();
        
        System.out.println("Enter day");
        int day = input.nextInt();
        
        System.out.println("Enter year");
        int year = input.nextInt();
        
        System.out.println(name+" "+ last +" "+ month+" "+day+" "+year);
       //HeartRates app = new HeartRates("Kevin", "John", 04, 30,1992);
        HeartRates app = new HeartRates(name,last,month,day,year);
        app.age();
        app.mhr();
        app.thr();
    }
    
}
