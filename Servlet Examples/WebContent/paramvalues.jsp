<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Expression Language</title></head>
<body>
	<c:forEach var="params" items="${paramValues}">
	<c:out value="${params.key}"></c:out> :
	<c:forEach var="value" items="${params.value }">
	<c:out value="${value}"></c:out><br>
	</c:forEach>
	</c:forEach>
	
	<c:forEach begin="1" var="i" step="3" end="10">
			<c:out value="${i }">
			</c:out><br>
	</c:forEach>
	
	${ 10 gt 20 }
	
</body></html>
