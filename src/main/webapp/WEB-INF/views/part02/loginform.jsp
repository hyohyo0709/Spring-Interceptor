<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<script>
$(document).ready(function() {
	let returnUrl= "${param.returnUrl}";
	if(returnUrl !=""){
		alert(returnUrl + "로그인을 해주세요!");
	}
})
</script>
</head>
<body>

<form name="frm" method="post" action="loginpro.do">
<p> <input type="text" name="id" placeholder="아이디 입력"/></p>
<p> <input type="password" name="pass" placeholder="비밀번호 입력"/></p>


<p> 
<input type="text" name="returnUrl" value="${param.returnUrl }"/>
<input type="submit" value="login"/></p>
</form>
</body>
</html>