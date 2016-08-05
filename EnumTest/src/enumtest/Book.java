
package enumtest;

public enum Book {

    JHTP( "Java How to Program", "2012" ),
    CHTP( "C How to Program", "2007" ),
    IW3HTP( "Internet & World Wide Web How to Program", "2008" ),
    CPPHTP( "C++ How to Program", "2012" ),
    VBHTP( "Visual Basic 2010 How to Program", "2011" ),
    CSHARPHTP( "Visual C# 2010 How to Program", "2011" );
    
    private String title;
    private String copyrightYear;
    
    Book( String bookTitle, String year ){
    title = bookTitle;
    copyrightYear = year;
    }
    
    public String getTitle(){
    return title;
    }
    
    public String getCopyrightYear(){
    return copyrightYear;
    }
}
