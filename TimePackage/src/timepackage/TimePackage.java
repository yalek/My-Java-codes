/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package timepackage;
import packagetest.Time;

/**
 *
 * @author USER
 */
public class TimePackage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Time time = new Time();
        
        System.out.print("The initial universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("The initial universal time is: ");
        System.out.println(time.toString());
        System.out.println();
        
        time.setTime(13, 27, 6);
        System.out.print("Universal time after setTime is: ");
        System.out.println(time.toUniversalString());
        System.out.print("The initial universal time is: ");
        System.out.println(time.toString());
        System.out.println();
        
        try{
        time.setTime(99, 99, 99);}
        catch(IllegalArgumentException e){
        System.out.printf( "Exception: %s\n\n", e.getMessage() );
        }
        System.out.println( "After attempting invalid settings:" );
        System.out.print( "Universal time: " );
        System.out.println(time.toUniversalString());
        System.out.print("Standard time: ");
        System.out.println(time.toString());
    }
    
}
