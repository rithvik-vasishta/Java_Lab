import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookies")
public class readCookies extends HttpServlet {

	private static final long serialVersionUID = 1L;

    public readCookies() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		Cookie[] cookies=request.getCookies();
		String name="";
		String value="";
		
		if(cookies==null)
			pw.println("No Cookies <br>");
		else {
			for(int i=0;i<cookies.length;i++) {
				name=cookies[i].getName();
				value=cookies[i].getValue();
				pw.println("<tr> <td>"+ name +"</td>  <td>"+value+"</td> </tr><br>");
			}
		}
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
