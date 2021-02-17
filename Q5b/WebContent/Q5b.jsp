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
	out.println("Hello "+name+", You age is"+age);
	if(age >62)
		out.println("Please pay 50");
	else if(age<10)
		out.println("Please pay 30");
	else
		out.println("please pay 80");
%>
</body>
</html>