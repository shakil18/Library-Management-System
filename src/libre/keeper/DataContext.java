/*All Copyright's reserved with-
* NAME:SHAKIL, AZIZUL HAKIM.
* ID: 13-23005-1
* CSE,AIUB
* Project Name: Libre Keeper
* It works like a library Manager. It can authorized the Registered and Unregistered person and make database of Borrow and Return
* Book from Library with its unique and simple method. It is really easy to Maintain and really light apps for Desktop. */

package libre.keeper;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Raihan
 */
public class DataContext {
	private Connection connection;
	private Statement statement;
	
	public DataContext()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/takeBooks", "root", "");
			this.statement = this.connection.createStatement();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

        public String getID(String pID)
	{
		try
		{
			String sql = ("SELECT person_id FROM personlist WHERE person_id LIKE '" + pID + "'");;
			ResultSet rs = this.statement.executeQuery(sql);
			String log = new String();
			while(rs.next())
			{
				log = rs.getString("person_id");
			}
			return log;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}
        
                public String getBookID(String pID)
	{
		try
		{
			String sql = ("SELECT book_name FROM booksinfo WHERE book_name LIKE '" + pID + "'");;
			ResultSet rs = this.statement.executeQuery(sql);
			String log = new String();
			while(rs.next())
			{
				log = rs.getString("book_name");
			}
			return log;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}
                
        public boolean BOOK(String id,String book){
            try{
                String sql=("UPDATE personlist set issue_book='"+book+"'where person_id like'"+id+"'");
                this.statement.execute(sql);
                return true;
            }
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
        }
        
//        public boolean BookDec(String book){
//            try{
//                String sql=("UPDATE booksinfo set availability='"+book+"'where person_id like'"+id+"'");
//                this.statement.execute(sql);
//                return true;
//            }
//		catch(Exception ex)
//		{
//			ex.printStackTrace();
//			return false;
//		}
//        }
}
