
package time2test;

public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time(){
    this(0,0,0);
    }
    public Time(int h){
    this(h,0,0);
    }
    
    public Time(int h, int m){
    this(h,m,0);
    }
    public Time(int h, int m, int s){
     setTime(h,m,s);
    }
    
    public Time(Time time3){
    this(time3.getHour(),time3.getMinute(), time3.getSecond());
    }
    public void setTime(int h, int m, int s){
    setHour(h);
    setMinute(m);
    setSecond(s);
    
    }
    public void setHour(int h){
        if(h>=0 && h<24)
            hour =h ;
        else
            throw new IllegalArgumentException("hour must be between 0-23 ");
    }
    public void setMinute(int m){
    if(m>=0 && m<60)
        minute = m;
    else
        throw new IllegalArgumentException("Minute must be between 0-59");
    }
     public void setSecond(int s){
    if(s>=0 && s<60)
        second = ((s>=0&&s<60)?s:0);
    else
        throw new IllegalArgumentException("Minute must be between 0-59");
    }
     public int getHour(){
     return hour;
     }
     public int getMinute(){
     return minute;
     }
     public int getSecond(){
     return second;
     }
     
     public String toUniversalString(){
     
     return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
     }
     public String toString(){
     return String.format("%d:%02d:%02d %s",(getHour()==0||getHour()==12?12:getHour()/12),getMinute(), getSecond(),(getHour()<12?"AM":"PM"));
     }
}
