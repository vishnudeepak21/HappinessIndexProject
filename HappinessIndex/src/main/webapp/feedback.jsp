<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Feedback page::
	<form action="addFeedback">
		feedbackId<input type="text" name="feedbackId"><br> 
		employeeId<input type="text" name="employeeId"><br> 
		questionId<input type="text" name="questionId"><br> 
		rating<input type="text" name="rating"><br>
		<input type="submit"><br>
	</form>
	<br>
		<form action="logOut">
		logout
		<input type="submit"><br>
</body>
</html>