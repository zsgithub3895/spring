<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'PersonForm.jsp' starting page</title>

  </head>
  
  <body>
<form action="${pageContext.request.contextPath}/myform.action" method="get">
    This is my JSP page. <br>
    
<TABLE>
<TR>
	<TD>id:</TD>
	<TD><input type="text" name="id"/></TD>
</TR>
<TR>
	<TD>name:</TD>
	<TD><input type="text" name="name"/></TD>
</TR>
<TR>
	<TD>age:</TD>
	<TD><input type="text" name="age"/.></TD>
</TR>
<TR>
	<TD><input type="submit" name="ok" value="submit"/></TD>
	<TD></TD>
</TR>
</TABLE>

</form>  
  </body>
</html>
