<%--
  Created by IntelliJ IDEA.
  User: thaouyen
  Date: 13/07/2022
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="/bootstrap/bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/bootstrap/datatables/css/dataTables.bootstrap4.min.css"/>
</head>
<body>
<form action="/convert" method="post">
    <div class="form-group ">
        <label>usd</label>
        <input type="number" class="form-control" placeholder="enter money" name="usd">
    </div>
    <button type="submit" class="btn btn-primary">convert</button>
</form>
<h3>result: ${result}</h3>
</body>
<script src="/bootstrap/jquery/jquery-3.5.1.min.js"></script>
<script src="/bootstrap/datatables/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/bootstrap/bootstrap413/js/bootstrap.bundle.min.js"></script>
</html>
