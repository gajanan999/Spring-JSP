<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring:message code="LoginSuccess"  var="variable1"/>
<input type="text" value="${variable1}"/>


<form action="login.html" method="get">
<input type="text" name="userID"/><br>
<input type="password" name="password"/><br>
<input type="submit" value="login"/>
</form>

</body>
</html>