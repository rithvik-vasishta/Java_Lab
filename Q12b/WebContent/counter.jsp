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
	
	if(session.isNew())
	{
		int n=0;
		out.println("You are first time and are eligible");
		n=1;
		session.setAttribute("counts",n);
	}
	else
	{
		out.println("welcome back,you are eligible");
		int n=(Integer)session.getAttribute("counts");
		n+=1;
		session.setAttribute("counts",n);
		out.println("Total count:"+session.getAttribute("counts"));
	}

%>
</body>
</html>