<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-19
  Time: 오전 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Read</title>
</head>
<style>
    td {
        text-align: center;
        padding: 10px 20px;
    }
    button {
        border: 0;
        font-size: 15px;
        margin: 5px;
        background: lightskyblue;
        color: white;
        padding: 10px 20px;
        cursor: pointer;
        border-radius: 10px;

    }

    button:hover {
        color: white;
        background: orange;
    }
</style>
<body>

    <h1>【게시글 보기】</h1>
    <hr>
<%--    ${article}--%>
    <table border="1">
        <tr>
            <td style="background-color: lightgray">게시글 번호</td>
            <td>${article.bno}</td>
        </tr>

        <tr>
            <td style="background-color: lightgray">글제목</td>
            <td>${article.title}</td>
        </tr>

        <tr>
            <td style="background-color: lightgray">내용</td>
            <td>${article.content}</td>
        </tr>

        <tr>
            <td style="background-color: lightgray">작성자</td>
            <td>${article.writer}</td>
        </tr>

        <c:if test="${article.file ne null}">
            <tr>
                <td style="background-color: lightgray">첨부파일<br>이미지</td>
                <td>
                    <img src="/uploadfile/board/${article.file}" width="300" alt="${article.file}">
                </td>
            </tr>
        </c:if>


        <tr>
            <td style="background-color: lightgray">작성일자</td>
            <td>${article.regdate}</td>
        </tr>

        <tr>
            <td style="background-color: lightgray">업데이트일자</td>
            <td>${article.updatedate}</td>
        </tr>


    </table>

    <button><a href="/board/list">LIST</a></button>
    <button><a href="/board/modify?bno=${article.bno}">수정</a></button>
    <button><a href="/board/delete?bno=${article.bno}">삭제</a></button>




</body>
</html>
