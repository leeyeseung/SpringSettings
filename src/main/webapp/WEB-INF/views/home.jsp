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
								Spring framework 복습
							</div>
							<div class="card-body">
							</div>
						</div>
					</div>
				</div>
			</div>
			<%@include file="/WEB-INF/views/common/bottom.jsp" %>
		</div>
	</body>
</html>