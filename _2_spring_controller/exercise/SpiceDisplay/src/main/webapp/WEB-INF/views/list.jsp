<%--
  Created by IntelliJ IDEA.
  User: thaouyen
  Date: 14/07/2022
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="/bootstrap/bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/bootstrap/datatables/css/dataTables.bootstrap4.min.css"/>
</head>
<body>
<form action="/spice" method="post">
    <h3>sandwich condiments</h3>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" value="lettecu" name="spice">
        <label class="form-check-label">
            Lettecu
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" value="tomato" name="spice">
        <label class="form-check-label">
            Tomato
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" value="mustard" name="spice">
        <label class="form-check-label">
            Mustard
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" value="sprouts" name="spice">
        <label class="form-check-label">
            Sprouts
        </label>
    </div>
    <button type="submit" class="btn btn-outline-danger">submit</button>
</form>
</body>
<script src="/bootstrap/jquery/jquery-3.5.1.min.js"></script>
<script src="/bootstrap/datatables/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/bootstrap/bootstrap413/js/bootstrap.bundle.min.js"></script>
</html>
