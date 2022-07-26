<%--
  Created by IntelliJ IDEA.
  User: thaouyen
  Date: 17/07/2022
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>name</th>
        <th>age</th>
        <th>gender</th>
        <th>national</th>
        <th>identity</th>
        <th>transport</th>
        <th>id transport</th>
        <th>chair</th>
        <th>start date</th>
        <th>end date</th>
    </tr>
    <tr>
        <td> ${medical.name}</td>
        <td>${medical.age}</td>
        <td>${medical.gender}</td>
        <td>${medical.national}</td>
        <td>${medical.identity}</td>
        <td>${medical.transport}</td>
        <td> ${medical.idTransport}</td>
        <td>${medical.chair}</td>
        <td> ${medical.startDate}</td>
        <td>${medical.endDate}</td>
    </tr>
</table>
</body>
</html>
