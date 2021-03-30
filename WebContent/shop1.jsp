<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "webs";
String userid = "root";
String password = "alvis";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body bgcolor="red">
	<hr>
	<jsp:include page="logout.jsp"></jsp:include>
	<hr>
	<h1>JewelleryShop</h1>
	<form action="shop.doing" method="post">
	<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select shop_name from shop";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
	
%>

<h1><%=resultSet.getString("shop_name") %></h1>

<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
	<input type="hidden" name="formid" value="shop">
	<input type="hidden" name="shopid" value="shop1">
		Bangles: <input type="checkbox" name="c1" value="bangle">
		Necklace: <input type="checkbox" name="c2" value="necklace">
		Chain: <input type="checkbox" name="c3" value="chain">
		
		<input type="submit" value="Next Shop..">
	</form>
</body>
</html>