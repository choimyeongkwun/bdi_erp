<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<body>
<button type="button" onclick="move()">유저리스트 이동</button>
<script>

function move(p){
	location.href="/user/list";
}
</script>
</body>
</html>