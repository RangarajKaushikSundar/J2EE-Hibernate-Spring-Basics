<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3> Mobile Details </h3>
	<form action="addNewMobile.do">
	<table><tr>
	<td>Mobile ID</td><td><input type="text" name="mid"></td></tr>
	<tr><td>Mobile Name</td><td><input type="text" name="mname"></td></tr>
	<tr><td>Mobile Make</td><td><input type="text" name="mmake"></td></tr>
	<tr><td>Mobile Price</td><td><input type="text" name="mprice"></td></tr>
	</table>
	<input type="submit" value="Submit">
	</form>

</body>
</html>