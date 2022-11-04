<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>한 줄 게시판 글목록</title>
</head>
<body>
	<h2>한 줄 게시판 글목록</h2>
	<hr>
	<table border = "1" cellpadding = "0" cellspacing = "0" width = "1000">
		<tr bgcolor="pink" height="40">
			<th>번호</th>
			<th>글쓴이</th>
			<th>한줄내용</th>
			<th>삭제</th>
		</tr>
		
		<tr height="35" align="center">
			<th>3</th>
			<th>홍길동</th>
			<th align="left" width="700">안녕하세요. 오늘 날씨가 춥습니다.</th>
			<th><input type="button" value="×" onclick="javascript:window.location='delete'"></th>
		</tr>
		<tr height="35">
			<td colspan="4" align="right">
				<input type="button" value="한줄쓰기" onclick="javascript:window.location='writeForm'">	
			</td>
		</tr>
	</table>
</body>
</html>