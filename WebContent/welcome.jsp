<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello Mr.<%= session.getAttribute("uname") %>  </h1>
<hr>
<jsp:include page="logout.jsp"></jsp:include>
<hr>
<form action="shopping.doing" method="post">
<input type="hidden" name="formid" value="shopping">
<input type="submit" value="shopping..">
</form>
</body>
</body>
</html>