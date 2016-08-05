
package tempconverter;
import java.util.Scanner;
public class TempConverter {
  
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Which one do you want to convert to: Ans 1 for Fahrenheit and 2 for Celcius");
      int ans = input.nextInt();
      
      if(ans==1){
      System.out.println("Enter your value in celcius: ");
      double value = input.nextDouble();
      System.out.println(celcius(value));}
      else
         if(ans==2){
      System.out.println("Enter your value in fahrenheit: ");
      double value = input.nextDouble();
      System.out.println(fahrenheit(value));}
      
  
    }
    public static double fahrenheit(double value){
    
        double fahren = (5.0/9.0)*(value-32);
        return fahren;
    }
    public static double celcius(double value){
    
        double celc = (9.0/5.0)*(value+32);
        return celc;
    }
    
}
