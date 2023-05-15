<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-15
  Time: 오전 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File Upload</title>
</head>
<body>

<h1 style="background-color: hotpink">과제 제출3</h1>

<!-- 필수 !! method="POST" enctype="multipart/form-data -->
    <form action="/report/submit3" method="POST" enctype="multipart/form-data">

    학번 : <input type="text" name="snum"> <br>
    이름 : <input type="text" name="sname"> <br>
    파일 : <input type="file" name="report"> <br>
    <input type="submit">
    </form>

    <hr>


<h1 style="background-color: gold">과제 제출2</h1>

    <!-- 필수 !! method="POST" enctype="multipart/form-data -->
    <form action="/report/submit2" method="POST" enctype="multipart/form-data">

        학번 : <input type="text" name="snum"> <br>
        이름 : <input type="text" name="sname"> <br>
        파일 : <input type="file" name="report"> <br>
        <input type="submit">
    </form>

    <hr>

<h1 style="background-color: orange">과제 제출1</h1>
    <!-- 필수 !! method="POST" enctype="multipart/form-data -->
    <form action="/report/submit1" method="POST" enctype="multipart/form-data">

        학번 : <input type="text" name="snum"> <br>
        이름 : <input type="text" name="sname"> <br>
        파일 : <input type="file" name="report"> <br>
        <input type="submit">
    </form>

</body>
</html>
