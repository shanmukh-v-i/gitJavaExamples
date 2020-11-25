<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
     <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>First_Name</th><th>Last_name</th><th>Department</th></tr>  
   <c:forEach var="employee" items="${listContact}">   
   <tr>  
   <td>${employee.firstName}</td>  
   <td>${employee.lastName}</td>  
   <td>${employee.department}</td>  
   <td><a href="deleteemployee/${employee.firstName}">Delete</a></td>  
    
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="employee">Add New Employee</a>

</body>
</html>