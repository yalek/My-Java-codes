/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package time2test;

/**
 *
 * @author USER
 */
public class Time2Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Time t1 =  new Time();
        Time t2 =  new Time(2);
        Time t3 =  new Time(21,34);
        Time t4 =  new Time(12,25,42);
        Time t5 =  new Time(t4);
        
        System.out.println( "Constructed with:" );
        System.out.println( "t1: all arguments defaulted" );
        System.out.printf( " %s\n", t1.toUniversalString());
        System.out.printf( " %s\n", t1.toString() );
        
        System.out.println("t2: hour specified; minute and second defaulted" );
        System.out.printf( " %s\n", t2.toUniversalString() );
        System.out.printf( " %s\n", t2.toString() );
        
        System.out.println("t3: hour and minute specified; second defaulted" );
        System.out.printf( " %s\n", t3.toUniversalString() );
        System.out.printf( " %s\n", t3.toString() );
        
        System.out.println( "t4: hour, minute and second specified" );
        System.out.printf( " %s\n", t4.toUniversalString() );
        System.out.printf( " %s\n", t4.toString() );
        
        System.out.println( "t5: Time2 object t4 specified" );
        System.out.printf( " %s\n", t5.toUniversalString() );
        System.out.printf( " %s\n", t5.toString() );
        
        try{
        Time t6 = new Time( 27, 74, 99 );
        }
        catch(IllegalArgumentException e){
        System.out.printf( "\nException while initializing t6: %s\n", e.getMessage());
        }
    }
    
}
