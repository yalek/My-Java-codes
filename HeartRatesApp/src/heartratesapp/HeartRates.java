
package heartratesapp;


public class HeartRates {
    private String first;
    private String last;
    private int month;
    private int day;
    private int year;
    public int age;
    public int mhr;
   public HeartRates(String first, String last, int month, int day, int year){
        this.first= first;
        this.last = last;
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    public void setFirst(String first){this.first = first;}
    public String getFirst(){return first;}
    
    public void setLast(String last){this.last = last;}
    public String getLast(){return last;}
    
    public void setMonth(int month){this.month = month;}
    public int getMonth(){return month;}
    
    public void setDay(int day){this.day = day;}
    public int getDay(){return day;}
    
    public void setYear(int year){this.year = year;}
    public int getYear(){return year;}
    
    public void age(){age = 2016-year;
        System.out.println("Your age is:"+ age);
        }
    public void mhr(){mhr = 220-age;
        int mhrr = mhr;
        System.out.println("Your Maximum heart rate is:"+mhrr);
        }
    public void thr(){
        double lhr =0.5*mhr;
        double uhr = 0.85*mhr;
        System.out.println("Your target heart rate is between:\t"+ lhr +"\tand\t" +uhr);}
}
