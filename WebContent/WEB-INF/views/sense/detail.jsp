<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="js/sense/sense.js"></script>
 
</head>
<body>
<!-- 센스 디테일 페이지 / 메인 리스트 클릭 시 작동-->
	<table ="center">
		<tr>
			<td align="center">${ detail.sense_content }내용</td>
		</tr>
		<tr>	
			<td width="100" align="center">
<%-- 				<a href="/moneyWatch/senseModify.mw?num=${detail.num}">
					<input type="button" value="수정"/></a>   --%>  
				<%-- <input type="button" value="수정" onclick="senseModify(${detail.num})">    --%>   
				<input type="button" value="수정" onclick="location.href='/moneyWatch/senseModify.mw?num=${detail.num}'"/>
					
			</td>	
			<td width="100" align="center">
				<input type="button" value="삭제" onclick="senseDelete(${detail.num})">      
			</td>
		</tr>
	</table>
</body>
</html>