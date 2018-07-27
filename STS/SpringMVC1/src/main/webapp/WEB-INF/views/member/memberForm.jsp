<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원정보를 입력하세요.</h1>
	<form method="post">  <!-- action없으면 자기자신페이지 호출 -->
		아이디 : <input type="text" name="id"><br>  <!-- MemberVO랑 속성이 같다 -->
		이름 : <input type="text" name ="name"><br>
		암호 : <input type="text" name ="pw"><br>
		나이 : <input type="text" name ="age"><br>
		<input type="submit" value="입력">
		
	</form>
</body>
</html>