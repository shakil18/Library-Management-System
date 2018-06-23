/*All Copyright's reserved with-
* NAME:SHAKIL, AZIZUL HAKIM.
* ID: 13-23005-1
* CSE,AIUB
* Project Name: Libre Keeper
* It works like a library Manager. It can authorized the Registered and Unregistered person and make database of Borrow and Return
* Book from Library with its unique and simple method. It is really easy to Maintain and really light apps for Desktop. */


package libre.keeper;

/**
 *
 * @author Raihan
 */
public class Book 
{
    private String book_name;
    private String author_name;
    private int availabiliity;
    
    public Book()
    {
    }
   
    public Book(String bn,String an,int av) {
        
        this.book_name = bn;
        this.author_name = an;
        this.availabiliity = av;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public int getAvailabiliity() {
        return availabiliity;
    }

    public void setAvailabiliity(int availabiliity) {
        this.availabiliity = availabiliity;
    }
   
}
