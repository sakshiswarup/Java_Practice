<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<h2>Add Students Details..</h2>
	<form action="addStudent" method="post">
		<pre>
           Name: <input type="text" name="name" />
           Email Id: <input type="text" name="email" />
           Mobile:<input type="text" name="mobile" />
           <input type="submit" value="save" />
        </pre>
	</form>
	
	<%
	if(request.getAttribute("msg")!= null){
		out.println(request.getAttribute("msg"));
	}
	%>
</body>
</html>