
package maxmin;

import java.util.Scanner;
public class Maxmin {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a, b,c,d,e;
       
       System.out.println("Enter the first no:");
       a = input.nextInt();
        System.out.println("Enter the second no:");
       b = input.nextInt();
        System.out.println("Enter the third no:");
       c = input.nextInt();
        System.out.println("Enter the fourth no:");
       d = input.nextInt();
        System.out.println("Enter the fifth no:");
       e = input.nextInt();
       
       if(a>b && a>c && a>d && a>e){
       System.out.printf("The largest is %d", a);}
       if(b>a && b>c && b>d && b>e){
       System.out.printf("The largest is %d", b);}
       if(c>a && c>b && c>d && c>e){
       System.out.printf("The largest is %d", c);}
       if(d>a && d>b && d>c && d>e){
       System.out.printf("The largest is %d", d);}
       if(e>a && e>b && e>c && e>d){
       System.out.printf("The largest is %d", e);}
       
       if(a<b && a<c && a<d && a<e){
       System.out.printf("The smallest is %d", a);}
       if(b<a && b<c && b<d && b<e){
       System.out.printf("The smallest is %d", b);}
       if(c<a && c<b && c<d && c<e){
       System.out.printf("The smallest is %d", c);}
       if(d<a && d<b && d<c && d<e){
       System.out.printf("The smallest is %d", d);}
       if(e<a && e<b && e<c && a<d){
       System.out.printf("The smallest is %d", e);}
       
    }
    
}
