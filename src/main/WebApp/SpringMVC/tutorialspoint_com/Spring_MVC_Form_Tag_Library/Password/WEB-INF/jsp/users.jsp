<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Spring MVC Form  Tag library</title>
</head>
<body>

<h2>Submitted Users Information</h2>
<table>
   <tr>
       <td>User Name</td>
       <td>${username}</td>
   </tr>
   <tr>
       <td>Password</td>
       <td>${password}</td>
   </tr>
</table>
</body>
</html>
