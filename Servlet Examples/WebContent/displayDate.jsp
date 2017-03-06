
<%@page import="java.util.Calendar"%>
<h3>The year is welcome: <%=Calendar.getInstance().get(Calendar.YEAR) %></h3>
<%=request.getParameter("mail")%>