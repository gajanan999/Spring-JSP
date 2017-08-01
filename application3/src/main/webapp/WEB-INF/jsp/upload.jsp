<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring File Upload Example</title>
</head>
<body>
<form:form method="post" action="fileupload_controller.html">  
    <label>Upload File</label>
    <input type="file" name="file1" id="file1" value="">
     <label>Upload File</label>
    <input type="file" name="file2" id="file2" value="">
     <button type="submit">Upload Files</button>
</form:form> 


</body>
</html>