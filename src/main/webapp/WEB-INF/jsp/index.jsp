<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<jsp:include page="../layout/nav.jsp"></jsp:include>
<jsp:include page="../commons/Link.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Keep work</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<style>
html, body, h1, h2, h3, h4, h5 {
	font-family: "RobotoDraft", "Roboto", sans-serif
}

.w3-bar-block .w3-bar-item {
	padding: 16px
}
</style>
<style>
body, h1, h2, h3, h4, h5, h6 {
	font-family: "Raleway", sans-serif
}
</style>
<%-- <%
	String result = "";
	String result2 = "";
%>
<%
	result = (String) request.getAttribute("msg");
	result2 = (String) request.getAttribute("box");
%> --%>
</head>
<body class="w3-light-grey w3-content" style="max-width: 1600px">

	<div class="w3-main" style="margin-left: 15%">
		<jsp:include page="../layout/header.jsp"></jsp:include>
	
		
		<div class="w3-row-padding">
				<%@include file="TeacherProfile.jsp"%>
			<div class="w3-third w3-container w3-margin-bottom">

				<div class="w3-container w3-white"></div>
			</div>

			<div class="w3-third w3-container">

				<div class="w3-container w3-white"></div>
			</div>
		</div>

		<!-- Second Photo Grid-->
		<div class="w3-row-padding">
			<div class="w3-third w3-container w3-margin-bottom">
				<div class="w3-container w3-white"></div>
			</div>
			<div class="w3-third w3-container w3-margin-bottom">
				<div class="w3-container w3-white"></div>
			</div>
			<!-- Pagination -->
			<div class="w3-center w3-padding-32">
				<div class="w3-bar"></div>
			</div>
			<!-- Images of Me -->
			<div class="w3-row-padding w3-padding-16" id="about">
				<div class="w3-col m6"></div>
				<div class="w3-col m6"></div>
			</div>

			<div class="w3-container w3-padding-large"
				style="margin-bottom: 32px">
				<div class="w3-third w3-margin-bottom"></div>
				<div class="w3-third">
					<ul
						class="w3-ul w3-border w3-white w3-center w3-opacity w3-hover-opacity-off">
					</ul>
				</div>
			</div>
		</div>
		<!-- Contact Section -->
		<div class="w3-container w3-padding-large w3-grey">

			<hr class="w3-opacity">
			<form action="/action_page.php" target="_blank">
				<div class="w3-section"></div>
				<div class="w3-section"></div>
				<div class="w3-section"></div>

			</form>
		</div>

		<!-- Footer -->
		<jsp:include page="../layout/footer.jsp"></jsp:include>


		<div class="w3-black w3-center w3-padding-24">
			Powered by <a href="https://www.w3schools.com/w3css/default.asp"
				title="W3.CSS" target="_blank" class="w3-hover-opacity">w3.css</a>
		</div>

		<!-- End page content -->
	</div>
	<%@include file="test.jsp"%>
</body>


</html>

</html>