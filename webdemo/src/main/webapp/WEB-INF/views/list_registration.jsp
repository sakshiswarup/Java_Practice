<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- create variable use of jstl tags (learning purpose)
<c:set var="x" value="hello"></c:set>
<c:out value="${x}"></c:out>
 print value with the help of jstl tag 
<c:out value="100"></c:out>
ex3
 <c:forEach var = "i" begin = "1" end = "5">
         Item <c:out value = "${i}"/><p>
      </c:forEach> -->
      
      <table>
      <tr>
      <th>Name</th>
      <th>Email id</th>
      <th>Mobile</th>
      </tr>
      
      <c:forEach var="registration" items="${registrations}"> 
      <tr>
      <td>${registration.name}</td>
      <td>${registration.emailId}</td>
      <td>${registration.mobile}</td>
      </tr>
      </c:forEach>
      </table>
      
      
</body>
</html>
