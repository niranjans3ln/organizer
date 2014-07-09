package model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_login")
public class Login {
	
	@Column(name = "login_slno", nullable = false)
	private int login_slno;
	
	@Id
	@Column(name = "login_id", nullable = false)
	private String login_id;
	
	@Column(name = "login_password", nullable = false)
	private String login_password;

	@Column(name = "login_aliasname", nullable = true)
	private String login_aliasname;
	
	@Column(name = "login_name", nullable = false)
	private String login_name;
	
	@Column(name = "login_secretquestion", nullable = false)
	private String login_secretquestion;
	
	@Column(name = "login_secretanswer", nullable = false)
	private String login_secretanswer;

	@Column(name = "login_dob", nullable = true)
	private String login_dob;
	
	@Column(name = "login_doj", nullable = true)
	private String login_doj;
	
	@Column(name = "login_address", nullable = true)
	private String login_address;

	@Column(name = "login_city", nullable = true)
	private String login_city;

	@Column(name = "login_province", nullable = true)
	private String login_province;

	@Column(name = "login_zip", nullable = true)
	private String login_zip;

	@Column(name = "login_country_code", nullable = true)
	private String login_country_code;

	@Column(name = "login_phone_no", nullable = true)
	private String login_phone_no;
	
	@Column(name = "login_email", nullable = true)
	private String login_email;

	@Column(name = "login_date_format", nullable = true)
	private String login_date_format;

	@Column(name = "login_currency_code", nullable = true)
	private String login_currency_code;

	@Column(name = "login_language", nullable = true)
	private String login_language;

	@Column(name = "login_highest_education", nullable = true)
	private String login_highest_education;

	@Column(name = "login_industry", nullable = true)
	private String login_industry;

	@Column(name = "login_job_role", nullable = true)
	private String login_job_role;

	@Column(name = "login_company_name", nullable = true)
	private String login_company_name;

	@Column(name = "login_enable_mail_communication", nullable = true)
	private String login_enable_mail_communication;

	@Column(name = "login_horoscope_sign", nullable = true)
	private String login_horoscope_sign;

	@Column(name = "login_secretcode", nullable = true)
	private String login_secretcode;
	
	@Column(name = "login_isactive", nullable = true)
	private String login_isactive;
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public int getLogin_slno() {
		return login_slno;
	}

	public void setLogin_slno(int login_slno) {
		this.login_slno = login_slno;
	}

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	public String getLogin_password() {
		return login_password;
	}

	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}

	public String getLogin_aliasname() {
		return login_aliasname;
	}

	public void setLogin_aliasname(String login_aliasname) {
		this.login_aliasname = login_aliasname;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	public String getLogin_secretquestion() {
		return login_secretquestion;
	}

	public void setLogin_secretquestion(String login_secretquestion) {
		this.login_secretquestion = login_secretquestion;
	}

	public String getLogin_secretanswer() {
		return login_secretanswer;
	}

	public void setLogin_secretanswer(String login_secretanswer) {
		this.login_secretanswer = login_secretanswer;
	}

	public String getLogin_dob() {
		return login_dob;
	}

	public void setLogin_dob(String login_dob) {
		this.login_dob = login_dob;
	}

	public String getLogin_doj() {
		return login_doj;
	}

	public void setLogin_doj(String login_doj) {
		this.login_doj = login_doj;
	}

	public String getLogin_address() {
		return login_address;
	}

	public void setLogin_address(String login_address) {
		this.login_address = login_address;
	}

	public String getLogin_city() {
		return login_city;
	}

	public void setLogin_city(String login_city) {
		this.login_city = login_city;
	}

	public String getLogin_province() {
		return login_province;
	}

	public void setLogin_province(String login_province) {
		this.login_province = login_province;
	}

	public String getLogin_zip() {
		return login_zip;
	}

	public void setLogin_zip(String login_zip) {
		this.login_zip = login_zip;
	}

	public String getLogin_country_code() {
		return login_country_code;
	}

	public void setLogin_country_code(String login_country_code) {
		this.login_country_code = login_country_code;
	}

	public String getLogin_phone_no() {
		return login_phone_no;
	}

	public void setLogin_phone_no(String login_phone_no) {
		this.login_phone_no = login_phone_no;
	}

	public String getLogin_email() {
		return login_email;
	}

	public void setLogin_email(String login_email) {
		this.login_email = login_email;
	}

	public String getLogin_date_format() {
		return login_date_format;
	}

	public void setLogin_date_format(String login_date_format) {
		this.login_date_format = login_date_format;
	}

	public String getLogin_currency_code() {
		return login_currency_code;
	}

	public void setLogin_currency_code(String login_currency_code) {
		this.login_currency_code = login_currency_code;
	}

	public String getLogin_language() {
		return login_language;
	}

	public void setLogin_language(String login_language) {
		this.login_language = login_language;
	}

	public String getLogin_highest_education() {
		return login_highest_education;
	}

	public void setLogin_highest_education(String login_highest_education) {
		this.login_highest_education = login_highest_education;
	}

	public String getLogin_industry() {
		return login_industry;
	}

	public void setLogin_industry(String login_industry) {
		this.login_industry = login_industry;
	}

	public String getLogin_job_role() {
		return login_job_role;
	}

	public void setLogin_job_role(String login_job_role) {
		this.login_job_role = login_job_role;
	}

	public String getLogin_company_name() {
		return login_company_name;
	}

	public void setLogin_company_name(String login_company_name) {
		this.login_company_name = login_company_name;
	}

	public String getLogin_enable_mail_communication() {
		return login_enable_mail_communication;
	}

	public void setLogin_enable_mail_communication(
			String login_enable_mail_communication) {
		this.login_enable_mail_communication = login_enable_mail_communication;
	}

	public String getLogin_horoscope_sign() {
		return login_horoscope_sign;
	}

	public void setLogin_horoscope_sign(String login_horoscope_sign) {
		this.login_horoscope_sign = login_horoscope_sign;
	}

	public String getLogin_secretcode() {
		return login_secretcode;
	}

	public void setLogin_secretcode(String login_secretcode) {
		this.login_secretcode = login_secretcode;
	}

	public String getLogin_isactive() {
		return login_isactive;
	}

	public void setLogin_isactive(String login_isactive) {
		this.login_isactive = login_isactive;
	}
}
