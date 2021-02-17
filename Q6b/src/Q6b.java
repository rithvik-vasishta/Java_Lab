

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Q6b
 */
@WebServlet("/Q6b")
public class Q6b extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Q6b() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db2b","root","root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from ps");
			PrintWriter out=response.getWriter();
			out.println("<table><tr><th>ID</th><th>NAME</th><th>AREA</th><th>PhNo</th></tr>");
			while(rs.next())
			{
				int a=rs.getInt(1);
				String b=rs.getString(2);
				String c=rs.getString(3);
				String d=rs.getString(4);
				out.println("<tr><td>"+a+"</td><td>"+b+"</td><td>"+c+"</td><td>"+d+"</td>");
			}out.println("</table>");
		}catch(Exception e) {}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
