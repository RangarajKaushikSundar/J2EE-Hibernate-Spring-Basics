<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration form for Employee</title>
</head>
<body>
		<form action="storeEmployee.html" method="post">
			<table>
				<tr>
					<td>Enter the empno :</td>
					<td><input type="text" name="empno"></td>
				</tr>
					<tr>
					<td>Enter the ename :</td>
					<td><input type="text" name="ename"></td>
				</tr>
					<tr>
					<td>Enter the job :</td>
					<td><input type="text" name="job"></td>
				</tr>
					<tr>
					<td>Enter the empno :</td>
					<td><input type="text" name="sal"></td>
				</tr>
					<tr>
					<td><input type="submit" value="Enter"></td>
					<td><input type="reset" name="Cancel"></td>
				</tr>
			</table>
		
		</form>
</body>
</html>