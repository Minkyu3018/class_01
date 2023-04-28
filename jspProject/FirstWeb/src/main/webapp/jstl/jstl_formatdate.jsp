<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	request.setAttribute("now", new Date());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	${now} <br>
	
	<fmt:formatDate value="${now}"/> <br>
	<br>
	
	Nomal : <fmt:formatDate value="${now}" type="date"/> <br>
	Full : <fmt:formatDate value="${now}" type="date" dateStyle="full"/> <br>
	Short : <fmt:formatDate value="${now}" type="date" dateStyle="short"/> <br>
	<br>
	
	Nomal : <fmt:formatDate value="${now}" type="time"/> <br>
	Full : <fmt:formatDate value="${now}" type="time" timeStyle="full"/> <br>
	Short : <fmt:formatDate value="${now}" type="time" timeStyle="short"/> <br>
	<hr>
	
	<fmt:formatDate value="${now}" type="both"/> <br>
	<fmt:formatDate value="${now}" type="both"
		dateStyle="full" timeStyle="full"/> <br>
		
	<fmt:formatDate value="${now}" pattern="yyyy. MM. dd. HH:mm"/> <br>
	
	
	
</body>
</html>