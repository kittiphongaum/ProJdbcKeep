

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
		
	});
}
