
package population.growth;
import java.math.BigInteger;
import java.util.*;
public class PopulationGrowth {

    public static void main(String[] args) {
      
       //int current= 7400000000; 
       BigInteger current = new BigInteger("7400000000");
        //t.setBit(current);
         // BigInteger p = new BigInteger(current);
        double rate = 0.0006;
        double e = 2.71828;
        BigInteger anticipated;
        BigInteger increase;
        
        System.out.println("Year\tAnticipated Pop\t\tNumerical increase");
        for(int year =1; year<=5; year++){
        
            anticipated = current*Math.pow(e, (rate.doubleValue(rate)*year));
            increase = anticipated - current;
            
            System.out.println(year+"\t"+anticipated+"\t"+increase);
        
        }
        
    }
    
}
