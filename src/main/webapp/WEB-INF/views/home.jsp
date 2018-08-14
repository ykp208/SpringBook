<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script>
$(document).ready(function(){
	$("#btn").click(function(){
		var data ={
				"targetid":"user01",
				"sender"  :"user02",
				"message" : "Hello"
		}
		
		//아이작은 비동기식 서버로 가면 언재 올지 모른다.
		$.ajax({
			type:"post",
			url:"/zero/messages/",
			dataType:"JSON",
			contentType:"application/json; charset=utf-8",
			data:JSON.stringify(data), //json 으로 넘겨서 
			success:function(data){
				
			},
			error:function(e){
				
			}
			
		})
	})
	
})

</script>
	
	
	
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<button id="btn">클릭</button>


<a href="/zero/sample/hello">hello</a>
<a href="/zero/sample/sendVO">sendVO</a>
<a href="/zero/sample/sendList">sendList</a>
<a href="/zero/sample/sendMap">sendMap</a>
<a href="/zero/sample/sendErrorAuth">sendErrorAuth</a>
<a href="/zero/sample/sendErrorNot">sendErrorNot</a>

<jsp:include page="./include/footer.jsp"></jsp:include>
</body>
</html>
