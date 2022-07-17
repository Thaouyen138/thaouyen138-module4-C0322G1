<%--
  Created by IntelliJ IDEA.
  User: thaouyen
  Date: 17/07/2022
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h3>TỜ KHAI Y TẾ</h3>
    <h3>ĐÂY LÀ ĐIỀU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG TRÁNH DỊCH
        BỆNH TRUYỀN NHIỄM</h3>
    <p style="color: red">Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt nam và có thể xử lý hình sự</p>
</center>
<form:form modelAttribute="medical" action="create" method="post">
    <label>Họ tên(GHI CHỮ IN HOA) <span style="color: red">(*)</span></label>
    <form:input path="name"/>
    <br>
    <label>Năm sinh <span style="color: red">(*)</span></label>
    <form:input path="age"/>
    <br>
    <label>Giới tính <span style="color: red">(*)</span></label>
    <form:input path="gender"/><br>
    <label>Quốc tịch <span style="color: red">(*)</span></label>
    <form:input path="national"/><br>
    <label>Số hộ chiếu hoặc số cmnd hoặc giấy thông hành hợp phát khác<span style="color: red">(*)</span></label>
    <form:input path="identity"/><br>
    <label>Thông tin đi lại <span style="color: red">(*)</span></label>
    <form:radiobutton path="transport"/>Tàu bay
    <form:radiobutton path="transport"/>Tàu thuyền
    <form:radiobutton path="transport"/>Ô tô
    <form:radiobutton path="transport"/>Khác(Ghi rõ) <br>
    <label>Số hiệuu phương tiện <span style="color: red">(*)</span></label>
    <form:input path="idTransport"/> <br>
    <label>Số ghế <span style="color: red">(*)</span></label>
    <form:input path="chair"/> <br>
    <label>ngày khởi hành <span style="color: red">(*)</span></label>
    <form:input path="startDate" type="date"/> <br>
    <label>Ngày kết thúc<span style="color: red">(*)</span></label>
    <form:input path="endDate" type="date"/><br>
    <button type="submit">submit</button>
</form:form>
</body>
</html>
