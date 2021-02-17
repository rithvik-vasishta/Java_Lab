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
	String name=request.getParameter("name");
	int age=Integer.parseInt(request.getParameter("age"));
	int marks=Integer.parseInt(request.getParameter("marks"));
	if(marks>=20)
	{
		//out.println("Hang on");
		RequestDispatcher rd=request.getRequestDispatcher("counter.jsp");
		rd.forward(request,response);
	}
	else
	{
		out.println("BYE");
	}

%>
</body>
</html>