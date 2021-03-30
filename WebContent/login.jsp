<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ResourceBundle" %>
<%@ taglib uri="/WEB-INF/myjsptags.tld" prefix="mytags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<title>Insert title here</title>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
</head>
<body>
    <form METHOD=post ACTION="login.doing">
     <div class="mb-3 row">
     <input type="hidden" name="formid" value="login">
  		 	 <div class="col-sm-10">
             <mytags:bundle key="username" />: <input class="col-sm-2 col-form-label" TYPE=TEXT NAME="uname"><P>
             </div>
             <div class="col-sm-10">
              <mytags:bundle key="password" />:<input class="col-sm-2 col-form-label" type="password" name="upass" >
              </div>
              <input  class="btn btn-primary mb-3" TYPE=SUBMIT value="login..">
           </div>
       </form>
</body>
</html>