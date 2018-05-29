<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> 
</head>
<body>

<div class="col-md-4">
					<form>
							<div class="form-group row" align="left">
								<label for="colFormLabelSm"
									class="col-sm-3 col-form-label col-form-label-sm">รหัส</label>
							
								<div class="col-sm-8">
									<input type="text" class="form-control form-control-sm"
										id="TeachID" name="TeachID" placeholder="รหัส">
								</div>
									<div class="col-sm-8">
									<input type="text" class="form-control form-control-sm"
										id="TeacherPass" name="TeacherPass" placeholder="รหัส">
								</div>
									<div class="col-sm-8">
									<input type="text" class="form-control form-control-sm"
										id="TeacherName" name="TeacherName" placeholder="รหัส">
								</div>
									<div class="col-sm-8">
									<input type="text" class="form-control form-control-sm"
										id="TeacherFname" name="TeacherFname" placeholder="รหัส">
								</div>
							</div>
						</div>
						<button type="submit" class="btn btn-success" onclick="a()" >ยืนยัน</button>
						</form>
</body>





		<script type="text/javascript">
//insert
function a() {
	console.log("sss")
	
	var Teacher = {
		TeachID : $('#TeachID').val(),//id, */
		TeacherPass : $('#TeacherPass').val(),//id
	TeacherName : $('#TeacherName').val(),
		TeacherFname : $('#TeacherFname').val(),	 
		
	}

	$.ajax({
		type : "POST",
		url : "/insertamnuay",
		contentType : "application/json; charset=utf-8",
		data : JSON.stringify(Teacher),
		dataType : "json",
		success : function(msg) {
		console:log("Success")
		 
		}
	});
	
}
</script>


</html>