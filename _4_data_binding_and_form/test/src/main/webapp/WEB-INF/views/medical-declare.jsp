<%--
  Created by IntelliJ IDEA.
  User: thaouyen
  Date: 18/07/2022
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3><span style="color: red">Họ tên:</span> ${medical.name}</h3>
<h3><span style="color: red">Năm sinh:</span> ${medical.age}</h3>
<h3><span style="color: red">Phương tiện:</span> ${medical.transport}</h3>
<h3><span style="color: red">Ngày bắt đầu:</span> ${medical.startDate}</h3>
<h3><span style="color: red">Ngày khởi hành:</span> ${medical.endDate}</h3>
<h3><span style="color: red">Khác:</span> ${medical.other}</h3>
</body>
</html>
