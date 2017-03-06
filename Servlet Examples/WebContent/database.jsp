<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="/WEB-INF/mytag.tld" prefix="ex" %>
<%@taglib uri="/WEB-INF/dformat.tld" prefix="fmd" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index File</title>
</head>
<body>
		<ex:mytag/>
		<fmd:fdate format="dd/M/yyyy:hh:mm"/>
		<br>
		
      <sql:setDataSource var="dataSource"
          driver="oracle.jdbc.driver.OracleDriver"
          url="jdbc:oracle:thin:@localhost:1521:oracle" user="NAVEEN"
          password="NAVEEN" scope="page" />
            <sql:query var="result" dataSource="${dataSource}"
             sql="select empno,ename,job,sal from emp"></sql:query>
      <c:forEach items="${result.columnNames }" var="col">
                 <c:out value="${col}"></c:out>
       </c:forEach>
<br>
<c:forEach items="${result.rows}" var="row">
         <c:out value="${row.empno}"></c:out>&nbsp;
         <c:out value="${row.ename}"></c:out>&nbsp;
         <c:out value="${row.job}"></c:out>&nbsp;
 
  <fmt:formatNumber value="${row.sal}" minIntegerDigits="4"
            minFractionDigits="2"></fmt:formatNumber>
<br>
</c:forEach>
</body>
</html>
