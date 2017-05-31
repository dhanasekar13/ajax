$("document").ready(function() {

	$("#form1").click(function() {
		a();
	});
	$("#form2").click(function() {
		b();
	});
	$("#b2").click(function(){
		c();
				
		});
	});

function a() {
	$("#place").html("<script src='jquery2.js'></script>"+
					"NAME......:<input type='type' id='z1' name='name'><br>ADDRESS...:<input type='type' id='z2' name='address'>" +
					"<br>PHONENO...:<input type='type' id='z3' name='phoneno'><br>EMAIL ID..:<input type='type' id='z4' name='email'><br><input type='button' id='b2' value='hit me to register'>");
	


}
function b() {
	$("#place").html(" <CENTER> NEED TO GET THE DATA PROVIDE THE NAME OF THE PARTICULAR INDIVIDUAL"+
					"<form action='biodata' method='get'>NAME --<input type='type' name='name'><br><input type='submit' value='hit me'></form></CETER>");
}
function c(){
	var n1=$("#z1").val();
	var a1=$("#z2").val();
	var p1=$("#z3").val();
	var e1=$("#z4").val();
	var obj=new Object();
	obj.name=n1;
	obj.address=a1;
	obj.phone=p1;
	obj.email=e1;
	var myjson=JSON.stringify(obj);
	$.ajax({
		type:"POST",
		url:"biodata",
		dataType:"text",
		contentType:"application/x-www-form-urlencoded",
		data:{json:myjson},
		success:function(data){
			if(data!=null)
				{
				$("#p1").text(data);
				}
			else
				{
				$("#p1").text("Not Registered try again");
				}
		}
		
		
	});
}