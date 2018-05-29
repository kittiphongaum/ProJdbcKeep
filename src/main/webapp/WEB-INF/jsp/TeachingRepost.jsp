<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<div class="w3-container w3-card w3-white w3-round w3-margin">

	<div class="col-md-12 col-sm-12">
		<a class="w3-button  w3-border col-md-8" align="right"
			style="background-color: rgb(223, 221, 221)">เพิ่มข้อมูลการสอนถาคปกติ
			></a> 
			<a class=" w3-btn w3-border " align="left"
			style="background-color: rgb (94, 90, 90)">ผลการลงทะเบียน</a>
	</div>


</div>
<div class="w3-container w3-card w3-white w3-round w3-margin">
	<div class="row">
		<div class="col-md-12 col-sm-12">
			<div class="form-group" align="right">
				<div class="col-md-12 col-sm-12">
					<button name="submitFormPayment" type="button"
						id="submitFormPayment" class="btn btn-success btn-lg"
						onclick="submitForm()">
						<span class="glyphicon glyphicon-share">พิมพ์ PDF</span>
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
						<span class="glyphicon glyphicon-share"> ผลการลงทะเบียน</span>
					</button>
				</div>
			</div>
		</div>
		<hr class="w3-clear" style="top: 10%">
		<table class="table table-bordered">
			<thead>
				<tr>
					<th rowspan="2" align="center">#</th>
					<th rowspan="2" align="center">รหัสวิชา</th>
					<th rowspan="2" align="center">section</th>

					<th colspan="2" align="center">จำนวนหน่วยกิจ</th>
					<th rowspan="2" align="center">จำนวนนักศึกษา</th>
					<th rowspan="2" align="center">ใช้เป็นฐาน/คาบ</th>
					<th rowspan="2" align="center">ใช้เป็นหน่วย/ชั่วโมง</th>

				</tr>

				<tr>
					<td>นก.</td>
					<td>ชม.</td>
				</tr>

			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<th scope="row">2</th>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<th scope="row">3</th>
					<td colspan="5" align="center">รวม</td>
					<td></td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="row">
		<div class="col-md-12 col-sm-12">
			<div class="form-group" align="left">
				<div class="col-md-12 col-sm-12">
					<button name="" type="button" id="submitFormPayment"
						class="btn btn-success btn-lg" onclick="submitForm()">
						<span class="glyphicon glyphicon-share">ย้อนกลับ</span>
					</button>
				</div>
			</div>
		</div>
	</div>
</div>