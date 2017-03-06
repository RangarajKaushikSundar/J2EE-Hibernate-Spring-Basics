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

			<table border="2">
				<tr><th>MOBILE_ID</th><th>MOBILE_NAME</th><th>MOBILE_MAKE</th><th>MOBILE_PRICE</th>
				<c:forEach items="${result}" var="mob">
					<tr>
					<td><c:out value="${mob.mobile_id }"></c:out></td>
					<td><c:out value="${mob.mobile_name }"></c:out></td>
					<td><c:out value="${mob.mobile_make }"></c:out></td>
					<td><c:out value="${mob.mobile_price}"></c:out></td></tr>
					
				</c:forEach>		
			</table>
</body>
</html>