<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--Ｗｅｂパッケージのempクラスを使う定義 　　javaとjspクラスを連携するときはこれを書かないといけない--%>
<jsp:useBean id="emp" scope="request" class="web1.EmpBean" />
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>UseBean</h1>
	<table>
		<tr>
			<td>Name</td>
			<%-- リクエストオブジェクトに格納されている
			beanの中のプロパティ名がnameの値を取得している --%>
			<td><jsp:getProperty name="emp" property="name" /></td>
		</tr>
		<tr>
			<td>Age</td>
			<%-- リクエストオブジェクトに格納されている
			beanの中のプロパティ名がnameの値を取得している --%>
			<td><jsp:getProperty name="emp" property="age" /></td>
		</tr>
	</table>
</body>
</html>