
package healthprofiletest;

public class HealthProfile {
    private String fName;
    private String lName;
    private String gender;
    private int month;
    private int day;
    private int year;
    private double height;
    private double weight;
    private int age;
    private int mhr;
    private int thr;
    private double bmi;
    
    public HealthProfile(String fName, String lName, String gender, int month, int day, int year, double height, double weight){
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
        this.month = month;
        this.day = day;
        this.year = year;
        this.height = height;
        this.weight = height;
    }
    public void setFName(String fName){this.fName = fName;}
    public String getFName(){return fName;}
    
    public void setLName(String lName){this.lName = lName;}
    public String getLName(){return lName;}
    
    public void setGender(String gender){this.gender = gender;}
    public String getGender(){return gender;}
    
    public void setMonth(int month){this.month = month;}
    public int month(){return month;}
    
    public void setDay(int day){this.day = day;}
    public int getDay(){return day;}
    
    public void setYear(int year){this.year = year;}
    public int getYear(){return year;}
    
    public void setHeight(double height){this.height = height;}
    public double getHeight(){return height;}
    
    public void setWeight(double weight){this.weight = weight;}
    public double getWeight(){return weight;}
    
    public void age(){age = 2016 - year;
            System.out.println("You are: "+ age);
            }
    public void mhr(){mhr = 220 - age;
    System.out.println("Your Maximum heart rate is\t:" + mhr);}
    public void thr(){
            double lhr = 0.5*mhr;
            double uhr = 0.58*mhr;
            System.out.println("Yout target is between:\t"+lhr+"\tand\t"+uhr);
    }
    public void bmi(){
               bmi = ((weight)/(height*height));
               System.out.println("Your BMI is:\t"+ bmi);
               if(bmi<18.5)
               System.out.println("You are underweight");
               else if(bmi>=18.5 && bmi<25)
                   System.out.println("You have normal weight");
               else if(bmi>=25 && bmi<30)
                   System.out.println("You are overweight");
               else
                   System.out.println("You are obese");
        }
            
    
    
}
