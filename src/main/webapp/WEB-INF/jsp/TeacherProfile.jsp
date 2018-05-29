<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	
<form action="/TeacherProfile" method="post">
			
				<div class="w3-container w3-card w3-white w3-round w3-margin">
					<div class=" col-md-12">
						<div class="form-group" align="left">
							<div class="col-md-12 col-sm-12">
								<a
									 class="btn btn-success btn-lg"
									onclick="submitForm()">
									<span class="glyphicon glyphicon-share">
										เพิ่มข้อมูลการสอนถาคปกติ</span>
								</a>
							</div>
						</div>
					</div>
					<hr class="w3-clear" style="top: 10%">
					<div class="row" style="top: 10%">
						<div class="col-md-4">
							<div class="form-group" align="left">
								<div class="form-group row">
									<label for="colFormLabelSm"
										class="col-sm-3 col-form-label col-form-label-sm">ID</label>
									<div class="col-sm-7">
										<input type="text" class="form-control form-control-sm" name = "TeachID" id="TeachID"
											placeholder="ID">
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group row" align="left">
								<label for="colFormLabelSm"
									class="col-sm-3 col-form-label col-form-label-sm">รหัส</label>
								<div class="col-sm-8">
									<input type="text" class="form-control form-control-sm"
										id="TeacherPass" name="TeacherPass" placeholder="รหัส">
								</div>
							</div>
						</div>

					</div>
					<div class="row">
						<div class="col-md-4">
							<div class="form-group" align="left">
								<div class="form-group row">
									<label for="colFormLabelSm"
										class="col-sm-3 col-form-label col-form-label-sm">ชื่อ</label>
									<div class="col-sm-7">
										<input type="text" class="form-control form-control-sm"
											id="TeacherName" name="TeacherName" placeholder="ชื่อ">
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
										id="TeacherFname" name="TeacherFname" placeholder="นามสกุล">
								</div>
							</div>
						</div>
						
					</div>

					
					
					<hr class="w3-clear">
					
<div class="w3-container w3-card w3-white w3-round w3-margin">
				<div class="row">
					<div class="col-md-12 col-sm-12">
						<div class="form-group" align="right">
							<div class="col-md-12 col-sm-12">
								<a href="/" type="submit"
									 class="btn btn-success btn-lg"
									onclick="insertConfirm()">
									<span class="glyphicon glyphicon-share"> บันทึก</span>
								</a>
							</div>
						</div>
					</div>
				</div>
				</div>
</div>


		</form>
		<script type="text/javascript">

	
//insert
function insertConfirm() {
//	console.log(warranty)
	var Teacher = {
		TeachID : $('#TeachID').val(),//id,
		TeacherPass : $('#TeacherPass').val(),//id
		TeacherName : $('#TeacherName').val(),
		TeacherFname : $('#TeacherFname').val(),	
		
	}

	$.ajax({
		type : "POST",
		url : "/TeacherProfile",
		contentType : "application/json; charset=utf-8",
		data : JSON.stringify(Teacher),
		dataType : "json",
		console:log("sssss"),
	});
}
</script>
		
		
