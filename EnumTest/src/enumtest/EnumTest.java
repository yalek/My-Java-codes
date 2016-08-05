/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enumtest;

/**
 *
 * @author USER
 */
import java.util.EnumSet;
public class EnumTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println( "All books:\n" );
        for(Book book:Book.values())
            System.out.printf( "%-10s%-45s%s\n", book,book.getTitle(), book.getCopyrightYear());
        
        System.out.println( "\nDisplay a range of enum constants:\n" );
        
        for(Book book: EnumSet.range(Book.JHTP,Book.CPPHTP))
        System.out.printf( "%-10s%-45s%s\n", book,book.getTitle(), book.getCopyrightYear());

    }
    
}
