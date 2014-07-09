/**
 * Kaya Niranjan Kumar Reddy
 */

function clearDOB(obj){
	var value = obj.value;
	if(value == "DD-MM-YYYY"){
		obj.value = "";
	}
}

function resetDOB(obj){
	var value = obj.value;
	if(value == ""){
		obj.value = "DD-MM-YYYY";
	}
}

function validateForm(form){
	var result = true;
	
	if(form.userid.value == ""){
		alert("User ID is empty.....");
		result = false;
	}
	if((form.password.value != form.confirmPassword.value) || (form.password.value == "")){
		alert("Either Password is empty or Password and Confirm Password do not match. Please correct.....");
		form.password.focus();
		result = false;
	}
	if(form.alias.value == ""){
		alert("Screen Name is empty.....");
		result = false;
	}
	if(form.name.value == ""){
		alert("Full Name is empty.....");
		result = false;
	}
	if(form.secretquestion.value == ""){
		alert("Secret Question is empty.....");
		result = false;
	}
	if(form.secretanswer.value == ""){
		alert("Secret Answer is empty.....");
		result = false;
	}
	if(form.dob.value == "DD-MM-YYYY" || form.dob.value.length != 10){
		alert("Please fill DOB correctly.....");
		result = false;
	}
	if(form.dob.value.length == 10 && form.dob.value != "DD-MM-YYYY"){
		var date = form.dob.value;
		result = validateDate(date);
	}
	if(form.phone.value == ""){
		alert("Phone Number is empty.....");
		result = false;
	}
	if(form.address.value == ""){
		alert("Address is empty.....");
		result = false;
	}
	if(form.city.value == ""){
		alert("City is empty.....");
		result = false;
	}
	if(form.province.value == ""){
		alert("Province is empty.....");
		result = false;
	}
	if(form.zip.value == ""){
		alert("ZIP code is empty.....");
		result = false;
	}
	if(form.country_code.value == ""){
		alert("Country Code is empty.....");
		result = false;
	}
	if(form.email.value == ""){
		alert("Email is empty.....");
		result = false;
	}
	if(form.date_format.value == ""){
		alert("Date Format is empty.....");
		result = false;
	}
	if(form.currency.value == ""){
		alert("Currency Code is empty.....");
		result = false;
	}
	if(form.language.value == ""){
		alert("Language is empty.....");
		result = false;
	}
	if(form.education.value == ""){
		alert("Education Degree is empty.....");
		result = false;
	}
	if(form.industry.value == ""){
		alert("Industry is empty.....");
		result = false;
	}
	if(form.job_role.value == ""){
		alert("Job Role / Position / Designation is empty.....");
		result = false;
	}
	if(form.company.value == ""){
		alert("Company or Institution is empty.....");
		result = false;
	}
	if(form.jcaptcha.value == ""){
		alert("Captcha Code is empty.....");
		result = false;
	}
	return result;
}

function validateDate(date){
    var pattern =/^([0-9]{2})-([0-9]{2})-([0-9]{4})$/;
    //var pattern =/^([0-9]{2})\/([0-9]{2})\/([0-9]{4})$/;
    if (date == null || date == "" || !pattern.test(date)){
        //errMessage += "Invalid date of birth\n";
    	alert("Date Pattern is wrong. Please correct.....");
        return false;
    }else{
        return true;
    }
}