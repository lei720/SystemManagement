
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Internet Dreams</title>
<link rel="stylesheet" href="css/screen.css" type="text/css" media="screen" title="default" />
<!--[if IE]>
<link rel="stylesheet" media="all" type="text/css" href="css/pro_dropline_ie.css" />
<![endif]-->

<!--  jquery core -->
<script src="js/jquery/jquery-1.4.1.min.js" type="text/javascript"></script>
 
<!--  checkbox styling script -->
<script src="js/jquery/ui.core.js" type="text/javascript"></script>
<script src="js/jquery/ui.checkbox.js" type="text/javascript"></script>
<script src="js/jquery/jquery.bind.js" type="text/javascript"></script>
<script type="text/javascript">
$(function(){
	$('input').checkBox();
	$('#toggle-all').click(function(){
 	$('#toggle-all').toggleClass('toggle-checked');
	$('#mainform input[type=checkbox]').checkBox('toggle');
	return false;
	});
});
</script>  


<![if !IE 7]>

<!--  styled select box script version 1 -->
<script src="js/jquery/jquery.selectbox-0.5.js" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function() {
	$('.styledselect').selectbox({ inputClass: "selectbox_styled" });
});
</script>
 

<![endif]>


<!--  styled select box script version 2 --> 
<script src="js/jquery/jquery.selectbox-0.5_style_2.js" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function() {
	$('.styledselect_form_1').selectbox({ inputClass: "styledselect_form_1" });
	$('.styledselect_form_2').selectbox({ inputClass: "styledselect_form_2" });
});
</script>

<!--  styled select box script version 3 --> 
<script src="js/jquery/jquery.selectbox-0.5_style_2.js" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function() {
	$('.styledselect_pages').selectbox({ inputClass: "styledselect_pages" });
});
</script>

<!--  styled file upload script --> 
<script src="js/jquery/jquery.filestyle.js" type="text/javascript"></script>
<script type="text/javascript" charset="utf-8">
$(function() {
	$("input.file_1").filestyle({ 
	image: "images/forms/upload_file.gif",
	imageheight : 29,
	imagewidth : 78,
	width : 300
	});
});
</script>

<!-- Custom jquery scripts -->
<script src="js/jquery/custom_jquery.js" type="text/javascript"></script>
 
<!-- Tooltips -->
<script src="js/jquery/jquery.tooltip.js" type="text/javascript"></script>
<script src="js/jquery/jquery.dimensions.js" type="text/javascript"></script>
<script type="text/javascript">
$(function() {
	$('a.info-tooltip ').tooltip({
		track: true,
		delay: 0,
		fixPNG: true, 
		showURL: false,
		showBody: " - ",
		top: -35,
		left: 5
	});
});
</script> 

<!--  date picker script -->
<link rel="stylesheet" href="css/datePicker.css" type="text/css" />
<script src="js/jquery/date.js" type="text/javascript"></script>
<script src="js/jquery/jquery.datePicker.js" type="text/javascript"></script>
<script type="text/javascript" charset="utf-8">
        $(function()
{

// initialise the "Select date" link
$('#date-pick')
	.datePicker(
		// associate the link with a date picker
		{
			createButton:false,
			startDate:'01/01/2005',
			endDate:'31/12/2020'
		}
	).bind(
		// when the link is clicked display the date picker
		'click',
		function()
		{
			updateSelects($(this).dpGetSelected()[0]);
			$(this).dpDisplay();
			return false;
		}
	).bind(
		// when a date is selected update the SELECTs
		'dateSelected',
		function(e, selectedDate, $td, state)
		{
			updateSelects(selectedDate);
		}
	).bind(
		'dpClosed',
		function(e, selected)
		{
			updateSelects(selected[0]);
		}
	);
	
var updateSelects = function (selectedDate)
{
	var selectedDate = new Date(selectedDate);
	$('#d option[value=' + selectedDate.getDate() + ']').attr('selected', 'selected');
	$('#m option[value=' + (selectedDate.getMonth()+1) + ']').attr('selected', 'selected');
	$('#y option[value=' + (selectedDate.getFullYear()) + ']').attr('selected', 'selected');
}
// listen for when the selects are changed and update the picker
$('#d, #m, #y')
	.bind(
		'change',
		function()
		{
			var d = new Date(
						$('#y').val(),
						$('#m').val()-1,
						$('#d').val()
					);
			$('#date-pick').dpSetSelected(d.asString());
		}
	);

// default the position of the selects to today
var today = new Date();
updateSelects(today.getTime());

// and update the datePicker to reflect it...
$('#d').trigger('change');
});
</script>

<!-- MUST BE THE LAST SCRIPT IN <HEAD></HEAD></HEAD> png fix -->
<script src="js/jquery/jquery.pngFix.pack.js" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function(){
$(document).pngFix( );
});
</script>
<script>
function myFunctiont()
{
var x=form2.fname.value;
var t=form2.iframe.value;
var y=form2.test.value;

if(!(new RegExp("\\S+")).test(y))  
     {    
     document.getElementById("p3").style.display=""; 
    document.getElementById("p3").innerHTML="(请输入用户名!)";
    // document.getElementById("form1").action="";
        return false;
     }  
else
{
document.getElementById("p3").style.display="none";
   
			if(isNaN(x))  
			     {    
			     document.getElementById("p").style.display=""; 
			    document.getElementById("p").innerHTML="(请输入数字!)";
			     //document.getElementById("form1").action="";
			          return false;
			     }  
			else
			{
			document.getElementById("p").style.display="none"; 
			     
			      
							if(isNaN(t))  
							     {    
							     document.getElementById("p2").style.display=""; 
							    document.getElementById("p2").innerHTML="(请输入数字!)";
							    // document.getElementById("form1").action="";
							         return false;
							     }  
							else
							{
							document.getElementById("p2").style.display="none";
							     document.getElementById("form2").action="useredite.action";
							         form2.submit();
							      
							}
			}
}
}
</script>

<script>
function myFunction2()
{
form2.fname.value="";
form2.iframe.value="";
form2.test.value="";
form2.projectname.value="";
}
</script>
<style type="text/css">
<!--
.STYLE3 {font-size: large}
.STYLE5 {font-size: large; color: #FFFFFF; }
.STYLE6 {color: #FFFFFF}
.STYLE7 {font-size: 36px; }
-->
</style>
</head>
<body> 
<!-- Start: page-top-outer -->
<div id="page-top-outer">    

<!-- Start: page-top -->
<div id="page-top">

	<!-- start logo -->
	<div id="logo">
	<a href=""><img src="images/shared/logo.png" width="156" height="40" alt="" /></a>
	</div>

	<!-- end logo -->
	<span class="STYLE5"></span>
	
	<!--  start top-search -->
	<div id="top-search">
		<table border="0" cellpadding="0" cellspacing="0">
		<tr>
		  <td>&nbsp;</td>
		  <td>&nbsp;</td>
		<td>&nbsp;</td>
		</tr>
		</table>
	</div>
 	<!--  end top-search -->
 	<div class="clear"></div>

</div>

<!-- End: page-top -->

</div>
<!-- End: page-top-outer -->
	
<div class="clear">&nbsp;</div>
 
<!--  start nav-outer-repeat................................................................................................. START -->
<div class="nav-outer-repeat"> 
<!--  start nav-outer -->
<div class="nav-outer"> 

		<!-- start nav-right -->
	<div id="nav-right">
		
			<div class="nav-divider">&nbsp;</div>
			<div class="showhide-account"><img src="images/shared/nav/nav_myaccount.gif" width="93" height="14" alt="" /></div>
			<div class="nav-divider">&nbsp;</div>
			<a href="loginout.action" id="logout"><img src="images/shared/nav/nav_logout.gif" width="64" height="14" alt="" /></a>
			<div class="clear">&nbsp;</div>
		
			<!--  start account-content -->	
				<div class="account-content">
			<div class="account-drop-inner">
				<a href="myacount.action" id="acc-settings">Settings</a>
				
			</div>
			</div>
			<!--  end account-content -->
		
		</div>
		<!-- end nav-right -->


		<!--  start nav -->
		<div class="nav">
		<div class="table">
		
		<ul class="select">
		  <li><a href="userview"><b>UserManage</b><!--[if IE 7]><!--></a><!--<![endif]-->
		<!--[if lte IE 6]><table><tr><td><![endif]-->
		<div class="select_sub">
			<ul class="sub">
				<li><a href="userview">Users View</a></li>
				<li><a href="useradd.jsp">Add Users</a></li>
				<li><a href="userview">Delete Users</a></li>
			</ul>
		</div>
		<!--[if lte IE 6]></td></tr></table></a><![endif]-->
		</li>
		</ul>
		
		<div class="nav-divider">&nbsp;</div>
		                    
		<ul class="current">
		  <li><!--<![endif]-->
		<!--[if lte IE 6]><table><tr><td><![endif]-->
			<div class="select_sub">
			<ul class="sub">
				<li><a href="#nogo">Dashboard Details 1</a></li>
				<li><a href="#nogo">Dashboard Details 2</a></li>
				<li><a href="#nogo">Dashboard Details 3</a></li>
			</ul>
		</div>
		<!--[if lte IE 6]></td></tr></table></a><![endif]-->
		</li>
		</ul>
		
		<div class="nav-divider">&nbsp;</div>
		
	<ul class="select">
		  <li><a href="projectview.action"><b>ProjectManage</b><!--[if IE 7]><!--></a><!--<![endif]-->
		<!--[if lte IE 6]><table><tr><td><![endif]-->
		<div class="select_sub">
			<ul class="sub">
			<li><a href="projectview.action">Project View</a></li>
				<li><a href="projectadd.jsp">Add Project</a></li>
				<li><a href="projectview.action">Delete Project</a></li>
			</ul>
		</div>
		<!--[if lte IE 6]></td></tr></table></a><![endif]-->
		</li>
		</ul>
		
		<div class="nav-divider">&nbsp;</div>
		
	
		

		
		<div class="clear"></div>
		</div>
		<div class="clear"></div>
		</div>
		<!--  start nav -->

</div>
<div class="clear"></div>
<!--  start nav-outer -->
</div>
<!--  start nav-outer-repeat................................................... END -->
 
 <div class="clear"></div>
 
<!-- start content-outer -->
<div id="content-outer">
<!-- start content -->
<div id="content">


<div id="page-heading">
  <h1>Edite User</h1>
</div>


<table border="0" width="100%" cellpadding="0" cellspacing="0" id="content-table">
<tr>
	<th rowspan="3" class="sized"><img src="images/shared/side_shadowleft.jpg" width="20" height="300" alt="" /></th>
	<th class="topleft"></th>
	<td id="tbl-border-top">&nbsp;</td>
	<th class="topright"></th>
	<th rowspan="3" class="sized"><img src="images/shared/side_shadowright.jpg" width="20" height="300" alt="" /></th>
</tr>
<tr>
	<td id="tbl-border-left"></td>
	<td>
	<!--  start content-table-inner -->
	<div id="content-table-inner">
	
	<table border="0" width="100%" cellpadding="0" cellspacing="0">
	<tr valign="top">
	<td>
	
	
		<!--  start step-holder -->
	
		<!--  end step-holder -->
	
		<!-- start id-form -->
	
		<form id="form2" action="useredite.action" method="post">
		<table border="0" cellpadding="0" cellspacing="0"  id="id-form">
		
		<tr>
			<th valign="top">User's Name:</th>
			<td><input type="text" id="test" class="inp-form-error" name="user.username" value="<s:property value="user.username"/>"/><s:property value="#request.usernameerro"/></td>
			<td><p id="p3"></p></td>
		</tr>
		<tr>
			<th valign="top">User's working hours:(单位)/月:</th>
			<td><input type="text" id="fname" name="user.userpagenum" value="<s:property value="user.userpagenum"/>" class="inp-form" /></td>
			<td><p id="p"></p></td>
		</tr>
		<tr>
		<th>User's Position:</th>
	<td><select name="user.userpostion" id="selectAge">   
        <option value="工程师">工程师</option>   
        <option value="技术人员">技术人员</option>   
         
           
      </select></td>
		</tr> 
		<tr>
			<th>User's Sex:</th>
	<td><select name="user.usersex " id="selectAge">   
        <option value="男">男</option>   
        <option value="女">女</option>   
         
           
      </select></td>
	<td>&nbsp;</td>
		</tr>
		
	
	<tr>
		<th valign="top">User's ProjectNumber:</th>
		<td><input id="iframe" name="projectid" value="<s:property value="user.project.projectid"/> "type="text" class="inp-form-error" /><s:property value="#request.projecterro"/><p id="p2"></p></td>
		<td></td>
		

	</tr>
	<tr>
		<th valign="top">User's ProjectName:</th>
		<td><input id="projectname" name="projectname" value="<s:property value="user.project.projectname"/> "type="text" class="inp-form-error" /><s:property value="#request.projectnameerro"/></td>
		<td></td>
		

	</tr>
	<tr>
		<th>&nbsp;</th>
		<td valign="top">
			<input type="button" onclick="myFunctiont()" value="" class="form-submit" />
			<input type="button" onclick="myFunction2()" value="" class="form-reset"  />
		</td>
		
	</tr>
	</table>

	</form>
	<!-- end id-form  -->
	</td>
	
	<td>

	<!--  start related-activities -->
	<!-- end related-activities --></td>
</tr>
<tr>
<td><img src="images/shared/blank.gif" width="695" height="1" alt="blank" /></td>
<td></td>
</tr>
</table>
 
<div class="clear"></div>
 

</div>
<!--  end content-table-inner  -->
</td>
<td id="tbl-border-right"></td>
</tr>
<tr>
	<th class="sized bottomleft"></th>
	<td id="tbl-border-bottom">&nbsp;</td>
	<th class="sized bottomright"></th>
</tr>
</table>









 





<div class="clear">&nbsp;</div>

</div>
<!--  end content -->
<div class="clear">&nbsp;</div>
</div>
<!--  end content-outer -->

 

<div class="clear">&nbsp;</div>
    
<!-- start footer -->         
<div id="footer">
	<!--  start footer-left -->
	<div id="footer-left">
	Admin Skin &copy; Copyright Internet Dreams Ltd. <a href="">www.netdreams.co.uk</a>. All rights reserved.</div>
	<!--  end footer-left -->
	<div class="clear">&nbsp;</div>
</div>
<!-- end footer -->
 
</body>
</html>