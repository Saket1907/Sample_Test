<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
</head>
<body>
<script type="text/javascript">
function ChangePassword(){
	if(repassword||newpassword)
		return true;
}
</script>
<form action="change.htm" method = "Post">
Old Password : <input type ="password" name ="oldpassword"/>
New Password : <input type ="password" name ="newpassword"/>
Re Enter : <input type ="password" name = "repassword">
<button type ="button" onClick = "javascripit : ChangePassowrd()">Change Password</button>
</form>
</body>
</html>