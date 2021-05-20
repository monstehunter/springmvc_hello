<%--
  Created by IntelliJ IDEA.
  User: lo
  Date: 2021/5/19
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>员工添加页面</title>
</head>
<body>
<h1>员工添加页面</h1>
<form:form action="">
    lastName:<form:input path="lastName"/><br/>
    email:<form:input path="email"/><br/>
    gender:<br/>
        男:<form:radiobutton path="gender" value="1"/><br/>
        女:<form:radiobutton path="gender" value="0"/><br/>
    dept:
        <form:select path="department.id"
                     items="${depetments}" itemLabel="depetmentName" itemValue="id"

</form:form>
</body>
</html>
