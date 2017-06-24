package SideInMenuBarTests;

import PageObjectModel.*;
import WebDriver.driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import LoginAndRegistration.existingUserLogin;
/**
 * Created by naman on 22/6/17.
 */
public class sideMenuTabsExpansionTests {
    @BeforeClass
    public static void startDriver()
    {
        try
        {
            driver.initalizeDriver();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        existingUserLogin.login();
    }


    @Test
    public void isSafetyToolsExpandable(){
        sideInMenuBarElements.safetyToolsTab().click();

        WebElement personalSecurityStrategiesTab = safetyToolsElements.personalSecurityStrategiesTab();
        WebElement radarTab = safetyToolsElements.radarTab();
        WebElement copingwithUnwantedAttentionTab = safetyToolsElements.copingwithUnwantedAttentionTab();
        WebElement commonalitiesofSexualPredatorsTab = safetyToolsElements.commonalitiesofSexualPredatorsTab();
        WebElement bystanderInterventionTab = safetyToolsElements.bystanderInterventionTab();
        WebElement safetyPlanBasicsTab = safetyToolsElements.safetyPlanBasicsTab();

        Assert.assertEquals(personalSecurityStrategiesTab.isDisplayed() && radarTab.isDisplayed() && copingwithUnwantedAttentionTab.isDisplayed() && commonalitiesofSexualPredatorsTab.isDisplayed() && bystanderInterventionTab.isDisplayed() && safetyPlanBasicsTab.isDisplayed(), true, "Safety Tools Menus are not visible");
    }

    @Test
    public void isSupportServicesExpandable(){
        sideInMenuBarElements.supportServicesTab().click();

        WebElement benefitsofSeekingStaffSupportTab = supportServicesElements.confidentialityTab();
        WebElement availableServicesAfterASexualAssaultTab = supportServicesElements.whatToDoAfterAnAssaultTab();
        WebElement commitmentToVictimsOfSexualAssaultTab = supportServicesElements.commitmentToVictimsOfSexualAssaultTab();
        WebElement whatToDoAfterAnAssaultTab = supportServicesElements.availableServicesAfterASexualAssaultTab();
        WebElement confidentialityTab = supportServicesElements.benefitsofSeekingStaffSupportTab();
        WebElement peaceCorpsMythbustersTab = supportServicesElements.peaceCorpsMythbustersTab();

        Assert.assertEquals(confidentialityTab.isDisplayed() && whatToDoAfterAnAssaultTab.isDisplayed() && commitmentToVictimsOfSexualAssaultTab.isDisplayed() && availableServicesAfterASexualAssaultTab.isDisplayed() && benefitsofSeekingStaffSupportTab.isDisplayed() && peaceCorpsMythbustersTab.isDisplayed(), true, "Support Services are not visible");
    }

    @Test
    public void isSexualAssaultAwarenessExpandable(){
        sideInMenuBarElements.sexualAssaultAwarenesstTab().click();

        WebElement wasItSexualAssaultTab = sexualAssaultAwarenessElements.wasItSexualAssaultTab();
        WebElement sexualAssaultCommonQuestionsTab = sexualAssaultAwarenessElements.sexualAssaultCommonQuestionsTab();
        WebElement impactOfSexualAssaultTab = sexualAssaultAwarenessElements.impactOfSexualAssaultTab();
        WebElement sexualHarrasmentTab = sexualAssaultAwarenessElements.sexualHarassmentTab();
        WebElement helpingAFriendOrCommunityMemberTab = sexualAssaultAwarenessElements.helpingAFriendOrCommunityMemberTab();

        Assert.assertEquals(helpingAFriendOrCommunityMemberTab.isDisplayed() && sexualHarrasmentTab.isDisplayed() && impactOfSexualAssaultTab.isDisplayed() && sexualAssaultCommonQuestionsTab.isDisplayed() && wasItSexualAssaultTab.isDisplayed(), true, "Sexual Assault Services submenus are not visible");
    }

    @Test
    public void isPoliciesAndGlossaryExpandable(){
        sideInMenuBarElements.policiesAndGlossaryTab().click();

        WebElement policySummarySheetTab = policiesAndGlossaryElements.policySummarySheetTab();
        WebElement glossaryTab = policiesAndGlossaryElements.glossaryTab();
        WebElement furtherResourcesTab = policiesAndGlossaryElements.furtherResourcesTab();

        Assert.assertEquals(policySummarySheetTab.isDisplayed() && glossaryTab.isDisplayed() && furtherResourcesTab.isDisplayed(), true, "Policies and Glossary submenus are not visible!");
    }



    @AfterClass
    public static void tearDown()
    {
        try
        {
            driver.closeDriver();
        }
        catch( Exception e)
        {
            e.printStackTrace();
        }
    }
}
