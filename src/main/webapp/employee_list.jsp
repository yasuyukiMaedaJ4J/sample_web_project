<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>社員一覧</h2>
<ul>
<%
  List<model.Employee> list = (List<model.Employee>) request.getAttribute("employees");
  for (model.Employee e : list) {
%>
  <li><%= e.getName() %> - <%= e.getEmail() %></li>
<% } %>
</ul>
<a href="menu">戻る</a>

</body>
</html>