function validation() {
	var name = document.getElementById("nameOfUser").value;
	var email = document.getElementById("email").value;
	if (name === '' || email === '') {
		alert("Please fill all fields...!!!!!!");
		return false;
	} else {
		alert("Success");
	}
}