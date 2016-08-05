

package circle;

import java.util.Scanner;
public class Circle {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int radius;
     // float diameter, circumference, area;
      float pi= (float)3.14159;
      
      System.out.println("Enter the radius");
      radius = input.nextInt();
      
      /*diameter = 2*radius;
      circumference = 2*pi*radius;
      area = 2*pi*radius*radius;*/
      
     // System.out.printf("The diameter is %f, circumference is %f, and the area is %f", diameter, circumference,area);
      System.out.printf("The diameter is %f, circumference is %f, and the area is %f",(2*radius) , (2*pi*radius),(2*pi*radius*radius));
      
    }
    
}
