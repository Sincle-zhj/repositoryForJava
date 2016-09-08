<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	显示结果：
	<br>
	<%
		int i=1;
	%>
	<form action="#" method="post">
		<c:forEach items="${list }" var="slist" >
			<c:forEach items="${slist }" var="str" >
				result <%=i %> :${str }
				<input type="text" value="<%=i %>"><br>
				<%
					i++;
				%>
			</c:forEach>
			<br>
		</c:forEach>
	</form>
</body>
</html>