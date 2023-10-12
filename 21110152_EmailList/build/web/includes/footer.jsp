<%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%  
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
%>

<!--6.1.6-->
<!--<p>&copy; Copyright ${currentYear} Mike Murach &amp; Associates</p>-->

<p>&copy; Copyright <%=currentYear%> Mike Murach &amp; Associates</p>
</body>
</html>
