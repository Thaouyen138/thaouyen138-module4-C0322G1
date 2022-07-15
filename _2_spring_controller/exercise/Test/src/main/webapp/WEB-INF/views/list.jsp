<%--
  Created by IntelliJ IDEA.
  User: thaouyen
  Date: 15/07/2022
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/cal" method = "get" >
<input type="text" value="${num1}" name = "num1">
<input type="text" value="${num2}" name = "num2">
<button type="submit" value="add" name="calculator">+</button>
<button type="submit" value="sub" name="calculator">-</button>
<button type="submit" value="mul" name="calculator">*</button>
<button type="submit" value="div" name="calculator">/</button>
</form>
<p>result: ${result}</p>
</body>
</html>
