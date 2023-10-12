<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Download Music</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>

<h1>List of albums</h1>

<!--<p>User Email: ${cookie.userEmail.value}</p>-->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${cookie.firstNameCookie.value != null}">
    <p>User Email  <c:out value='${cookie.userEmail.value}' /> </p>
    <p>Welcome <c:out value='${cookie.firstNameCookie.value}'/> !</p>
</c:if>

<p>
<a href="download?action=checkUser&amp;productCode=wt2023">
    World Theme 2023
</a><br>

<a href="download?action=checkUser&amp;productCode=vltheme">
    VALORANT Champion Theme
</a>
</p>

</body>
</html>