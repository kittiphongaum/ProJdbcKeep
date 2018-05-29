<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<jsp:include page="../commons/Link.jsp"></jsp:include>
<jsp:include page="../layout/nav.jsp"></jsp:include>
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

	<div class="w3-main" style= "margin-left: 15%">
		<jsp:include page="../layout/header.jsp"></jsp:include>

		
			<div class="w3-container w3-card w3-white w3-round w3-margin">

				<div class="col-md-12 col-sm-12">
					<a class="w3-btn  w3-border" align="right"
						style="background-color: rgb(105, 104, 104)">เพิ่มข้อมูลการสอนถาคปกติ
						></a> <a class="w3-button  w3-border col-md-8" align="left"
						style="background-color: rgb(223, 221, 221)">ผลการลงทะเบียน</a>
				</div>
			</div>
			<form action="/TeachingRepost" method="post">
			<div class="w3-container w3-card w3-white w3-round w3-margin">
				<div class="row">
					<div class="col-md-12 col-sm-12">
						<div class="form-group" align="right">
							<div class="col-md-12 col-sm-12">
								<button name="" type="submit"
									id="" class="btn btn-success btn-lg"
									onclick="submitForm()">
									<span class="glyphicon glyphicon-share"> บันทึกและพิมพ์</span>
								</button>
							</div>
						</div>
					</div>
				</div>
				<div class="w3-container w3-card w3-white w3-round w3-margin">
					<div class=" col-md-12">
						<div class="form-group" align="left">
							<div class="col-md-12 col-sm-12">
								<button name="submitFormPayment" type="button"
									id="submitFormPayment" class="btn btn-success btn-lg"
									onclick="submitForm()">
									<span class="glyphicon glyphicon-share">
										เพิ่มข้อมูลการสอนถาคปกติ</span>
								</button>
							</div>
						</div>
					</div>
					<hr class="w3-clear" style="top: 10%">
					<div class="row" style="top: 10%">
						<div class="col-md-4">
							<div class="form-group" align="left">
								<div class="form-group row">
									<label for="colFormLabelSm"
										class="col-sm-3 col-form-label col-form-label-sm">ชื่อ</label>
									<div class="col-sm-7">
										<input type="text" class="form-control form-control-sm" id=""
											placeholder="ชื่อ">
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group row" align="left">
								<label for="colFormLabelSm"
									class="col-sm-3 col-form-label col-form-label-sm">นามสกุล</label>
								<div class="col-sm-8">
									<input type="text" class="form-control form-control-sm"
										id="colFormLabelSm" placeholder="นามสกุล">
								</div>
							</div>
						</div>

					</div>
					<div class="row">
						<div class="col-md-4">
							<div class="form-group" align="left">
								<div class="form-group row">
									<label for="colFormLabelSm"
										class="col-sm-3 col-form-label col-form-label-sm">ตำแหน่ง</label>
									<div class="col-sm-7">
										<input type="text" class="form-control form-control-sm"
											id="colFormLabelSm" placeholder="ตำแหน่ง">
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group row" align="left">
								<label for="colFormLabelSm"
									class="col-sm-3 col-form-label col-form-label-sm">คณะ</label>
								<div class="col-sm-8">
									<input type="text" class="form-control form-control-sm"
										id="colFormLabelSm" placeholder="คณะ">
								</div>
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group row" align="left">
								<label for="colFormLabelSm"
									class="col-sm-2 col-form-label col-form-label-sm">สาขา</label>
								<div class="col-sm-8">
									<input type="text" class="form-control form-control-sm"
										id="colFormLabelSm" placeholder="สาขา">
								</div>
							</div>
						</div>

					</div>
					<div class="row">
						<div class="col-md-4">
							<div class="form-group" align="left">
								<div class="form-group row">
									<label for="colFormLabelSm" align="left"
										class="col-sm-4 col-form-label col-form-label-sm">มีฐานชั่วโมง</label>
									<div class="col-sm-3">
										<input type="text" class="form-control form-control-sm"
											id="colFormLabelSm">

									</div>
									<label class="col-sm-4 col-form-label col-form-label-sm">คาบ</label>
								</div>
							</div>
						</div>
						<div class="col-md-8">
							<div class="form-group row">
								<label for="colFormLabelSm" align="left"
									class="col-sm-3 col-form-label col-form-label-sm">เบิกค่าสอนพิเศษไม่เกิน</label>
								<div class="col-sm-2">
									<input type="text" align="left"
										class="form-control form-control-sm" id="colFormLabelSm"
										placeholder="ชั่วโมง">
								</div>
								<label align="left"
									class="col-sm-4 col-form-label col-form-label-sm">ชั่วโมง</label>
							</div>
						</div>
					</div>

					<div class="col-md-12" align="left" style="top: 5%">
						<h6>นักคึกษาถาคปกติชั้นปีที่ 1-5</h6>
					</div>
					<hr class="w3-clear">
					<div class="row">
						<div class="col-md-4">
							<div class="form-group" align="left">
								<div class="form-group row">
									<label for="colFormLabelSm"
										class="col-sm-3 col-form-label col-form-label-sm">รหัสวิชา</label>
									<div class="col-sm-7">
										<input type="text" class="form-control form-control-sm"
											id="colFormLabelSm" placeholder="รหัสวิชา">
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-3">
							<div class="form-group row" align="left">
								<label for="colFormLabelSm"
									class="col-md-4 col-form-label col-form-label-sm">Section</label>
								<div class="col-sm-4">
									<input type="text" class="form-control form-control-sm"
										id="colFormLabelSm" placeholder="00">
								</div>
							</div>
						</div>
						<div class="col-md-5">
							<div class="form-group row" align="left">
								<label for="colFormLabelSm"
									class="col-md-4 col-form-label col-form-label-sm">จำนวนหน่วยกิจ</label>

								<label for="colFormLabelSm"
									class="col-md-1 col-form-label col-form-label-sm">นก.</label>
								<div class="col-sm-3">
									<input type="text" class="form-control form-control-sm"
										id="colFormLabelSm" placeholder="00">
								</div>
								<label for="colFormLabelSm"
									class="col-md-1 col-form-label col-form-label-sm">ซม.</label>
								<div class="col-sm-3">
									<input type="text" class="form-control form-control-sm"
										id="colFormLabelSm" placeholder="0-0-0">
								</div>
							</div>
						</div>

					</div>


					<div class="row">
						<div class="col-md-5">
							<div class="form-group" align="left">
								<div class="form-group row">
									<label for="colFormLabelSm"
										class="col-sm-4 col-form-label col-form-label-sm">ใช้เป็นฐาน/คาบ</label>
									<div class="col-sm-4">
										<input type="text" class="form-control form-control-sm"
											id="colFormLabelSm" placeholder="00">
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-7">
							<div class="form-group row" align="left">
								<label for="colFormLabelSm"
									class="col-sm-4 col-form-label col-form-label-sm">ใช้เบิก/หน่วยชั่วโมง</label>
								<div class="col-sm-3">
									<input type="text" class="form-control form-control-sm"
										id="colFormLabelSm" placeholder="00">
								</div>
							</div>
						</div>

					</div>

				</div>


			</div>
			<div class="container">
				<p class="text-muted"></p>
			</div>

<script src="/js/insert.js"></script>

		</form>
	</div>
</body>
</html>