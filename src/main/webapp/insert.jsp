<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style type="text/css">
tr, td {
	padding: 10px !important;
}
</style>
</head>
<body>
	</b>
	<form name="action" action="MemberController" method="post">
		<table>
			<tr>
				<td>First Name:</td>
				<td>
					<input type="text" name="firstName" required="required">
				</td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td>
					<input type="text" name="lastName" required="required">
				</td>
			</tr>
			<tr>
				<td>Email:</td>
				<td>
					<input type="text" name="email" required="required"> 
				</td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td>
					<input type="text" name="mobile" required="required"> 
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
 					<input type="submit" name="action" value="Register" class="btn btn-primary"> 
				</td>
			</tr>
		</table>
	</form>
</body>
</html>