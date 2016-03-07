<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login.jsp</title>
</head>
<body>
	<%
		String username = (String) request.getParameter("username");
		String authority = (String) request.getParameter("authority");
	%>

	<form action="LoginServlet" method="post">
		username: <input type="text" name="username" value="<%= null == username ? "" : username %>"/><br/>
		password: <input type="password" name="password"><br/>
		authority: 
		<select name="authority">
			<option value="1" <%="1".equals(authority)?"selected":"" %>>common user</option>
			<option value="2" <%="2".equals(authority)?"selected":"" %>>administrator</option>
		</select><br/>
		
		<input type="submit" value="submit" />
	</form>
</body>
</html>