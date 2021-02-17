

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Q3b
 */
@WebServlet("/Q3b")
public class Q3b extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Q3b() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    String initials(String name)
    {
    	String init=Character.toString(name.charAt(0));
    	for(int i=1;i<name.length();i++)
    	{
    		char c=name.charAt(i);
    		if((c==' ')&&((i+1)!=name.length()))
    		{
    			init+=Character.toString(name.charAt(i+1));
    		}
    			
    	}
    	init=init.toUpperCase();
    	return init;
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String name=request.getParameter("name");
		///System.out.println("The initials are:"+initials(name));
		PrintWriter pw=response.getWriter();
		pw.println("<html><head><h1>"+initials(name)+"</h1></head></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
