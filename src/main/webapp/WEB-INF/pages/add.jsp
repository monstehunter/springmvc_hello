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
<%
    pageContext.setAttribute("ctp",request.getContextPath());
%>
<form:form action="${ctp}/emp" modelAttribute="employee" method="post">
    lastName:<form:input path="lastName"/><br/>
    email:<form:input path="email"/><br/>
    gender:&nbsp;&nbsp;&nbsp;
        男:<form:radiobutton path="gender" value="1"/>&nbsp;&nbsp;&nbsp;
        女:<form:radiobutton path="gender" value="0"/><br/>
    dept:
        <form:select path="department.id"
                     items="${departments}"
                     itemLabel="departmentName"
                     itemValue="id"/> <br/>
    <input type="submit" value="保存"/>
</form:form>
</body>
</html>
