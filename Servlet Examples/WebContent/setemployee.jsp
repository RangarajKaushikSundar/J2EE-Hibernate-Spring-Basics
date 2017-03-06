<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="employee" class="com.cg.bean.Employee" scope="page" >
		
<jsp:setProperty property="employee" name="*"/>	
		
</jsp:useBean>
				Empno :<jsp:getProperty property="empno" name="employee"/><br>
				Ename :<jsp:getProperty property="ename" name="employee"/><br>
				Email :<jsp:getProperty property="email" name="employee"/>
</body>
</html>