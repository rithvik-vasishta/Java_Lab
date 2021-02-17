

import java.io.IOException;
import java.sql.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Q2b
 */
@WebServlet("/Q2b")
public class Q2b extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Q2b() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db2b","root","root");
			int n=Integer.parseInt(request.getParameter("n"));
			String val=request.getParameter("value");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from ps");
			/*while(rs.next())
			{
			
				System.out.print("ID:"+rs.getInt(1));
				System.out.print(" Name:"+rs.getString(2));
				System.out.print(" Area:"+rs.getString(3));
				System.out.println(" PhoneNumber:"+rs.getString(4));
				//x=1;
				
			}*/
			int x=0;
			switch(n)
			{
			case 1:{
				while(rs.next())
				{
				if(rs.getString(3).equals(val))
				{
					System.out.print("ID:"+rs.getInt(1));
					System.out.print(" Name:"+rs.getString(2));
					System.out.print(" Area:"+rs.getString(3));
					System.out.println(" PhoneNumber:"+rs.getString(4));
					x=1;
					
				}}
				if(x==0)
					System.out.println("DATA NOT FOUND");
				break;
			}
			case 2:{
				while(rs.next())
				{
				if(rs.getString(4).equals(val))
				{
					System.out.print("ID:"+rs.getInt(1));
					System.out.print(" Name:"+rs.getString(2));
					System.out.print(" Area:"+rs.getString(3));
					System.out.println(" PhoneNumber:"+rs.getString(4));
					x=1;
					
				}}
				if(x==0)
					System.out.println("DATA NOT FOUND");
				break;
			
			}
		default:System.out.println("Please enter proper requisites");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
