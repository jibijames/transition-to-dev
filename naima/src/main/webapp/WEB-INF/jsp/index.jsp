<html>
<head>
<link href="css/email.css" rel="stylesheet" type="text/css">
    <%-- <script language="javascript" type="text/javascript" src="js/common.js<%=application.getAttribute("rel_ver")%>"></script> --%>
</head>
<body>
	<div class="add-sms-credit-row">
		<div class="ea-label">Name:</div>
		<div class="ea-input-wrapper">
			<div class="ea-input-holder">
			<input id="nameOfUser" class="ea-input" type="text"
					value=""
					onkeydown="return (event.keyCode!=13);" autocomplete="off"
					maxlength="60" onblur="this.value=this.value.trim()">
			</div>
		</div>
	</div>
	<div class="add-sms-credit-row">
		<div class="ea-label">Email:</div>
		<div class="ea-input-wrapper">
			<div class="ea-input-holder">
				<input id="email" class="ea-input" type="text"
					value=""
					onkeydown="return (event.keyCode!=13);" autocomplete="off"
					maxlength="60" onblur="this.value=this.value.trim()">
			</div>
		</div>
	</div>

</body>

</html>