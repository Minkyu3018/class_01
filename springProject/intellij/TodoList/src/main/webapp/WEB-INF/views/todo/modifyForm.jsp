<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-11
  Time: 오후 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo MODIFY</title>
</head>
<body>

    <h1>Todo 수정</h1>
    <hr>

        <h3>${todo}</h3>

    <form method="post">
        Tno <input type="text" name="tno" value="1" readonly> <br>
        Todo <input type="text" name="todo" value="놀기"> <br>
        Duedate <input type="date" name="duedate" value="2023-12-25"> <br>
        <input type="checkbox" name="finished" checked> check! <br>
        <input type="reset"> <input type="submit" value="등록">
    </form>

    <h3>${strData}</h3>

</body>
</html>
