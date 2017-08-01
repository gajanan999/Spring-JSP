<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Mvc Fileupload Example</title>

</head>
<body>
 
   <div >
    <h2>Uploaded File Details</h2>
    <table>
     <tr>
      <td>File Name</td>
     </tr>
     <c:forEach items="${files}" var="filename">
              <tr>
      <td><c:out value="${filename}" /></td>
     </tr>
           </c:forEach>
     
    </table>
  
 </div>
</body>
</html>