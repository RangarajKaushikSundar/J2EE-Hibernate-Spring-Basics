	<%@page import="com.cg.mvc2.Employee"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		${requestScope.list}
			<table border="2">
				<tr><th>EMPNO</th><th>ENAME</th><th>JOB</th>
				<c:forEach items="${list}" var="emp">
					<tr>
					<td><c:out value="${emp.empno }"></c:out></td>
					<td><c:out value="${emp.ename }"></c:out></td>
					<td><c:out value="${emp.job }"></c:out></td></tr>
					
				</c:forEach>		
			</table>
</body>
</html>