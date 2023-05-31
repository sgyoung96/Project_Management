<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
</head>
<body>
	<h2>Test Page</h2>
	
	<script>
	//test commit;
	init();
	
	function init() {
		
		let param = {
				"a": "a"
		};
		
		$.ajax({
			url: '/test/connectiontest.do',
			type: 'post',
			data: JSON.stringify(param),
			dataType: 'text',
			contentType : "application/json; charset=utf-8",
			success:function(result, status){ 
				console.log(result);
			},
			error:function(req, status){ //req:요청객체, status:상태값
				console.log(req);
				console.log(status);
			
				alert(status);
			}
		});
	}
	
	
	</script>
</body>
</html>