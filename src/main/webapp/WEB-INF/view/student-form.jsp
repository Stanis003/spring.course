<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Lawer3
  Date: 04.05.2022
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <br><br>

    Last name: <form:input path="lastname"/>
    <br><br>
Country:
    <form:select path="country">
        <form:options items="${theCountryOptions}"/>
    </form:select>
    <br><br>
    Favorite Langugage:

   <form:radiobuttons path="favoritelanguage" items="${theFavouriteLanguage}"/>
    <br><br>

    Operating Systems
   Linux <form:checkbox path="operatingSystems" value="Linux"/>
    Mac OS <form:checkbox path="operatingSystems" value="Mac OC"/>
    MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>

    <br><br>
    <input type="submit" value="Submit"/>

</form:form>
</body>
</html>
