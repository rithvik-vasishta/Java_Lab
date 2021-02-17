<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String user=request.getParameter("user");
	String pass=request.getParameter("pass");
	int n=0;
	if((user.equals("admin"))&&(pass.equals("admin")))
	{
		out.println("Welcome "+user);
		if(session.isNew())
		{
			out.println("Welcome to my website ");
			session.setAttribute("user",user);
			n+=1;
			session.setAttribute("novisits",n);
		}
		else
		{
			out.println("Welcome again!");
			out.println("You have visited "+session.getAttribute("novisits")+" times");
		}
		
		
	}
	else
	{
		out.println("Try Again");
	}
%>
</body>
</html>