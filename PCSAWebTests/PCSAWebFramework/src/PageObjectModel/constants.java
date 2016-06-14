/*
 * @author Anjali
 * @since 2016-06-08
 * This class maintains constants like URL and WebElements.
 */
package PageObjectModel;
import org.openqa.selenium.By;

public class constants 
{
	public static String baseURL = "localhost:8080/PCSA-web/";
	
	//Existing User credentials for carrying out tests which requires login
	public static String existingEmailId = "test@gmail.com";
	public static String existingPassword = "test";
	
	//Login page
	public static By signInEmailId = By.xpath(".//*[@id='email']");
	public static By signInPassword = By.xpath(".//*[@id='password']");
	public static By signInButton = By.xpath(".//*[@id='submit']");
	public static By recommendedPagesTitle = By.xpath("html/body/center/div/div/h1");
	public static By pageLoginTitle = By.xpath("html/body/form/center/div[1]/h1");
	public static String loginTitle = "First Aide";
	public static String loginSheet="Sheet2";
	
	//Logout
	public static By logoutButton = By.xpath(".//*[@id='accordian']/ul/li[6]/h3[3]/a");
	
	//Welcome Page
	public static By welcomeTtile = By.xpath("html/body/center/div/div/h1");
	public static String pageTitleWelcome = "Welcome to First Aide";
	
	//Registration page
	public static By gotoCreateAccountButton = By.xpath("html/body/form/center/div[3]/a");
	public static By username = By.xpath(".//*[@id='uname']");
	public static By signUpPassword = By.xpath(".//*[@id='password']");
	public static By hostCountry = By.xpath(".//*[@id='host_country']");
	public static By signUpEmailId = By.xpath(".//*[@id='email']");
	public static By createAccount = By.xpath("html/body/form/center/div[3]/input");
	public static String registrationSheet = "Sheet3";
	
	//Recommended Pages
	public static By safetyStrategyButton = By.xpath(".//*[@id='bt-safetystg']");
	public static By helpButton = By.xpath(".//*[@id='bt-helping']");
	public static By thingsToKnowButton = By.xpath(".//*[@id='bt-ghana']");
	public static By setPreferences = By.xpath(".//*[@id='bt-peerst']");
	
	//Side In Menu Bar

	
}
