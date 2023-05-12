<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-11
  Time: 오전 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo READ</title>
</head>
<body>

    <h1 style="background-color: orange">Todo 보기</h1>
    <hr>

    <h3>${todo}</h3>

        <a href="/todo/modify">수정</a> <br>
        <a href="/todo/delete?tno=11">삭제</a>

</body>
</html>
