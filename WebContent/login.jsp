<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>:: Login ::</title>
</head>
<body>
	<h1>
		<div align="center">
			<% if(request.getAttribute("msg") != null) { %>
			<p style="color: red">
				<%= request.getAttribute("msg") %>
			</p>
			<% } %>
			<% if(request.getAttribute("msg2") != null) { %>
			<p style="color: green;">
				<%= request.getAttribute("msg2") %>
			</p>
			<% } %>

			<form action="login" method="POST">
				<label>Enter Username : </label> <input type="text" name="username"
					required="required"> <br> <br> <label>Enter
					Password : </label> <input type="password" name="password"
					required="required"> <br> <br> <input
					type="submit" value="Login">
					<input
					onclick="location.href='http://localhost:8080/StudentsManagement/userRegistration'""
					 type="button"
					 value="Register" >
			</form>
		</div>
	</h1>
</body>
</html>