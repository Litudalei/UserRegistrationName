<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
<h2>Register User</h2>

<form:form action="register" method="post" modelAttribute="userReg">
    <table>
        <tr>
            <td>First Name:</td>
            <td><form:input path="firstName" /></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><form:input path="email" /></td>
        </tr>
        <tr>

            <td><button type="submit">Submit</button></td>
        </tr>
    </table>
</form:form>
</body>
</html>