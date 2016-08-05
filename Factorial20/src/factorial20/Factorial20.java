
package factorial20;

public class Factorial20 {

    public static void main(String[] args) {
        int n = 20;
        int product;
        long ans=1;
       int t=1;
        
        for(n=20; n>=1;n--){
        product = n*t;
        t=n-1;
        ans = ans*product;}
        
        System.out.println(ans);
        
    }
    
}
