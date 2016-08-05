/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thidtest;

/**
 *
 * @author USER
 */
public class ThidTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleTime time = new SimpleTime(2,3,9);
        System.out.println(time.buildString());
    }
    
}
class SimpleTime{
    private int hour;
    private int minute;
    private int second;
    
    public SimpleTime(int hour, int minute, int second){
     this.hour = hour;
     this.minute = minute;
     this.second = second;
    
    }
    
    public String buildString(){
    
    return String.format("%24s: %s\n%24s: %s","this.toUniversalString()", this.toUniversalString(),"toUniversalString()", toUniversalString());
    }
    
    public String toUniversalString(){
    return String.format("%02d:%02d:%02d",this.hour, this.minute, this.second);
    }

}
