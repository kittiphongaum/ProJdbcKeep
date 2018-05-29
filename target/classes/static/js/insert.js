function insertConfirm() {
//	console.log(warranty)
	var  Teacher= {
			repairDateStr : $('#repairDate').val(),//id,
			repairname : $('#exampleFormControlInput1').val(),//id
			repairAddress : $('#exampleFormControlTextarea1').val(),
			repairPhone : $('#exampleFormControlInput2').val(),
			repairEmail : $('#email').val(),
			repairWarranty : warranty,
			repairSerialnumber : $('#serialnumber').val(),
			repairType : $('#a').val(),
			repairProduct : $('#b').val(),
			repairWaste : $('#Waste').val(),
			repairDetail : $('#detail').val(),
			repairAppointment : $('#appointment').val(),
		
	}
	var Position={}
	var Subject={}
	var Term={}
	var Rate= {}
	var Faculty= {}
	var Department={}
	


	$.ajax({
		type : "POST",
		url : "/TeachingRepost"
		contentType : "application/json; charset=utf-8",
		data : JSON.stringify(repairBean),
		dataType : "json",
		success : function(msg) {
		console.log('Success')
		 
		}
	});
}