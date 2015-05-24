package Helper;

// contains the page objects to be referred by the various tests

import org.openqa.selenium.By;

public class PageObjectRef {

	//Home page page objects to various functionalities
	protected By SystersLink = By.linkText("Systers");
	protected By AboutLink = By.linkText("About Us");
	protected By WikiLink = By.linkText("Wiki");
	protected By ContactsLink = By.linkText("Contact");
	protected By SignupLink = By.linkText("Sign up");
	protected By LoginLink = By.linkText("Login");
	protected By CommunitiesLink = By.linkText("Communities");
	
	//Homepage elements
	By JoinSysters = By.linkText("Join Systers");
	By Readmore1 = By.xpath("(//button[@type='button'])[2]");
	By Readmore2 = By.xpath("(//button[@type='button'])[3]");
	By Readmore3 = By.xpath("(//button[@type='button'])[4]");
	By Readmore4 = By.xpath("(//button[@type='button'])[5]");
	
	//Login page page objects 
	protected By FacebookLink = By.linkText("Facebook"); //By.xpath("(//button[@type='submit'])[2]")
	protected By TwitterLink = By.linkText("Twitter");
	protected By GoogleLink = By.linkText("Google");
	protected By GithubLink = By.linkText("GitHub");
	protected By login_id = By.id("id_login");
	protected By login_pass = By.id("id_password");
	protected By signInbutton = By.xpath("//button[@type='submit']");
	By Rememberme = By.id("id_remember");
	By ForgotPass = By.linkText("Forgot Password?");
	
	//Profile page objects
	By Profile = By.linkText("Profile");
	By changePass = By.linkText("Change password");
	protected By Logout = By.linkText("Logout");
	protected By Signout = By.cssSelector("button.btn.btn-primary"); //By.cssSelector("button[type=\"submit\"]");
	
	//Signup page page objects
	By Username = By.id("id_username");
	By Email = By.id("id_email");
	By Password1 = By.id("id_password1");
	By Password2 = By.id("id_password2");
	By SignupButton = By.cssSelector("button[type=\"submit\"]");
	
	//Communities dropdown page objects
	 By Action = By.linkText("Action");
	 By Anotheraction = By.linkText("Another action");
	 By SomethingElse = By.linkText("Something else here");
	 By SepratedLink = By.linkText("Separated link");
	 By Onemoresepratedlink = By.linkText("One more separated link");
	 protected By CommunityProp = By.linkText("New community proposal");
	 
	 //admin page objects
	 protected By account = By.linkText("Account");
	 protected By logout = By.linkText("Log out");
	 protected By auth = By.linkText("Auth");
	 protected By cms = By.linkText("Cms");
	 protected By comments = By.linkText("Comments");
	 protected By dashboard = By.linkText("Dashboard");
	 protected By sites = By.linkText("Sites");
	 protected By socialaccount = By.linkText("Socialaccount");
	 protected By ChangePass = By.linkText("Change password");
	 protected By oldPassword = By.id("id_old_password");
	 protected By newPassword1 = By.id("id_new_password1");
	 protected By newPassword2 = By.id("id_new_password2");
	 protected By changeButton = By.cssSelector("input.default");
	 
}
