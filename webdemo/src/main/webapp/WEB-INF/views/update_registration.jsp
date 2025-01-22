<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration..</title>
</head>
<body>
  <h2>Enter the details..</h2>
  <form action="updateReg" method="post">
  <pre>
  <input type="hidden" name="id" value="${registration.id}"/>
    name <input type="text" name="name" value="${registration.name}"/>
    email <input type="text" name="emailId" value="${registration.emailId}"/>
    mobile<input type="text" name="mobile" value="${registration.mobile}"/>
    <input type="submit" value="save"/>
  </pre>
  </form>
  
  ${msg}
</body>
</html>
