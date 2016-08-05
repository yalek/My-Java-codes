
package gradebooktest;

import java.util.Scanner;
public class GradeBookTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        GradeBook mygradebook1 = new GradeBook("Cs101 Intro to java programming","John Wandia");
                
        //System.out.printf("My gradebook is %s and %s\n", mygradebook1.getCourseName(), mygradebook1.getTeacher());
        mygradebook1.displayMessage(mygradebook1.getCourseName(),mygradebook1.getTeacher());
        mygradebook1.determingClassAverage();
        mygradebook1.displayGrade();
        
        /*System.out.printf("The initial course Name is %S\n", mygradebook.getCourseName()); 
        
        System.out.println("Enter your new course name");
        String theName = input.nextLine();
        mygradebook.setCourseName(theName);
        System.out.println();
        
        mygradebook.displayMessage(theName);*/
      
    }
    
}
