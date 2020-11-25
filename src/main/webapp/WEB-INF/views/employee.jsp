<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>Spring MVC - Employee</title>
</head>
<body>
<h2>Employee Details</h2>
<form:form method="post" modelAttribute="employee" action="employee">
<table>
<tr>
<td><form:label path="firstName">First Name :</form:label></td>
<td><form:input path="firstName" /></td>
</tr>
<tr>
<td><form:label path="lastName">Last Name :</form:label></td>
<td><form:input path="lastName" /></td>
</tr>
<tr>
<td><form:label path="department">Department :</form:label></td>
<td><form:input path="department" /></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Submit" /></td>
</tr>
</table>
</form:form>
</body>
</html>