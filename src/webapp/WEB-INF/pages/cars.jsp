<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="locale" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Cars</title>
</head>
<body>
    <div style="text-align: center;">
        <h1>List Cars</h1>
    </div>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2><locale:message code="label.title" />: ${title}</h2></caption>
            <tr>
                <th>Brand</th>
                <th>Name</th>
                <th>Series</th>
            </tr>
            <c:forEach var="car" items="${listCars}">
                <tr>
                    <td><c:out value="${car.brand}" /></td>
                    <td><c:out value="${car.name}" /></td>
                    <td><c:out value="${car.series}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>

</body>
</html>