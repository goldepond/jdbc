<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="join_ok.jsp" method="post">
		아이디:<input type="text" name="id"><br/>
		비밀번호:<input type="password" name="pw"><br/>
		이름:<input type="text" name="name"><br/>
		
		<select name="phone1">
			<option>010</option>
			<option>02</option>
			<option>031</option>
			<option>051</option>
		</select>
		-<input type="text" name="phone2" size="5">
		-<input type="text" name="phone3" size="5">
		<br/>
		
		<input type="radio" name="gender" Value="m">남자
		<input type="radio" name="gender" Value="f">여자
		
		<input type="submit" name="submit" Value="가입">
 	</form>
</body>
</html>