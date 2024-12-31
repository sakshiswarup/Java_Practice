<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!-- Adding directive tag -->
    <%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add numbers</title>
</head>
<body>
 <h2>Add Numbers</h2>
 <form action="add" method ="post">
  Num1:<input type="text" name="num1"/>
  Num2:<input type="text" name="num2"/>
  <input type ="submit" value="Add"/>
 </form>
 
 <%
  if(request.getAttribute("res")!= null){
	  out.println(request.getAttribute("res"));//reading the value
  }
 %>
 <%
	if(request.getAttribute("error")!= null){
		out.println(request.getAttribute("error"));
	}
	%>
</body>
</html>