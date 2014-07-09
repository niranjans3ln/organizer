<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errorPage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="registerpage.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BS5LND Corporation</title>
</head>
<body>

<br/>
<h3>Please fill the fields marked with '*'.</h3>

<form name="registerUser" action="/organizer/register" method="post" onsubmit="return validateForm(this);">
	<table width=450>
		<tr>
			<td width="30%">* User ID :</td>
			<td width="*"><input type="text" name="userid"/></td>
		</tr>
		<tr>
			<td width="30%">* Password :</td>
			<td width="*"><input type="password" name="password"/></td>
		</tr>
		<tr>
			<td width="30%">* Confirm Pass. :</td>
			<td width="*"><input type="password" name="confirmPassword"/></td>
		</tr>
		<tr>
			<td width="30%">* Screen Name :</td>
			<td width="*"><input type="text" name="alias"/></td>
		</tr>
		<tr>
			<td width="30%">* Full Name :</td>
			<td width="*"><input type="text" name="name"/></td>
		</tr>
		<tr>
			<td width="30%">* Secret Question :</td>
			<td width="*"><input type="text" name="secretquestion"/></td>
		</tr>
		<tr>
			<td width="30%">* Secret Answer :</td>
			<td width="*"><input type="text" name="secretanswer"/></td>
		</tr>
		<tr>
			<td width="30%">* Date of Birth :</td>
			<td width="*"><input type="text" name="dob" value="DD-MM-YYYY" onfocus='clearDOB(this);' onblur="resetDOB(this);"/></td>
		</tr>
		<tr>
			<td width="30%">* Phone No :</td>
			<td width="*"><input type="text" name="phone"/></td>
		</tr>
		<tr>
			<td width="30%">* Address :</td>
			<td width="*"><input type="text" name="address"/></td>
		</tr>
		<tr>
			<td width="30%">* City :</td>
			<td width="*"><input type="text" name="city"/></td>
		</tr>
		<tr>
			<td width="30%">* Province/State :</td>
			<td width="*"><input type="text" name="province"/></td>
		</tr>
		<tr>
			<td width="30%">* ZIP/Postal Code :</td>
			<td width="*"><input type="text" name="zip"/></td>
		</tr>
		<tr>
			<td width="30%">* Country Code :</td>
			<td width="*"><input type="text" name="country_code" size="2" maxlength="2"/></td>
		</tr>
		<tr>
			<td width="30%">* Email :</td>
			<td width="*"><input type="text" name="email"/></td>
		</tr>
		<tr>
			<td width="30%">* Date Format :</td>
			<td width="*"><input type="text" name="date_format" value="DD-MM-YYYY"/></td>
		</tr>
		<tr>
			<td width="30%">* Currency Code :</td>
			<td width="*"><input type="text" name="currency" size="3" maxlength="3"/></td>
		</tr>
		<tr>
			<td width="30%">* Language :</td>
			<td width="*"><input type="text" name="language"/></td>
		</tr>
		<tr>
			<td width="30%">* Highest Education :</td>
			<td width="*"><input type="text" name="education"/></td>
		</tr>
		<tr>
			<td width="30%">* Industry :</td>
			<td width="*"><input type="text" name="industry"/></td>
		</tr>
		<tr>
			<td width="30%">* Designation :</td>
			<td width="*"><input type="text" name="job_role"/></td>
		</tr>
		<tr>
			<td width="30%">* Company Name :</td>
			<td width="*"><input type="text" name="company"/></td>
		</tr>
		<tr>
			<td width="30%">* Receive Updates? :</td>
			<td width="*"> &nbsp;  &nbsp;Yes : <input type="radio" name="mail_communication" value="Y" checked="checked"/> &nbsp; &nbsp; &nbsp; No : <input type="radio" name="mail_communication" value="N"/></td>
		</tr>
		<tr>
			<td width="30%"> Sun/Moon Sign :</td>
			<td width="*"><input type="text" name="horoscope"/></td>
		</tr>
		<tr>
			<td width="30%"> Captcha :</td>
			<td width="*"><!-- img src="jcaptcha.jpg" /><br/><input type="text" name="jcaptcha" value="" /-->
			<img src="/simpleCaptcha.png" />Don't worry. Captcha service is down now. Ignore it.<br/><input type="text" name="jcaptcha" value="" /></td>
		</tr>
		<tr>
			<td width="30%"><input type="reset" name="reset" value = "Clear Form"/></td>
			<td width="*"><input type="submit" name="submit" value = " Register "/></td>
		</tr>
	</table>



</form>
</body>
</html>