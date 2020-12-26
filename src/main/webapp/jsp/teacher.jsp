<%--
  Created by IntelliJ IDEA.
  User: Lenevo
  Date: 2020/12/15
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#faebd7">
<div style="border-left-width: 1000px">
<a href="${pageContext.request.contextPath}/course/loginout" >  退出</a>
</div>
<br/>

<Br/>
<a href="${pageContext.request.contextPath}/course/findcourse"  >  查看课程信息</a>
<br/>
<br/>
<a href="${pageContext.request.contextPath}/course/findcoursescore"  >  课程成绩</a>
<br/>
<br/>

<a href="${pageContext.request.contextPath}/course/findclass"  >  班级信息</a>
<br/>
<br/>
<a href="${pageContext.request.contextPath}/jsp/teacher/classscore.jsp"  >  班级信息统计</a>
<br/>
<br/>
<h6>**********************************************************************</h6>
<a href="${pageContext.request.contextPath}/jsp/teacher/stmessage.jsp"  >  查看选择课程的学生信息</a>
<br/>
<br/>
<a href="${pageContext.request.contextPath}/course/findstudentscore"  >  个人学习信息统计</a>
<br/>

</body>
</html>




