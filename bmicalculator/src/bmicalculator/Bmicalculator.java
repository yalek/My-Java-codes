

package bmicalculator;

import java.util.Scanner;
public class Bmicalculator {

  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double weight, height,bmi;
        System.out.println("Enter your weight in kgs");
        weight = input.nextDouble();
        System.out.println("Enter your height in metres");
        height = input.nextDouble();
        bmi = weight/(height*height);
        System.out.printf("Your BMI is %f\n",bmi);
        
        System.out.println("BMI VALUES");
        System.out.println("Underweight:\tLess than 18.5");
        System.out.println("Normal:\t\tBetween 18.5 - 24.9");
        System.out.println("Overweight:\tBetween 25 - 29.9");
        System.out.println("Obese:\t\t30 and above");
        
        if(bmi < 18.5){
        System.out.println("You are underweight");}
        if(bmi > 18.5 && bmi<24.9){
        System.out.println("You are Normal");}
        if(bmi >25 && bmi<29.9){
        System.out.println("You are Overweight");}
        if(bmi>30){
        System.out.println("You are Obese");}
        
        
    }
    
}
