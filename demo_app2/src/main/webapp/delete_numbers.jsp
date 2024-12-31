<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	  <!-- Adding directive tag -->
    <%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Numbers</title>
</head>
<body>
	<h2>Delete Numbers</h2>
	<form action="delete" method="post">
		Num1:<input type="text" name="num1" />
		Num2:<input type="text"name="num2" /> 
		<input type="submit" value="delete" />
	</form>
	
	<%
	if(request.getAttribute("res")!= null){
		out.println(request.getAttribute("res"));
	}
	%>
	<%
	if(request.getAttribute("error")!= null){
		out.println(request.getAttribute("error"));
	}
	%>
</body>
</html>