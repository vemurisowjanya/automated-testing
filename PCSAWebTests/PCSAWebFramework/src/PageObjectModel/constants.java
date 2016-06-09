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
	
	//Registration page
	
	//Recommended Pages
	public static By safetyStrategyButton = By.xpath(".//*[@id='bt-safetystg']");
	public static By helpButton = By.xpath(".//*[@id='bt-helping']");
	public static By thingsToKnowButton = By.xpath(".//*[@id='bt-ghana']");
	public static By setPreferences = By.xpath(".//*[@id='bt-peerst']");
}
