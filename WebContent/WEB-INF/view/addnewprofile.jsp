<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" 
		  href="${pageContext.request.contextPath}/resources/css/style.css">
	<style>
		.error{color:red}
	</style>
<body>
	<form:form action="processForm" modelAttribute="profile">
	<h1>First name: <form:input path="firstName" />
	
	Last name: <form:input path="lastName"/>
	<form:errors path="lastName"  cssClass="error" />
	
	
	<br><br>
	Country:
	<form:select path="country">
		<form:options items="${profile.countryOptions}"/>
	</form:select>
	<br><br>
	Relationship Status:
	Single <form:radiobutton path="relationshipStatus" value="Single"/>
	In a relationship <form:radiobutton path="relationshipStatus" value="In a relationship"/>
	It's complicated <form:radiobutton path="relationshipStatus" value="It's complicated"/>
	Married <form:radiobutton path="relationshipStatus" value="Married"/>
	
	<br><br>
	<input type="submit" value="Submit"/>
	</h1>
	</form:form>
</body>

</html> 