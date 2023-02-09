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
						<div class="card m-2">
							<div class="card-header">
							게시물 쓰기
							</div>
							<div class="card-body">	
								<form method="post" action="write" enctype="multipart/form-data">
									<div class="form-group">
										<label for="btitle">Title</label> 
										<input type="text" class="form-control" id="btitle" name="btitle"> 
									</div>
									<div class="form-group">
										<label for="bcontent">Content</label> 
										<textarea rows="5" cols="50" id="bcontent" name="bcontent" class="form-control" ></textarea>
									</div>
									<div class="form-group">
										<label for="bwriter">Writer</label> 
										<input type="text" class="form-control" id="bwriter" name="mid" value="user1" readonly="readonly"> 
									</div>
									<div class="form-group">
										<label for="battach">Attach</label> 
										<input type="file" class="form-control" id="battach" name="battach"> 
									</div>
									<button type="submit" class="btn btn-info btn-sm">게시물쓰기</button>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
			<%@include file="/WEB-INF/views/common/bottom.jsp" %>
		</div>
	</body>
</html>
 
	














