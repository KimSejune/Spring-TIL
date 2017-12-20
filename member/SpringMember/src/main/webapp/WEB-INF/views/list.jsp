<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello Member Table</h1>

	<table width="500" board="1" height="200">
		<tr>
			<th>아이디</th>
			<th>비번</th>
			<th>이름</th>
		</tr>
		<c:forEach items="${memberList}" var="members">
		<tr>
			<td>${members.id}</td>
			<td>${members.pw}</td>
			<td>${members.name}</td>
		</tr>
		</c:forEach>

	</table>
	<form action="add" method="POST">
		pw : <input type="text" name="pw">
		name : <input type="text" name="name">
		<input type="submit" value="submit">
	</form>
	
</body>
</html>