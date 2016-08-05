
package sumarray;

public class SumArray {

    public static void main(String[] args) {
        // TODO code application logic here
        int []array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int sum = 0;
        
        for(int counter=0; counter<array.length; counter++){
         sum = sum+ array[counter];
        }
        
        System.out.println(sum);
    }
    
}
