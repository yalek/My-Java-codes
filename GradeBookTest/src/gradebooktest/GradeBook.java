
package gradebooktest;
import java.util.Scanner;
public class GradeBook {
    private String courseName;
    private String teacher;
    private int total= 0;
    private int grade;
    private int counter = 0;
    private double average;
 
    private int aCount;
    private int bCount;
    private int cCount;
    private int dCount;
    private int eCount;

    public GradeBook (String name, String instructorName){
        courseName = name;
        teacher = instructorName;}
    
    public void setCourseName(String name){
    courseName=name;
    
    }
    public String getCourseName(){
        return courseName;
    }
    public void setTeacher(String instructorName){
        teacher = instructorName;
    }
    public String getTeacher(){
            return teacher;
        }

    public void displayMessage(String courseName,String instructorName){
    System.out.printf("Welcome to Grade Book for \n%S\nThe Instructor is:%s!\n", getCourseName(),getTeacher());
    }
    public void determingClassAverage(){
        Scanner input = new Scanner(System.in);
    /* while(counter<=10){
                System.out.println("Enter the grade");
                grade = input.nextInt();
                total = total+grade;
                counter = counter+1;
            }
        
        average = total/10;
        System.out.printf("The total number of students were %d",counter);
         System.out.printf("The total marks were %d",total);
          System.out.printf("The average was %d",average);*/
        
         System.out.println("Enter grade or -1 to quit");       
        //grade = input.nextInt();
         
        while(grade != -1){
            grade = input.nextInt();
             total = total + grade;
             counter = counter +1;
                
                incrementLetterGradeCounter(grade);
         }
    }
    private void incrementLetterGradeCounter(int grade){
    
        switch(grade/10)
         {  case 9:
            case 10:
             ++aCount;
             break;
                
            case 8:
                ++bCount;
                break;
            case 7:
                ++cCount;
                break;
            case 6 :
                ++dCount;
                break;
            default:
                ++eCount;
                break;
        }
            
    }
    public void displayGrade(){
        
        System.out.println("Grades Report");
        
         if(counter!=0){
                    average = (double)total/counter;
                    System.out.printf("\nThe total for %d is %d\n", counter, total);
                    System.out.printf("The average is %.2f\n", average);
                    System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n", 
                            "The number of Students who received each grade:",
                            "A:",aCount,
                            "B:",bCount,
                            "C:",cCount,
                            "D:",dCount,
                            "E:",eCount);
            }
         else
             System.out.println("No grades were entered");
    
    }
}
