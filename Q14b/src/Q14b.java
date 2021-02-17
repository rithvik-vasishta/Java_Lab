import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Q14b {
	public static void main(String [] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db2b","root","root");
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=stmt.executeQuery("select * from ps");
			while(rs.next())
			{
				if(rs.getInt(1)==3)
					{rs.updateString(4, "99999999999");
					rs.updateRow();
					}
			}
			rs=stmt.executeQuery("select * from ps");
			while(rs.next())
			{

				System.out.print("ID:"+rs.getInt(1));
				System.out.print(" Name:"+rs.getString(2));
				System.out.print(" Area:"+rs.getString(3));
				System.out.println(" PhoneNumber:"+rs.getString(4));
			}
		}catch(Exception e) {e.printStackTrace();}
	}

}
