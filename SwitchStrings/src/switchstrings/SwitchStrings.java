

package switchstrings;

import java.util.Scanner;
public class SwitchStrings {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String city = input.next();
        String zipcode;
        switch(city){
            case "nairobi":
                zipcode = "000100";
                break;
            case "kampala":
                zipcode = "00200";
                break;
            case "dodoma":
                zipcode = "00300";
                break;
            default:
                zipcode = "808080";
        }
        System.out.println(zipcode);
                
    }
    
}
