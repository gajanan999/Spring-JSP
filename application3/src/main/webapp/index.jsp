<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ page import = "java.io.*,java.util.*" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html xmlns:jsp='http://java.sun.com/JSP/Page'>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<spring:message code="landing.title"  var="variable1"/>
<input type="text" value="${variable1}"/>

<!-- <a href="hello.html">click</a>  -->
<%-- <jsp:forward page="hello.html"/>  --%>
    <form action="login.html" method="post">  
    Name:<input type="text" name="name"/><br/>  
    Password:<input type="password" name="password"/><br/>  
    <input type="submit" value="login"/>  
    </form> 
    <form action="register.html" method="get">  
    Name:<input type="text" name="name"/><br/>  
    Password:<input type="password" name="password"/><br/>  
    <input type="submit" value="login"/>  
    </form>  
${message }

<a href="hello.html">Hello Spring</a> |   
<a href="contact.html">Contact</a>
<a href="fileupload.html">Contact</a>
</body>
</html>