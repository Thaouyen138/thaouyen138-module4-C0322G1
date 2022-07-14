<%--
  Created by IntelliJ IDEA.
  User: thaouyen
  Date: 14/07/2022
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/cal" method="get">
<input type="text" name="num1" value="${num1}">
<input type="text" name="num2" value="${num2}">
<button type="submit" name="calculator" value="add">+</button>
<button type="submit" name="calculator" value="sub">-</button>
<button type="submit" name="calculator" value="mul">*</button>
<button type="submit" name="calculator" value="div">:</button>
</form>

<p style="color: #007bff">Result: ${result}</p>
</body>
</html>
