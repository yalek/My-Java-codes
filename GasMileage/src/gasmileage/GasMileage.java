

package gasmileage;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
//Charset utf8 = StandardCharsets.UTF_8;
public class GasMileage {

    public static void main(String[] args) {
        int miles=0;
        int gallons=0;
        int trips;
        int x = 1;
        int y = 1;
        int driver;
        double milespergallon=0;
        int totmilespergallon =0;
        int count=1;
        int totMiles = 0;
        int totGallons = 0;
        String name = null;
        Scanner input = new Scanner(System.in);
        
      // System.out.println("Enter the miles travelled and gallons consumed per trip.\n Enter -1 to stop");
               
              System.out.print("Number of Drivers: ");
              driver = input.nextInt(); 
              while(y<=driver){
                    System.out.print("Enter drivers Name: ");
                    name = input.next(); 
                    System.out.print("Enter number of trips: ");
                    trips = input.nextInt();
              
                                System.out.print("\t\t+++++++++++++++++++++++\t\n");
                                
                                for(x=1;x<=trips ;x++){
                                System.out.println("Trip: "+count);
                                System.out.print("------------------------------------------------------------\n");
                                System.out.print("Enter miles: ");
                                miles = input.nextInt();
                                totMiles = totMiles +miles;
                                System.out.print("Enter gallons: ");
                                gallons = input.nextInt();
                                totGallons = totGallons+gallons;
                                milespergallon = miles/gallons;
                                System.out.print("Miles per gallon for this trip is: "+ milespergallon+"\n");
                                totmilespergallon+=milespergallon;
                                System.out.print("Total miles per gallon for the "+count+ " trips is: "+ totmilespergallon+"\n");
                                System.out.print("--------------------------------------------------------------\n");
                                count=count+1;
                                
                                }
                         ++y;
                        }
         
              System.out.println("Driver\tNoOfTrips\tTotMiles\tTotGallons\tTotalMilesperGallon");
              
                         
                                         
                            System.out.println("Driver\tNoOfTrips\tTotMiles\tTotGallons\tTotalMilesperGallon");
                            System.out.println(name+"\t"+count+"\t\t"+totMiles+"\t\t"+totGallons+"\t"+totmilespergallon);
                            System.out.print("--------------------------------------------------------------\n"); 
              
              
              
              
                  
              //System.out.println(name+"\t"+count+"\t\t"+totMiles+"\t"+totGallons+"\t"+totmilespergallon);
              //System.out.print("--------------------------------------------------------------\n");

              
              
              
              
       //miles = input.nextInt();
       //gallons = input.nextInt();
      
       
       /*while(miles!=-1 || gallons !=-1){
                
                 milespergallon = miles/gallons;
                 totmilespergallon += milespergallon;
                   System.out.println("Miles per gallon for this trip is: " + milespergallon);
                 miles = input.nextInt();
                 gallons = input.nextInt();
            }
       
       System.out.println(totmilespergallon);*/
       
       
    }
    
}
