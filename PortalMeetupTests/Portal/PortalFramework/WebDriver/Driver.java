package WebDriver;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
* @author Anjali
*/

public class Driver 
{
	public static WebDriver Instance;
	public static String screenshot="Test";
	public static void Initialize()
	{
		Instance=new FirefoxDriver();
		Instance.manage().window().maximize();
		Instance.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void close() throws IOException 
	{
		File scrshot=((TakesScreenshot)Instance).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrshot, new File("/home/shally/GSOC-2015/Workspace/Local_Workspace/" +
				                            "Portal/Screenshots/"+screenshot+(int)(Math.random()*1000000)/100000+".png"));
		Instance.close();
		
	}
}
