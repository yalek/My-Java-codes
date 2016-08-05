

package summing;


public class Summing {

    
    public static void main(String[] args) {
        int total=0;
        
       /* for(int num = 2; num<=20; num+=2)
            total = total +num;
        System.out.printf("%d\n", total);*/
        
        for(int num=2; num<=20; total+=num, num+=2);
        System.out.println(total);
    }
    
}
