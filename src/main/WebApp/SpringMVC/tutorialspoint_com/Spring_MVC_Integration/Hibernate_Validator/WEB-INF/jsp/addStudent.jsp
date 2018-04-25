<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring MVC - Integration</title>
</head>
<style>
    .error{
        color: red;
    }
    .errorblock{
        color: #000;
        background-color: #ffEEEE;
        border: 3px solid #ff0000;
        padding: 8px;
        margin: 16px;
    }
</style>
<body>
<h2>Student Information</h2>
   <%-- <form:form method="post" action="SpringMVC/tutorialspoint_com/Integration/hibernateValidator/addStudent" commandName="student">--%>
    <form:form method="post" action="addStudent" commandName="student">
        <form:errors path="*" cssClass="errorblock" element="div"/>
        <table>
            <tr>
                <td><form:label path="name">Name</form:label></td>
                <td><form:input path="name"/></td>
                <td><form:errors path="name" cssClass="error"/> </td>
            </tr>
            <tr>
                <td><form:label path="age">Age</form:label></td>
                <td><form:input path="age"/></td>
                <td><form:errors path="age" cssClass="error"/> </td>
            </tr>
            <tr>
                <td><form:label path="id">ID</form:label></td>
                <td><form:input path="id"/></td>
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
