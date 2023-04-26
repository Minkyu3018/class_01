<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>계산기</title>
</head>

<body>

	<!-- action : form 내부의 input 파라미터 데이터를 처리하는 경로
				: 생략 가능 -> 생략하면 자기 자신의 현재 URL로 보내진다!
	 -->

	<form action="#" method="get">
	<p>
	<strong>ID</strong>
	<input type="text" name="num1" value="아이디입력">
	</p>
	
	<p>
	<strong>PW</strong>
	<input type="text" name="num2" value="비밀번호입력">
	</p>
	
	<!-- <input type="password" name="num3"> -->
	<!-- <input type="file" name="num4"> -->
	<!-- <input type="checkbox" name="num5"> -->
	<select>
		<option value="남자">남자</option>
		<option value="여자">여자</option>
	</select>
	
	
	<input type="submit" value="로그인">
	<!-- <button>SEND</button> -->
	</form>

</body>
</html>