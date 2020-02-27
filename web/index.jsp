<%--
  Created by IntelliJ IDEA.
  User: zzq52
  Date: 2020/2/27
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Learn SSM</title>
</head>
<body>
<h1>Learn SSM</h1>

<hr>

<form action="${pageContext.request.contextPath}/addcustomer">
    客户名称:<input type="text" name="cust_name"/><br>
    客户职业:<input type="text" name="cust_profession"/><br>
    客户电话:<input type="text" name="cust_phone"/><br>
    客户邮件:<input type="text" name="email"/><br>
    <input type="submit" value="提交">
</form>

</body>
</html>
