<%--
  Created by IntelliJ IDEA.
  User: Lawer3
  Date: 04.05.2022
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
The student is confirmed: ${student.firstName} ${student.lastname}
<br><br>

Country: ${student.country}
<br><br>
Favourite Language: ${student.favoritelanguage}
<br><br>
Operating Systems:

<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp}</li>
    </c:forEach>
</ul>


</body>
</html>
