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

</body>
</html>
