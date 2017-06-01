$("document").ready(function() {

	$("#form1").click(function() {
		a();
	});
	$("#form2").click(function() {
		var h="_";
		$("#p1").val(h);
		b();
	});
	$("#b2").click(function() {
		c();
	});
	$("#p2").click(function() {
		d();
	});
});

function a() {
	$("#place")
			.html(
					"<script src='jquery2.js'></script>"
							+ "NAME......:<input type='text' id='z1' name='name'><br>ADDRESS...:<input type='text' id='z2' name='address'>"
							+ "<br>PHONENO...:<input type='text' id='z3' name='phoneno'><br>EMAIL ID..:<input type='text' id='z4' name='email'><br><input type='button' id='b2' value='hit me to register'>");

}
function b() {
	
	$("#place")
			.html("<script src='jquery2.js'></script>"
					+" <CENTER> NEED TO GET THE DATA THEN PROVIDE THE NAME OF THE PARTICULAR INDIVIDUAL<br>"
							+ " NAME --:<input type='text' id='p3' name='phoneno'><br><input type='button' id='p2' value='hit me to view the result'></CETER>");
}
function c() {
	var n1 = $("#z1").val();
	var a1 = $("#z2").val();
	var p1 = $("#z3").val();
	var e1 = $("#z4").val();
	var obj = new Object();
	obj.name = n1;
	obj.address = a1;
	obj.phone = p1;
	obj.email = e1;
	var myjson = JSON.stringify(obj);
	$.ajax({
		type : "POST",
		url : "biodata",
		dataType : "text",
		contentType : "application/x-www-form-urlencoded",
		data : {
			json : myjson
		},
		success : function(data) {
			if (data != null) {
				$("#k11").text(data);
			} else {
				$("#k11").text("Not Registered try again");
			}
		}

	});
}
function d() {
	var e1 = $("#p3").val();
	
	$.ajax({
		type : "GET",
		url : "biodata",
		dataType : "text",
		data : {e1},
		contentType : "application/x-www-form-urlencoded",
		success : function(data) {
			console.log(data);
			if(data != null){
				$("#k11").text(data);
			}
			else{
				$("#k11").text("Wrong email id provide the currect id");
			}

		}
	});

}