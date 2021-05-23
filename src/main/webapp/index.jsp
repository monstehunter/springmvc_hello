<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
        hello world!
    </title>
</head>
<body>
<%--<h2>Hello World!</h2>--%>
<%--<p><a href="some.do">发起some.do的请求</a> </p>--%>
<%--<a href="hello">hello</a><br/>--%>
<%--<a href="handle">handle</a><br/>--%>
<%--<hr>--%>
<%--&lt;%&ndash;REST风格&ndash;%&gt;--%>
<%--<a href="/bookTest/1">查</a><br/>--%>
<%--<a href="/bookTest/1">删</a><br/>--%>
<%--<a href="/bookTest/1">改</a><br/>--%>
<%--<form action="/bookTest/1" method="post">--%>
<%--    <input type="submit" value="zeng">--%>
<%--</form><br/>--%>
<%--<hr>--%>
<%--<form action="book" method="post">--%>
<%--    bookName:<input type="text" name="bookName"/><br/>--%>
<%--    author:<input type="text" name="author"/><br/>--%>
<%--    price:<input type="text" name="price"/><br/>--%>
<%--    stock:<input type="text" name="stock"/><br/>--%>
<%--    sales:<input type="text" name="sales"/><br/>--%>
<%--    <input type="submit"/>--%>

<%--</form>--%>

<%--<jsp:forward page="/emps"></jsp:forward>--%>
<%
    pageContext.setAttribute("cpt",request.getContextPath());
%>
<a href="${cpt}/test01">拦截器</a>
<a href="${cpt}/handle01">异常</a>
</body>
</html>
