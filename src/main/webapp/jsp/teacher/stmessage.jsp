<%--
  Created by IntelliJ IDEA.
  User: Lenevo
  Date: 2020/12/16
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<%@ taglib prefix="yyf" uri="http://yyf.pager-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="pragma" content="no-cache" />
    <meta http-equiv="cache-control" content="no-cache" />
    <meta http-equiv="expires" content="0" />
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
    <meta http-equiv="description" content="This is my page" />
    <link href="${pageContext.request.contextPath}/css/css.css" type="text/css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/ligerUI/skins/Aqua/css/ligerui-dialog.css"/>
    <link href="${pageContext.request.contextPath}/js/ligerUI/skins/ligerui-icons.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.0.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-migrate-1.2.1.js"></script>
    <script src="${pageContext.request.contextPath}/js/ligerUI/js/core/base.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/ligerUI/js/plugins/ligerDrag.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/ligerUI/js/plugins/ligerDialog.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/ligerUI/js/plugins/ligerResizable.jss" type="text/javascript"></script>
    <link href="${pageContext.request.contextPath}/css/pager.css" type="text/css" rel="stylesheet" />

    <title>Title</title>
</head>
<body>

<form name="empform" method="post" id="empform" action="${pageContext.request.contextPath}/course/findstudentmessage">
    <table width="100%" border="0" cellpadding="0" cellspacing="0">
        <tr>
            <td>请输入课程名称，找到选择这个课程的学生</td>
            <td class="font3">
                <input type="text" name="scorecname" value="${scorecname}">

                <input type="submit" value="搜索"/>

            </td>
        </tr>
    </table>
</form>

<br/>
<br/>
<br/>

<tr valign="top">
    <td height="20">
        <table width="100%" border="1" cellpadding="5" cellspacing="0" style="border:#c2c6cc 1px solid; border-collapse:collapse;">
            <tr class="main_trbg_tit" align="center">

                <td>学号</td>
                <td>姓名</td>
                <td>性别</td>
                <td>所在院校</td>
                <td>行政班级</td>
                <td>电话号码</td>
                <td>课程名称</td>
              <td>平时成绩</td>

                <td>期末成绩</td>
                <td>总成绩</td>

            </tr>
            <c:forEach items="${stm}" var="s">



                <td>${s.sid}</td>
                <td>${s.sname}</td>
                <td>${s.sex}</td>
                <td>${s.school}</td>
                <td>${s.sclass}</td>
                <td>${s.phone}</td>
                <td>${s.scorecname}</td>
                <td>${s.scoreu}</td>
                <td>${s.scoret}</td>
                <td>${s.scoregrade}</td>

                </tr>
            </c:forEach>

        </table>
    </td>
</tr>
<!-- 分页标签 -->
<tr valign="top"><td align="center" class="font3">




</body>
</html>
