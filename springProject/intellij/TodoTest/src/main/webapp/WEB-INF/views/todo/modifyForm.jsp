<%--
  Created by IntelliJ IDEA.
  User: 송민규
  Date: 2023-05-11
  Time: 오후 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo Modify</title>
</head>
<body>

    <h1>Todo 수정</h1>
    <hr>

    <form method="post">
        tno <input type="text" name="tno"> <br>
        todo <input type="text" name="todo"> <br>
        dudate <input type="date" name="dudate"> <br>
        <input type="checkbox" name="complete"> <br>
        <input type="reset"> <input type="submit" value="등록">



    </form>

</body>
</html>
