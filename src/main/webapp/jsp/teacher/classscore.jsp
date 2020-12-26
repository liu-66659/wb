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

<table width="100%" height="90%" border="0" cellpadding="5" cellspacing="0" class="main_tabbor">
    <h5>请输入要查询的行政班级，进行班级信息查看</h5>
    <!-- 查询区  -->
    <tr valign="top">
        <td height="30">
            <table width="100%" border="0" cellpadding="0" cellspacing="10" class="main_tab">
                <tr>
                    <td class="fftd">
                        <form name="empform" method="post" id="empform" action="${pageContext.request.contextPath}/course/findclassscore">
                            <table width="100%" border="0" cellpadding="0" cellspacing="0">
                                <tr>
                                    <td class="font3">
                                        <input type="text" name="ccn" value="${ccn}">

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

                <td>班级编号</td>
                <td>行政班级</td>
                <td>平时成绩总分</td>
                <td>平时成绩平均分</td>
                <td>期末试卷成绩总分</td>
                <td>期末试卷成绩总分</td>
                <td>总成绩总分</td>
                <td>总成绩平均分</td>

            </tr>



                <td>${classscore.classid}</td>
                <td>${classscore.sclass}</td>
                <td>${classscore.scoreu}</td>
                <td>${classscore.scoreuaverage}</td>
                <td>${classscore.scoret}</td>
                <td>${classscore. scoretaverage}</td>
                <td>${classscore. scoregrade}</td>
                <td>${classscore.scoregradeaverage}</td>

                </tr>


        </table>
    </td>
</tr>
</body>
</html>
