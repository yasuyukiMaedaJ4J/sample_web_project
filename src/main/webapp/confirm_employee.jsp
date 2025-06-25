<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>確認画面</h2>
<%
  model.Employee e = (model.Employee) request.getAttribute("employee");
%>
<p>名前: <%= e.getName() %></p>
<p>メール: <%= e.getEmail() %></p>
<form action="confirm" method="post">
  <input type="hidden" name="name" value="<%= e.getName() %>">
  <input type="hidden" name="email" value="<%= e.getEmail() %>">
  <input type="submit" value="登録する">
</form>
<a href="register_employee.jsp">戻る</a>

</body>
</html>