<%--
  Created by IntelliJ IDEA.
  User: 송민규
  Date: 2023-05-11
  Time: 오후 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo read</title>
</head>
<body>

    <h1>Todo 보기</h1>
    <hr>

    <h3>${todo}</h3>

        <a href="/todo/modify">수정</a> <br>
        <a href="/todo/delete">삭제</a>

</body>
</html>
