<%--
  Created by IntelliJ IDEA.
  User: 高龙天
  Date: 2018/6/11
  Time: 1:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>按条件查询吉他</p>
<form action="/show">
    <p>颜色：</p>
    <input type="text" name="color" value="白色">
    <br>
    <p>弦数：</p>
    <input type="text" name="number" value="3">
    <p>尺寸：</p>
    <input type="text" name="size" value="大">
    <p></p>
    <input type="submit" value="Submit">
</form>
</body>
</html>
