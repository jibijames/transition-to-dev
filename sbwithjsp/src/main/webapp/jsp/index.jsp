<html>
<head>
<link href="${pageContext.request.contextPath}/css/email.css" rel="stylesheet" type="text/css">
    <script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/js/common.js"></script>
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
	<input type="submit" value="Submit" onclick="validation()">

</body>

</html>