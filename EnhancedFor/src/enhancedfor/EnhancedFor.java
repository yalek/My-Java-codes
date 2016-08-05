
package enhancedfor;

public class EnhancedFor {

    public static void main(String[] args) {
       int [] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
       int total =0 ;
       
       for(int number: array)
           total+=number;
       
       System.out.printf("The sum of the array is: %d\n", total);
    }
    
}
