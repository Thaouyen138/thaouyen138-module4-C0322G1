<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: thaouyen
  Date: 18/07/2022
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center><h3>TỜ KHAI Y TẾ</h3></center>
<form:form modelAttribute="medical" action="/create" method="post">
    <label>Họ tên(ghi chữ IN HOA) <span style="color: red">(*)</span></label>
    <form:input path="name"/> <br>
    <label>Năm sinh <span style="color: red">(*)</span></label>
    <form:input path="age" type="date"/><br>
    <label>Thông tin đi lại <span style="color: #ff0000">(*)</span></label>
    <form:radiobutton path="transport" value="Tàu bay"/>Tàu bay
    <form:radiobutton path="transport" value="Tàu thuyền"/>Tàu thuyền
    <form:radiobutton path="transport" value="Ô tô "/>Ô tô
    <form:radiobutton path="transport" value="Khác"/>Khác(ghi rõ)<br>
    <label>Ngày bắt đầu <span style="color: red">(*)</span></label>
    <form:input path="startDate" type="date"/><br>
    <label>Ngày kết thúc <span style="color: red">(*)</span></label>
    <form:input path="endDate" type="date"/><br>
    <label>Trong vòng 14 ngày qua, anh/chị có đi đến tỉnh/thành phố nào ? <span style="color: red">(*)</span></label>
    <form:textarea path="other"/><br>
    <button type="submit">submit</button>
</form:form>
</body>
</html>
