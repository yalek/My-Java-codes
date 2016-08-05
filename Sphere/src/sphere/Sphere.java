
package sphere;
import java.util.Scanner;
public class Sphere {
    private static double radius;
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter the radius of the sphere");
       radius = input.nextDouble();
       
       System.out.println(sphereMethod(radius));
       System.out.printf("Volume is: %f",sphereMethod(radius));
        }
    
    public static double sphereMethod(double radius){
    
        double volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
        return volume;
    }
    
}
