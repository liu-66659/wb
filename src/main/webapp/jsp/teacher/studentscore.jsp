<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html >
<head>
    <title>Title</title>
</head>
<head>
    <title>Title</title>
</head>
<body>

<table width="100%" height="10%" border="0" cellpadding="5" cellspacing="0" class="main_tabbor">
    <!-- 查询区  -->
    <tr valign="top">
        <td height="30">
            <table width="100%" border="0" cellpadding="0" cellspacing="10" class="main_tab">
                <tr>
                    <td class="fftd">
                        <form name="empform" method="post" id="empform" action="${pageContext.request.contextPath}/course/findStudentScoreBy">
                            <table width="100%" border="0" cellpadding="0" cellspacing="0">
                                <tr>
                                    <td class="font3">
                                        学号：<input type="text" name="sid" value="${st.sid}">
                                        <!--
                                        用户名：<input type="text" name="sname" value="${st.sname}">
                                        -->
                                        <input type="submit" value="搜索"/>

                                    </td>
                                </tr>
                            </table>
                        </form>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
</table>


    <tr valign="top">
    <td height="20">
        <table width="100%" border="1" cellpadding="5" cellspacing="0" style="border:#c2c6cc 1px solid; border-collapse:collapse;">
            <tr class="main_trbg_tit" align="center">

                <td>学号</td>
                <td>姓名</td>
                <td>性别</td>
                <td>行政班级</td>
                <td>课程名称</td>
                <td>平时成绩</td>
                <td>期末成绩</td>
                <td>总成绩</td>

            </tr>
            <c:forEach items="${sts}" var="s">


                <td>${s.sid}</td>
                <td>${s.sname}</td>
                <td>${s.sex}</td>
                <td>${s.sclass}</td>
                <td>${s.scorecname}</td>
                <td>${s.scoreu}</td>
                <td>${s.scoret}</td>
                <td>${s.scoregrade}</td>

                </tr>
            </c:forEach>

        </table>
    </td>
</tr>
</body>
</html>
