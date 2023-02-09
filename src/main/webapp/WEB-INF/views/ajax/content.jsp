<%@page contentType="text/html; charset=UTF-8" %>
<html>
	<head>
		<%@include file="/WEB-INF/views/common/head.jsp" %>
	</head>
	<body>
		<div class="d-flex flex-column vh-100">
				<%@include file="/WEB-INF/views/common/top.jsp" %>
				
				<div class="flex-grow-1 container-fluid">
					<div class="row h-100">
						<div class="col-md-4 bg-dark text-white p-3"><%@include file="/WEB-INF/views/common/menu.jsp" %></div>
						<div class="col-md-8 p-3">
							<!-- ****************************************************** -->
							<div class="card">
								<div class="card-header">
									AJAX
								</div>
								<div class="card-body">
									<div class="card">
										<div class="card-header">
											HTML 조각 받아오기
										</div>
										<div class="card-body">
											<button class="btn btn-info" onclick="ajax1()">html 요청하기</button>
											<hr/>
											<div id="div1"></div>
											
										</div>
										<script>
											function ajax1() {
												console.log("ajax1() 실행");
												// $.ajax({
												// 	url:"ajax1",
												// 	success : function(data) {
												// 		$("#div1").html(data);
												// 	}													

												// })
												$.ajax({
													url:"ajax1"																																																	
												}).done((data) => {
													$("#div1").html(data);
												});
											}
										
										</script>
									
									</div>

									<div class="card">
										<div class="card-header">
											JSON 받아오기
										</div>
										<div class="card-body">
											<button class="btn btn-info" onclick="ajax2()">JSON 요청하기</button>
											<hr/>
											<div id="div21"></div>
											<div id="div22">
												<img src="${pageContext.request.contextPath}/resources/images/photo1.jpg" width="500px"/>
											</div>
										</div>
										<script>
											function ajax2() {
												console.log("ajax2() 실행");
												$.ajax({
													url:"ajax2"																																																	
												}).done((data) => {
													console.log(data);
													let img = "<img src='${pageContext.request.contextPath}/resources/images/" + data.name + "' width='500px'/>";
													$("#div21").html(img);
													$("#div22 > img").attr("src", "${pageContext.request.contextPath}/resources/images/"+ data.name);
												});
											}
										
										</script>
									
									</div>

									<div class="card">
										<div class="card-header">
											JSON 보내고 받기
										</div>
										<div class="card-body">
											<button class="btn btn-info" onclick="ajax3()">JSON 요청하기</button>
											<hr/>
											<div id="div3"></div>
											
										</div>
										<script>
											function ajax3() {
												console.log("ajax3() 실행");
												let data = {name:"photo8.jpg", info:"여행 사진"};
												$.ajax({
													url:"ajax3",
													method: "post",
													data: JSON.stringify(data),
													contentType: "application/json; charset=UTF-8"																																														
												}).done((data) => {
													console.log(data);
													let img = "<img src='${pageContext.request.contextPath}/resources/images/" + data.name + "' width='500px'/>";
													$("#div3").html(img);
											
												});
											}
										
										</script>
									
									</div>
							</div>
						</div>
					</div>
				</div>
				<%@include file="/WEB-INF/views/common/bottom.jsp" %>
			</div>
		</div>
	</body>
</html>