<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'jPersonList.jsp' starting page</title>

  </head>
  
  <body>
    人员信息列表<br>
    <div style="padding:10px;">
    	<a href="${pageContext.request.contextPath}/person/tocreate.action">新增</a>
    </div>
    
    <table border="1">
    	<tr>
    		<td>编号</td>
    		<td>姓名</td>
    		<td>年龄</td>
    	</tr>
    	<c:forEach items="${dataList}" var="o">
    	<tr>
    		<td>${o.id}</td>
    		<td>${o.name}</td>
    		<td>${o.age}</td>
    	</tr>
    	</c:forEach>
    </table>
    
  </body>
</html>
