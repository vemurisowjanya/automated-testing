package PageElements;
import org.openqa.selenium.By;

/*
* @author Anjali
*/

public class PageObjRef
{
	
	public static String baseURL="http://127.0.0.1:8000/";

	//HomePage Elements
	public static By CommunityTab = By.xpath("html/body/div[1]/div/div[2]/ul[1]/li[2]/a");
	public static By ChooseCommunity = By.xpath("html/body/div[1]/div/div[2]/ul[1]/li[2]/ul/li[2]/a");
    public static By ReadMore1 = By.xpath("html/body/div[2]/div[2]/div[1]/a");
    public static By ReadMore2 = By.xpath("html/body/div[2]/div[4]/div[1]/a");
    public static By ReadMore3 = By.xpath("html/body/div[2]/div[3]/div[2]/a");
    public static By ReadMore4 = By.xpath("html/body/div[2]/div[5]/div[2]/a");
    public static By SignUp = By.xpath("html/body/div[1]/div/div[2]/ul[2]/li[1]/a");
    public static By JoinSysters= By.xpath("html/body/div[2]/div[1]/p[2]/a");
    public static By AboutUs= By.xpath("html/body/div[1]/div/div[2]/ul[1]/li[1]/a");
    public static By Wiki= By.xpath("html/body/div[1]/div/div[2]/ul[1]/li[3]/a"); 
    public static By Contact= By.xpath("html/body/div[1]/div/div[2]/ul[1]/li[4]/a");
    
    //Community Proposal Form
    public static By FormTitle = By.xpath("html/body/div[1]/div/div[2]/div/h1");
    
    //Login Page
    public static By Login= By.xpath("html/body/div[1]/div/div[2]/ul[2]/li[2]/a");
    public static By AtLoginPage= By.xpath("html/body/div[2]/div[1]/form/h2");
    public static By username=By.id("id_login");
    public static By password=By.id("id_password");
    public static By SignIn=By.xpath("//button[@type='submit']");
    public static By Google=By.xpath("html/body/div[2]/div[1]/div/a[4]");
    public static By Facebook=By.xpath("html/body/div[2]/div[1]/div/a[3]");
    public static By Github=By.xpath("html/body/div[2]/div[1]/div/a[2]");
    public static By Twitter=By.xpath("html/body/div[2]/div[1]/div/a[1]");
  
    
    
    //User/Admin Profile Page
    public static By Edit= By.xpath("html/body/div[3]/div[2]/div[2]/div/div[2]/div[1]/a");
    public static By Lastname= By.id("id_last_name");
    public static By Submit=By.id("submit-id-save");
    public static By UpdatedName=By.xpath("html/body/div[1]/div/div[2]/ul[2]/li/a");
    public static By Logout= By.xpath("html/body/div[1]/div/div[2]/ul[2]/li/ul/li[3]/a");
    //SignUp Page
    public static By SignUpUsername= By.xpath(".//*[@id='id_username']");
    public static By SignUpEmail= By.xpath(".//*[@id='id_email']");
    public static By SignUpPassword= By.xpath(".//*[@id='id_password1']");
    public static By SignUpConfirmPassword= By.xpath(".//*[@id='id_password2']");
    public static By SignUpSubmit= By.xpath(".//*[@id='signup_form']/button");
    public static By checkSignUp = By.xpath("html/body/div[1]/div/div[2]/ul[2]/li/ul/li[3]/a");
}
