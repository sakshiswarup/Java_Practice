<%@page import="java.awt.geom.Path2D"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Scriplet Tag
Inside this tag java code allowed,Local variable allowed ,Access specifiers ,method (static & non static) ,html code not allowed
Implicit Object=(this are built in object in scriptlet tag) request,response,out ,session
-->
<%---comment
    <%
	for (int i = 0; i < 10; i++) {//allowed
		System.out.println(i);
	}
	
	<%
	//out.println("hello");//allowed
	//request.setAttribute("x", "welcome");//allowed
	//access specifiers not allowed
	//public int x= 10;//error
	//int y =100;//not allowed local variable
	
	//public void test(){//error	
	//}
	//<h2></h2>//error 
	%> 
	--%>
	
	<!--Declaration Tag in this (method,non static variables,access specifiers) are allowed
	implicit object,html code not allowed
	-->
<%---comment     
     <%!
     //public int x =10; //allow
    // public void test(){//allow
    //	 System.out.println(x);//allow
    // }
     //out.println(x);//not allowed
     
     %>
     
     <%!
     static int z= 100;
     public int x =10;
     public int test(){
    	 int a = 500;
    	 return a;
     }
     %>
     <%
     out.println(z);
     out.println(x);
     out.println(test());
     %>
--%>
<%---comment 
Expression Tag=(used to print output in web page similar to out.println)one statement,out.println and semilcolon nit allowed in that
     --%>
     <%!//declaration tag
     static int x = 100;
     public int z =10;
     public int test(){
    	 int a =20;
    	 return a;
     }
     %>
     <%= z%>
     <%= x %>
     <%= test() %>
     <%= z+100 %>
     <%= test()+100 %>
     
</body>
</html>