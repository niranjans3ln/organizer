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
	
	@Column(name = "login_name", nullable = false)
	private String login_name;
	
	@Column(name = "login_secretquestion", nullable = false)
	private String login_secretquestion;
	
	@Column(name = "login_secretanswer", nullable = false)
	private String login_secretanswer;
	
	@Column(name = "login_doj", nullable = true)
	private String login_doj;
	
	@Column(name = "login_dob", nullable = true)
	private String login_dob;
	
	@Column(name = "login_address", nullable = true)
	private String login_address;
	
	@Column(name = "login_email", nullable = true)
	private String login_email;
	
	@Column(name = "login_isactive", nullable = true)
	private String login_isactive;
	
	@Column(name = "login_secretcode", nullable = true)
	private String login_secretcode;
	
	@Column(name = "login_aliasname", nullable = true)
	private String login_aliasname;

	public String getLogin_dob() {
		return login_dob;
	}

	public void setLogin_dob(String login_dob) {
		this.login_dob = login_dob;
	}

	public String getLogin_address() {
		return login_address;
	}

	public void setLogin_address(String login_address) {
		this.login_address = login_address;
	}

	public String getLogin_email() {
		return login_email;
	}

	public void setLogin_email(String login_email) {
		this.login_email = login_email;
	}

	public String getLogin_isactive() {
		return login_isactive;
	}

	public void setLogin_isactive(String login_isactive) {
		this.login_isactive = login_isactive;
	}

	public String getLogin_secretcode() {
		return login_secretcode;
	}

	public void setLogin_secretcode(String login_secretcode) {
		this.login_secretcode = login_secretcode;
	}

	public String getLogin_aliasname() {
		return login_aliasname;
	}

	public void setLogin_aliasname(String login_aliasname) {
		this.login_aliasname = login_aliasname;
	}

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

	public String getLogin_doj() {
		return login_doj;
	}

	public void setLogin_doj(String login_doj) {
		this.login_doj = login_doj;
	}

}
