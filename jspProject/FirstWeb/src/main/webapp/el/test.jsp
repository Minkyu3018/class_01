<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
    pageContext.setAttribute("scores", new int[]{90, 80, 70, 100});
	%>
	${scores[2]}
	

</body>
</html>