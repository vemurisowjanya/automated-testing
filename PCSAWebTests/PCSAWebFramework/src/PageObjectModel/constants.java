/*
 * @author Anjali
 * @since 2016-06-08
 * This class maintains constants like URL and WebElements.
 */
package PageObjectModel;
import org.openqa.selenium.By;

public class constants 
{
	public static String baseURL = "http://localhost:8080/PCSA-web/";
	
	/*
	 * Existing User credentials for carrying out tests which requires login
	 */
	public static String existingEmailId = "test@gmail.com";
	public static String existingPassword = "test";
	
	/*
	 * Login page
	 */
	public static By signInEmailId = By.xpath(".//*[@id='email']");
	public static By signInPassword = By.xpath(".//*[@id='password']");
	public static By signInButton = By.xpath(".//*[@id='submit']");
	public static By recommendedPagesTitle = By.xpath("html/body/center/div/div/h1");
	public static By pageLoginTitle = By.xpath("html/body/form/center/div[1]/h1");
	public static String loginTitle = "First Aide";
	public static String loginSheet="Sheet2";
	
	/*
	 * Logout
	 */
	public static By logoutButton = By.xpath(".//*[@id='accordian']/ul/li[6]/h3[3]/a");
	
	/*
	 * Welcome Page
	 */
	public static By welcomeTtile = By.xpath("html/body/center/div/div/h1");
	public static String pageTitleWelcome = "Welcome to First Aide";
	
	/*
	 * Registration page
	 */
	public static By gotoCreateAccountButton = By.xpath("html/body/form/center/div[3]/a");
	public static By username = By.xpath(".//*[@id='uname']");
	public static By signUpPassword = By.xpath(".//*[@id='password']");
	public static By hostCountry = By.xpath(".//*[@id='host_country']");
	public static By signUpEmailId = By.xpath(".//*[@id='email']");
	public static By createAccount = By.xpath("html/body/form/center/div[3]/input");
	public static String registrationSheet = "Sheet3";
	
	/*
	 * Recommended Pages
	 */
	public static By safetyStrategyButton = By.xpath(".//*[@id='bt-safetystg']");
	public static By helpButton = By.xpath(".//*[@id='bt-helping']");
	public static By thingsToKnowButton = By.xpath(".//*[@id='bt-ghana']");
	public static By setPreferences = By.xpath(".//*[@id='bt-peerstng']");
	
	/*
	 * Side In Menu Bar
	 */
	public static By firstAideTab= By.xpath(".//*[@id='accordian']/ul/li[1]/h2/a");
	public static By getHelpNowTab = By.xpath(".//*[@id='accordian']/ul/li[1]/h3[1]/a");
	public static By circleOfTrustTab = By.xpath(".//*[@id='accordian']/ul/li[1]/h3[2]/a");
	public static By safetyToolsTab = By.xpath(".//*[@id='accordian']/ul/li[2]/h3");
	public static By supportServicesTab = By.xpath(".//*[@id='accordian']/ul/li[3]/h3");
	public static By sexualAssaultAwarenesstTab = By.xpath(".//*[@id='accordian']/ul/li[4]/h3");
	public static By policiesAndGlossaryTab = By.xpath(".//*[@id='accordian']/ul/li[5]/h3");
	public static By settingsTab = By.xpath(".//*[@id='accordian']/ul/li[6]/h3[1]/a");
	public static By loggedInAsTab = By.xpath(".//*[@id='accordian']/ul/li[6]/h3[2]/a");
	
	/*
	 * Safety Tools
	 */
	public static By safetyToolsMainTab = By.xpath(".//*[@id='accordian']/ul/li[2]/ul/li[1]/a");
	public static By personalSecurityStrategiesButton = By.xpath(".//*[@id='bt-personalstrategies']");
	public static By radarButton = By.xpath(".//*[@id='bt-radar']");
	public static By copingwithUnwantedAttentionButton = By.xpath(".//*[@id='bt-coping']");
	public static By commonalitiesofSexualPredatorsButton = By.xpath(".//*[@id='bt-commonalities']");
	public static By bystanderInterventionButton = By.xpath(".//*[@id='bt-bystander']");
	public static By safetyPlanBasicsButton = By.xpath(".//*[@id='bt-safetyBasic']");
	public static By safetyPlanWorksheetButton = By.xpath(".//*[@id='bt-safetyWorksheet']");
	
	public static By safetyToolsPageTitle = By.xpath("html/body/center/div/div[1]/h1");
	public static By personalSecurityStrategiesTitle = By.xpath("html/body/center/div/div[1]/h1");
	public static By radarTitle = By.xpath("html/body/center/div/div[1]/h1");
	public static By copingwithUnwantedAttentionTitle = By.xpath("html/body/center/div/div/h1");
	public static By commonalitiesofSexualPredatorsTitle = By.xpath("html/body/center/div/div[1]/h1");
	public static By bystanderInterventionTitle = By.xpath("html/body/center/div/div[1]/h1");
	public static By safetyPlanBasicsTitle = By.xpath("html/body/center/div/div[1]/h1");
	public static By safetyPlanWorksheetTitle = By.xpath("html/body/center/div/div[1]/h1");
	
	public static By toSafetyToolsPage2 = By.xpath(".//*[@id='fw-arrow']/a");
	public static By toSafetyToolsPage1fromPage2 = By.xpath(".//*[@id='bw-arrow']/a");
	
	public static By personalSecurityStrategiesTab = By.xpath(".//*[@id='accordian']/ul/li[2]/ul/li[2]/a");
	public static By radarTab = By.xpath(".//*[@id='accordian']/ul/li[2]/ul/li[3]/a");
	public static By copingwithUnwantedAttentionTab = By.xpath(".//*[@id='accordian']/ul/li[2]/ul/li[4]/a");
	public static By commonalitiesofSexualPredatorsTab = By.xpath(".//*[@id='accordian']/ul/li[2]/ul/li[5]/a");
	public static By bystanderInterventionTab = By.xpath(".//*[@id='accordian']/ul/li[2]/ul/li[6]/a");
	public static By safetyPlanBasicsTab = By.xpath(".//*[@id='accordian']/ul/li[2]/ul/li[7]/a");
	public static By safetyPlanWorksheetTab = By.xpath(".//*[@id='accordian']/ul/li[2]/ul/li[8]/a");
	
	/*
	 * Support services
	 */
	public static By supportServicesMainTab = By.xpath(".//*[@id='accordian']/ul/li[3]/ul/li[1]/a");
	public static By benefitsofSeekingStaffSupportTab = By.xpath(".//*[@id='accordian']/ul/li[3]/ul/li[2]/a");
	public static By availableServicesAfterASexualAssaultTab = By.xpath(".//*[@id='accordian']/ul/li[3]/ul/li[3]/a");
	public static By commitmentToVictimsOfSexualAssaultTab = By.xpath(".//*[@id='accordian']/ul/li[3]/ul/li[4]/a");
	public static By whatToDoAfterAnAssaultTab = By.xpath(".//*[@id='accordian']/ul/li[3]/ul/li[5]/a");
	public static By mythbustersAssumptionsandFactsTab = By.xpath(".//*[@id='accordian']/ul/li[3]/ul/li[6]/a");
	
	/*
	 * Sexual Assault Awareness
	 */
	public static By sexualAssaultMainTab = By.xpath(".//*[@id='accordian']/ul/li[4]/ul/li[1]/a");
	public static By wasItSexualAssaultTab = By.xpath(".//*[@id='accordian']/ul/li[4]/ul/li[2]/a");
	public static By sexualAssaultCommonQuestionsTab = By.xpath(".//*[@id='accordian']/ul/li[4]/ul/li[3]/a");
	public static By impactOfSexualAssaultTab = By.xpath(".//*[@id='accordian']/ul/li[4]/ul/li[4]/a");
	public static By sexualHarrasmentTab = By.xpath(".//*[@id='accordian']/ul/li[4]/ul/li[5]/a");
	public static By HelpingAFriendOrCommunityMemberTab = By.xpath(".//*[@id='accordian']/ul/li[4]/ul/li[6]/a");
	
	/*
	 * Policies and Glossary
	 */
	public static By policySummarySheetTab = By.xpath(".//*[@id='accordian']/ul/li[5]/ul/li[1]/a");
	public static By glossaryTab = By.xpath(".//*[@id='accordian']/ul/li[5]/ul/li[2]/a");
	public static By furtherResourcesTab = By.xpath(".//*[@id='accordian']/ul/li[5]/ul/li[3]/a");
	
	/*
	 * Get Help Now
	 */
	public static By gethelpPageTitle = By.xpath("html/body/center/div/div[1]/h1");
	public static String getHelpTitle = "Get Help Now";
	public static By contactPCMO = By.xpath(".//*[@id='bt-PCMO']");
	public static By contactSSM = By.xpath(".//*[@id='bt-SSM']");
	public static By contactSARL = By.xpath(".//*[@id='bt-SARL']");
	public static By toGetHelpPage2 = By.xpath(".//*[@id='tr-2']/td[2]/a");
	public static By pcSavesAnonymousHelpline = By.xpath(".//*[@id='bt-PCSaves']");
	public static By officeOfVictimAdvocacy = By.xpath(".//*[@id='bt-offVA']");
	public static By officeOfInspectorGeneral = By.xpath(".//*[@id='bt-offIG']");
	public static By officeOfCivilRightsAndDiversity = By.xpath(".//*[@id='bt-offCRD']");
	public static By toGetHelpPage1fromPage2 = By.xpath(".//*[@id='bw-arrow']/a");
	public static By changeLocationDropdown = By.xpath(".//*[@id='location']");
	public static By chooseLocationText = By.xpath(".//*[@id='loc']");
	public static By pcmoCallButton = By.xpath(".//*[@id='PCMO-call']");
	public static By pcmoSMSButton = By.xpath(".//*[@id='PCMO-msg']");
	public static By ssmCallButton = By.xpath(".//*[@id='SSM-call']");
	public static By ssmSMSButton = By.xpath(".//*[@id='SSM-msg']");
	public static By sarlCallButton = By.xpath(".//*[@id='SARL-call']");
	public static By sarlSMSButton = By.xpath(".//*[@id='SARL-msg']");
	public static By makeCallButton = By.xpath(".//*[@id='submit']");
	public static By smsBodyTextBox = By.xpath(".//*[@id='SMS-body']");
	public static By sendSMSButton = By.xpath(".//*[@id='bt-SMS']");
	public static By contactNowButtonPCSavesAnonymousHelpline = By.xpath(".//*[@id='bt-cntPC']");
	public static By contactNowButtonOfficeOfVictimAdvocacy = By.xpath(".//*[@id='bt-cntnw']");
	public static By contactNowButtonOfficeOfInspectorGeneral = By.xpath(".//*[@id='bt-cntnw']");
	public static By contactNowButtonoOfficeOfCivilRightsAndDiversity = By.xpath(".//*[@id='bt-cntnw']");
	public static By sendMessageButton = By.xpath(".//*[@id='msg']");
	public static By voiceCallButton = By.xpath(".//*[@id='call']");
	public static By pcSavesLearnMoreLink = By.xpath("html/body/center/div/div[3]/a");
	public static By officeOfVictimAdvocacyEmailLink = By.xpath("html/body/center/div/div[3]/a");
	public static By officeOfInspectorGeneralLearnMoreLink = By.xpath("html/body/center/div/div[3]/a");
	public static By officeOfCivilRightsAndDiversityEmailLink = By.xpath("html/body/center/div/div[3]/a");
	
	/*
	 * Circle of Trust
	 */
	public static By circleOfTrustTitle = By.xpath("html/body/center/div/div[1]/h1");
	public static By circleOfTrustEditButton = By.xpath(".//*[@id='ic-edit']");
	public static By circleOfTrusHelpMeButton = By.xpath(".//*[@id='help_me']");
	
	//Button for the message "Come Get me"
	public static By msg1_Button = By.xpath(".//*[@id='msg']");
	
	//Button for the message "Call I need an interruption"
	public static By msg2_Button = By.xpath(".//*[@id='msg2']");
	
	//Button for the message "I need to talk"
	public static By msg3_Button = By.xpath(".//*[@id='msg3']");
	
	public static By comrade1_TextBox = By.xpath(".//*[@id='comrade1']");
	public static By comrade2_TextBox = By.xpath(".//*[@id='comrade2']");
	public static By comrade3_TextBox = By.xpath(".//*[@id='comrade3']");
	public static By comrade4_TextBox = By.xpath(".//*[@id='comrade4']");
	public static By comrade5_TextBox = By.xpath(".//*[@id='comrade5']");
	public static By comrade6_TextBox = By.xpath(".//*[@id='comrade6']");
	public static By circleOfTrusSaveComradeButton = By.xpath("html/body/form/center/div/input");
	
	
	/*
	 * Sweet Alert Components
	 */
	public static By alertHeading = By.xpath("html/body/div[3]/h2");
	public static By alertText = By.xpath("html/body/div[3]/p");
	public static By alertButton = By.cssSelector("button.confirm");
}
