/**
 * 
 */
package ushahidi.testcases.reports;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ushahidi.commons.ApplicationConstants;
import ushahidi.commons.Driver;
import ushahidi.commons.ReportsPageConstants;
import ushahidi.pages.homepage.FootBarPageReference;
import ushahidi.pages.loginpage.LoginPageReference;
import ushahidi.pages.report.ReportPageReference;
import ushahidi.pages.report.SubmittedReportPageReference;

/**
 * @author Kesha
 *
 */
public class ValidateNewReport {

	private WebDriver driver = null;
	private LoginPageReference login_page_ref;
	private FootBarPageReference footbar_page_ref;
	private ReportPageReference report_page_ref;
	private SubmittedReportPageReference submitReport_page_ref;
	
	private void loginWith(String username, String password)
			throws InterruptedException {
		// Enter user email id
		WebElement login_text = driver.findElements(login_page_ref.getLogin_text_class()).get(0);
		WebElement uname = login_text.findElement(login_page_ref.getUsername_id());
		uname.sendKeys(username);

		// Enter user password
		login_text = driver.findElements(login_page_ref.getLogin_text_class()).get(1);
		WebElement pswd = login_text.findElement(login_page_ref.getPassword_id());
		pswd.sendKeys(password);

		// Press Enter
		WebElement login = driver.findElement(login_page_ref.getSubmit_id());
		login.submit();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	private void submitReportWith(String title, String description, HashSet<String> categories,
					String PCVName,	String organization, String contact, String projects,
					String workEnvironment,	String directorInfo, String strength, String weakness,
					HashSet<String> years, String startDate, String endDate, String inSearchOf, String firstName,
					String lastName, String email, String locationName, String newsSource, 
					String externalVideo)
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// send title of report
		WebElement title_element = driver.findElement(report_page_ref.getReportTitle());
		title_element.sendKeys(title);
		
		WebElement description_element = driver.findElement(report_page_ref.getDescription());
		description_element.sendKeys(description);
		
		if(categories.contains("TEFL"))
		{
			WebElement tefl_element = driver.findElement(report_page_ref.getTEFL());
			tefl_element.click();
		}
		if(categories.contains("C.E.D"))
		{
			WebElement ced_element = driver.findElement(report_page_ref.getCED());
			ced_element.click();
		}
		if(categories.contains("Y.D."))
		{
			WebElement yd_element = driver.findElement(report_page_ref.getYD());
			yd_element.click();
		}
		if(categories.contains("PCV Secondary Projects"))
		{
			WebElement pcv_element = driver.findElement(report_page_ref.getPCV_SecondaryProject());
			pcv_element.click();
		}
		if(categories.contains("(Un)Friendly Places"))
		{
			WebElement unfriendlyplaces_element = driver.findElement(report_page_ref.getUnfriendlyPlaces());
			unfriendlyplaces_element.click();
		}
		if(categories.contains("Language Tutors & Other Contacts"))
		{
			WebElement lang_element = driver.findElement(report_page_ref.getLanguage());
			lang_element.click();
		}
		if(categories.contains("Transportation"))
		{
			WebElement transportation_element = driver.findElement(report_page_ref.getTransportation());
			transportation_element.click();
		}
		
		WebElement pcvName_element = driver.findElement(report_page_ref.getpCVName());
		pcvName_element.sendKeys(PCVName);
		
		WebElement organization_element = driver.findElement(report_page_ref.getOrganization());
		organization_element.sendKeys(organization);
		
		WebElement counterpart_element = driver.findElement(report_page_ref.getCounterPart());
		counterpart_element.sendKeys(contact);
		
		WebElement projects_element = driver.findElement(report_page_ref.getProjects());
		projects_element.sendKeys(projects);
		
		WebElement workenv_element = driver.findElement(report_page_ref.getWorkEnvironment());
		workenv_element.sendKeys(workEnvironment);
		
		WebElement directorInfo_element = driver.findElement(report_page_ref.getDirectorInfo());
		directorInfo_element.sendKeys(directorInfo);
		
		WebElement strength_element = driver.findElement(report_page_ref.getStrength());
		strength_element.sendKeys(strength);
		
		WebElement weakness_element = driver.findElement(report_page_ref.getWeakness());
		weakness_element.sendKeys(weakness);
		
		if(years.contains("AZ1"))
		{
			WebElement year_element = driver.findElement(report_page_ref.getAz1());
			year_element.click();
		}
		
		if(years.contains("AZ2"))
		{
			WebElement year_element = driver.findElement(report_page_ref.getAz2());
			year_element.click();
		}
		
		if(years.contains("AZ3"))
		{
			WebElement year_element = driver.findElement(report_page_ref.getAz3());
			year_element.click();
		}
		
		if(years.contains("AZ4"))
		{
			WebElement year_element = driver.findElement(report_page_ref.getAz4());
			year_element.click();
		}
		
		if(years.contains("AZ5"))
		{
			WebElement year_element = driver.findElement(report_page_ref.getAz5());
			year_element.click();
		}
		
		if(years.contains("AZ6"))
		{
			WebElement year_element = driver.findElement(report_page_ref.getAz6());
			year_element.click();
		}
		
		if(years.contains("AZ7"))
		{
			WebElement year_element = driver.findElement(report_page_ref.getAz7());
			year_element.click();
		}
		
		if(years.contains("AZ8"))
		{
			WebElement year_element = driver.findElement(report_page_ref.getAz8());
			year_element.click();
		}
		
		if(years.contains("AZ9"))
		{
			WebElement year_element = driver.findElement(report_page_ref.getAz9());
			year_element.click();
		}
		
		if(years.contains("AZ10"))
		{
			WebElement year_element = driver.findElement(report_page_ref.getAz10());
			year_element.click();
		}
		
		if(years.contains("AZ11"))
		{
			WebElement year_element = driver.findElement(report_page_ref.getAz11());
			year_element.click();
		}
		
		if(years.contains("AZ12"))
		{
			WebElement year_element = driver.findElement(report_page_ref.getAz12());
			year_element.click();
		}
		
		WebElement startdate_element = driver.findElement(report_page_ref.getStartDate());
		startdate_element.sendKeys(startDate);
		
		WebElement enddate_element = driver.findElement(report_page_ref.getEndDate());
		enddate_element.sendKeys(endDate);
		
		WebElement inSearchOf_element = driver.findElement(report_page_ref.getInSearchOf());
		inSearchOf_element.sendKeys(inSearchOf);
		
		WebElement firstName_element = driver.findElement(report_page_ref.getFirstName());
		firstName_element.sendKeys(firstName);
		
		WebElement lastName_element = driver.findElement(report_page_ref.getLastName());
		lastName_element.sendKeys(lastName);
		
		WebElement email_element = driver.findElement(report_page_ref.getEmail());
		email_element.sendKeys(email);
		
		WebElement location_element = driver.findElement(report_page_ref.getLocation());
		location_element.sendKeys(locationName);
		
		WebElement newsSource_element = driver.findElement(report_page_ref.getNewsSourceLink());
		newsSource_element.sendKeys(newsSource);
		
		WebElement externalVideo_element = driver.findElement(report_page_ref.getExternalVideoLink());
		externalVideo_element.sendKeys(externalVideo);

		// submit
		WebElement submit_element = driver.findElement(report_page_ref.getSubmit());
		submit_element.click();
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		Driver d = new Driver();
		driver = d.getInstance();
		login_page_ref = new LoginPageReference();
		footbar_page_ref = new FootBarPageReference();
		report_page_ref = new ReportPageReference();
		submitReport_page_ref = new SubmittedReportPageReference();
		
		// Getting to the login page URL
		driver.get(ApplicationConstants.baseUrl + ApplicationConstants.extlogin);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 	
		// enter login details
		loginWith("kesha.shah1106@gmail.com", "abc123");
		
		WebElement report = driver.findElement(footbar_page_ref.getSubmitReport());
		report.click();
	}

	@Test
	public void testReportWithAllData_Pass() {
		System.out.println("testReportWithAllData_Pass");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "inSearchOf", "firstName", "lastName", "email@gmail.com", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement thanks = driver.findElement(submitReport_page_ref.getMessage());
		
		System.out.println(thanks.getText());
		
		assertEquals(ReportsPageConstants.successMessage, thanks.getText());
	}
	
	@Test
	public void testReportWithNoTitle_Fail() {
		System.out.println("testReportWithNoTitle_Fail");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("", "description", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "inSearchOf", "firstName", "lastName", "email@gmail.com", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> allErrors = driver.findElements(report_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ReportsPageConstants.reportTitle_req))
			{
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void testReportWithNoDescription() {
		System.out.println("testReportWithNoDescription");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "inSearchOf", "firstName", "lastName", "email@gmail.com", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> allErrors = driver.findElements(report_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ReportsPageConstants.description_req))
			{
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void testReportWithNoCategories_Fail() {
		System.out.println("testReportWithNoCategories_Fail");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {""}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "inSearchOf", "firstName", "lastName", "email@gmail.com", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> allErrors = driver.findElements(report_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ReportsPageConstants.categories_req))
			{
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void testReportWithNopcvName_Fail() {
		System.out.println("testReportWithNopcvName_Fail");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "", "organization", "contact", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "inSearchOf", "firstName", "lastName", "email@gmail.com", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> allErrors = driver.findElements(report_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ReportsPageConstants.pcvName_req))
			{
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void testReportWithNoOrganization_Fail() {
		System.out.println("testReportWithNoOrganization_Fail");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "", "contact", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "inSearchOf", "firstName", "lastName", "email@gmail.com", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> allErrors = driver.findElements(report_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ReportsPageConstants.organization_req))
			{
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void testReportWithNoCounterPartName_Fail() {
		System.out.println("testReportWithNoCounterPartName_Fail");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "organization", "", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "inSearchOf", "firstName", "lastName", "email@gmail.com", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> allErrors = driver.findElements(report_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ReportsPageConstants.counterpartInfo_req))
			{
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void testReportWithNoProjects_Fail() {
		System.out.println("testReportWithNoProjects_Fail");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "organization", "contact", "", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "inSearchOf", "firstName", "lastName", "email@gmail.com", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> allErrors = driver.findElements(report_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ReportsPageConstants.projects_req))
			{
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void testReportWithNoWorkEnvironment_Fail() {
		System.out.println("ReportWithNoTitle");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "organization", "contact", "projects", "", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "inSearchOf", "firstName", "lastName", "email@gmail.com", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> allErrors = driver.findElements(report_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ReportsPageConstants.workEnv_req))
			{
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void testReportWithNoDirectorInfo_Pass() {
		System.out.println("testReportWithNoDirectorInfo_Pass");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "", "strength", "weakness", years, "01/01/2015", "01/01/2016", "inSearchOf", "firstName", "lastName", "email@gmail.com", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement thanks = driver.findElement(submitReport_page_ref.getMessage());
		
		System.out.println(thanks.getText());
		
		assertEquals(ReportsPageConstants.successMessage, thanks.getText());
	}
	
	@Test
	public void testReportWithNoStrengths_Fail() {
		System.out.println("testReportWithNoStrengths_Fail");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "directorInfo", "", "weakness", years, "01/01/2015", "01/01/2016", "inSearchOf", "firstName", "lastName", "email@gmail.com", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> allErrors = driver.findElements(report_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ReportsPageConstants.strengths_req))
			{
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void testReportWithNoWeakness_Fail() {
		System.out.println("testReportWithNoWeakness_Fail");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "directorInfo", "strength", "", years, "01/01/2015", "01/01/2016", "inSearchOf", "firstName", "lastName", "email@gmail.com", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> allErrors = driver.findElements(report_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ReportsPageConstants.weakness_req))
			{
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void testReportWithNoYearsWithPCV_Fail() {
		System.out.println("testReportWithNoYearsWithPCV_Fail");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "inSearchOf", "firstName", "lastName", "email@gmail.com", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> allErrors = driver.findElements(report_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ReportsPageConstants.yearsWithPCV_req))
			{
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void testReportWithNoStartDate_Fail() {
		System.out.println("testReportWithNoStartDate_Fail");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "", "01/01/2016", "inSearchOf", "firstName", "lastName", "email@gmail.com", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> allErrors = driver.findElements(report_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ReportsPageConstants.projectStart_req))
			{
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void testReportWithNoEndDate_Fail() {
		System.out.println("testReportWithNoEndDate_Fail");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("", "description", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "", "inSearchOf", "firstName", "lastName", "email@gmail.com", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> allErrors = driver.findElements(report_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ReportsPageConstants.projectEnd_req))
			{
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void testReportWithNoSearchOf_Pass() {
		System.out.println("testReportWithNoSearchOf_Pass");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "", "firstName", "lastName", "email@gmail.com", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement thanks = driver.findElement(submitReport_page_ref.getMessage());
		
		System.out.println(thanks.getText());
		
		assertEquals(ReportsPageConstants.successMessage, thanks.getText());
	}
	
	@Test
	public void testReportWithNoFirstName_Pass() {
		System.out.println("testReportWithNoFirstName_Pass");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "insearchof", "", "lastName", "email@gmail.com", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement thanks = driver.findElement(submitReport_page_ref.getMessage());
		
		System.out.println(thanks.getText());
		
		assertEquals(ReportsPageConstants.successMessage, thanks.getText());
	}
	
	@Test
	public void testReportWithNoLastName_Pass() {
		System.out.println("testReportWithNoLastName_Pass");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "insearchof", "firstName", "", "email@gmail.com", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement thanks = driver.findElement(submitReport_page_ref.getMessage());
		
		System.out.println(thanks.getText());
		
		assertEquals(ReportsPageConstants.successMessage, thanks.getText());
	}
	
	@Test
	public void testReportWithNoEmail_Pass() {
		System.out.println("testReportWithNoEmail_Pass");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "insearchof", "firstName", "lastName", "", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement thanks = driver.findElement(submitReport_page_ref.getMessage());
		
		System.out.println(thanks.getText());
		
		assertEquals(ReportsPageConstants.successMessage, thanks.getText());
	}
	
	@Test
	public void testReportWithNoLocation_Fail() {
		System.out.println("testReportWithNoLocation_Fail");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("", "description", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "inSearchOf", "firstName", "lastName", "email@gmail.com", "", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> allErrors = driver.findElements(report_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ReportsPageConstants.location_req))
			{
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}
	
	@Test
	public void testReportWithNoNewsSource_Pass() {
		System.out.println("testReportWithNoNewsSource_Pass");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "inSearchOf", "firstName", "lastName", "email@gmail.com", "locationName", "", "https://www.youtube.com/watch?v=e-ORhEE9VVg");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement thanks = driver.findElement(submitReport_page_ref.getMessage());
		
		System.out.println(thanks.getText());
		
		assertEquals(ReportsPageConstants.successMessage, thanks.getText());
	}
	
	@Test
	public void testReportWithNoVideoLink_Pass() {
		System.out.println("testReportWithNoVideoLink_Pass");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "inSearchOf", "firstName", "lastName", "email@gmail.com", "locationName", "https://www.google.com/", "");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement thanks = driver.findElement(submitReport_page_ref.getMessage());
		
		System.out.println(thanks.getText());
		
		assertEquals(ReportsPageConstants.successMessage, thanks.getText());
	}

	@Test
	public void testReportWithInvalidEmail_Fail() {
		System.out.println("testReportWithInvalidEmail_Fail");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "inSearchOf", "firstName", "lastName", "email", "locationName", "https://www.google.com/", "https://www.youtube.com/watch?v=e-ORhEE9VVg");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> allErrors = driver.findElements(report_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ReportsPageConstants.invalid_email))
			{
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}

	@Test
	public void testReportWithInvalidNewsSource_Fail() {
		System.out.println("testReportWithInvalidNewsSource_Fail");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "inSearchOf", "firstName", "lastName", "email@gmail.com", "locationName", "NewsSource", "https://www.youtube.com/watch?v=e-ORhEE9VVg");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> allErrors = driver.findElements(report_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ReportsPageConstants.invalid_newsSource))
			{
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}

	@Test
	public void testReportWithInvalidVideoLink_Fail() {
		System.out.println("testReportWithInvalidVideoLink_Fail");
		
		HashSet<String> categories = new HashSet<String>(Arrays.asList(
			     new String[] {"TEFL","Y.D."}));
		
		HashSet<String> years = new HashSet<String>(Arrays.asList(
			     new String[] {"AZ1","AZ10"}));
		
		submitReportWith("Test Report", "description", categories , "PCVName", "organization", "contact", "projects", "workEnvironment", "directorInfo", "strength", "weakness", years, "01/01/2015", "01/01/2016", "inSearchOf", "firstName", "lastName", "email@gmail.com", "locationName", "https://www.google.com/", "VideoLink");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> allErrors = driver.findElements(report_page_ref.getErrorList()); 

		boolean errorFound = false;
		for (WebElement element: allErrors) {
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(ReportsPageConstants.invalid_videoLink))
			{
				errorFound = true;
				break;
			}
		}
		System.out.println("ErrorFound: "+errorFound);
		Assert.assertEquals(true, errorFound);
	}

	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		// driver.close();
	}

}
