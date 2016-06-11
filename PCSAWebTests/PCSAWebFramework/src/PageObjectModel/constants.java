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
	
	//Login page
	public static By EmailId = By.xpath(".//*[@id='email']");
	public static By password = By.xpath(".//*[@id='password']");
	public static By signInButton = By.xpath(".//*[@id='submit']");
	public static By recommendedPagesTitle = By.xpath("html/body/center/div/div/h1");
	public static String loginSheet="Sheet2";
	
	//Welcome Page
	public static By welcomeTtile = By.xpath("html/body/center/div/div/h1");
	
	//Registration page
	public static By gotoCreateAccountButton = By.xpath("html/body/form/center/div[3]/a");
	public static By username = By.xpath(".//*[@id='uname']");
	public static By psswrd = By.xpath(".//*[@id='password']");
	public static By hostCountry = By.xpath(".//*[@id='host_country']");
	public static By emailId = By.xpath(".//*[@id='email']");
	public static By createAccount = By.xpath("html/body/form/center/div[3]/input");
	
	//Recommended Pages
	public static By safetyStrategyButton = By.xpath(".//*[@id='bt-safetystg']");
	public static By helpButton = By.xpath(".//*[@id='bt-helping']");
	public static By thingsToKnowButton = By.xpath(".//*[@id='bt-ghana']");
	public static By setPreferences = By.xpath(".//*[@id='bt-peerst']");
}
