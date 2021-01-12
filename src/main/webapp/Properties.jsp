<%--
  Created by IntelliJ IDEA.
  User: Wizard
  Date: 12.01.2021
  Time: 20:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calc" method="post">
    <input type="number" name="firstNumber" placeholder="FirstNumber">
    <br>
    <input type="number" name="secondNumber" placeholder="SecondNumber">
    <br>
    <input type="text" name="operation" placeholder="Operation">
    <br>
    <button>Enter</button>
</form>
${requestScope.operation}
</body>
</html>
