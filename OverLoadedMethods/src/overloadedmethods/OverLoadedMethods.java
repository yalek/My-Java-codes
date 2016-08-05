
package overloadedmethods;

public class OverLoadedMethods {

  
    public static void main(String[] args) {
   
        System.out.printf("The square for int is: %d", square(7));
                System.out.printf("The square for double is: %f\n", square(7.5));

    }
    
    public static int square(int value){
    System.out.printf("\nCalled square with int argument: %d\n", value);
    return value*value;
        }
    public static double square(double value){
    System.out.printf("\nCalled square with int argument: %f\n", value);
    return value * value;
        }
    
}
