<%--
  Created by IntelliJ IDEA.
  User: thuan
  Date: 10/2/19
  Time: 9:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
<h3>Sandwich Condiments</h3>
<form method="get" action="/save">
    <input type="checkbox" name="lettuce" value="lettuce">Lettuce
    <input type="checkbox" name="tomato" value="tomato">Tomato
    <input type="checkbox" name="mustard" value="mustard">Mustard
    <input type="checkbox" name="sprouts" value="sprouts">Sprouts
    <input type="submit" value="save">
</form>
</body>
</html>
