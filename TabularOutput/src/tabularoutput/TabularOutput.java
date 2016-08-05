
package tabularoutput;


public class TabularOutput {

  
    public static void main(String[] args) {
        
       
        System.out.println("N\t10*N\t100*N\t1000*N");
        
        for( int N = 1; N<=5;N++)
        System.out.println(N+"\t"+N*10+"\t"+N*100+"\t"+N*1000);
        
        }
    
}
