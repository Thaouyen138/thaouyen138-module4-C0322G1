<%--
  Created by IntelliJ IDEA.
  User: thaouyen
  Date: 15/07/2022
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3> Settings</h3>
<form:form modelAttribute="mailBox" action="/create" method="post">
<label>language</label>
<form:select path="language">
    <form:option value="English">English</form:option>
    <form:option value="Vietnamese">Vietnamese</form:option>
    <form:option value="Japan">Japan</form:option>
    <form:option value="China">China</form:option>
</form:select>
<br>
<label>page size</label>
<form:select path="pageSize">
    <form:option  value="5">5</form:option>
    <form:option  value="10">10</form:option>
    <form:option  value="15">15</form:option>
    <form:option  value="25">25</form:option>
    <form:option  value="50">50</form:option>
    <form:option  value="100">100</form:option>
</form:select>
<br>
<span>emails her page</span>
<label>spam filter</label>
<form:checkbox path="spamsFilter"/> enable spam filter
<br>
<label>signature</label>
<form:textarea path="signature" width="500px" height="300px"/>
<br>
<button type="submit">update</button>
</form:form>
</body>
</html>
