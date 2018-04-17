<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Spring MVC - Form Tag library</title>
</head>
<body>
<h2>User Information</h2>
<!--form:form method = "post" action = "/SpringMVC/tutorialspoint_com/Form_Tag_Library/radioButtons/addUser"-->
<form:form method = "POST" action = "addUser">
    <table>
        <tr>
            <td><form:label path = "username">User Name</form:label></td>
            <td><form:input path = "username" /></td>
        </tr>
        <tr>
            <td><form:label path = "password">Password</form:label></td>
            <td><form:password path = "password" /></td>
        </tr>
        <tr>
            <td><form:label path = "address">Address</form:label></td>
            <td><form:textarea path = "address" rows = "5" cols = "30" /></td>
        </tr>
        <tr>
            <td><form:label path = "receivePaper">Subscribe Newsletter</form:label></td>
            <td><form:checkbox path = "receivePaper" /></td>
        </tr>
        <tr>
            <td><form:label path = "favoriteFrameworks">Favorite Web Frameworks</form:label></td>
            <td><form:checkboxes items = "${webFrameworkList}" path = "favoriteFrameworks" /></td>
        </tr>
        <tr>
            <td><form:label path = "gender">Gender</form:label></td>
            <td>
                <form:radiobutton path = "gender" value = "M" label = "Male" />
                <form:radiobutton path = "gender" value = "F" label = "Female" />
            </td>
        </tr>
        <tr>
            <td><form:label path = "favoriteNumber">Favorite Number</form:label></td>
            <td>
                <form:radiobuttons path = "favoriteNumber" items = "${numbersList}" />
            </td>
        </tr>
        <tr>
            <td colspan = "2">
                <input type = "submit" value = "Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
