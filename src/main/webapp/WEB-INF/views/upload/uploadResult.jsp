<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<style>
	mar_img {
		width : 400px;
    	height : 200px;
	}
</style>
<title>Insert title here</title>
<%@ include file="../include/header.jsp" %>
</head>
<body>
	������ ���ε� �Ǿ����ϴ�.
	���ϸ� : ${savedName }
	<div>
	<img name="mar_img" class="pic" src="c:/upload/${savedName }" alt="����">
	</div>
</body>
</html>