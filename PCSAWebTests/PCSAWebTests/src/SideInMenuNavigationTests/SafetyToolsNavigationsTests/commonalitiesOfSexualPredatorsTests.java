package SideInMenuNavigationTests.SafetyToolsNavigationsTests;

import LoginAndRegistration.existingUserLogin;
import Logs.log4j;
import PageObjectModel.safetyToolsElements;
import PageObjectModel.sideInMenuBarElements;
import SideInMenuBarFeatures.safetyTools;
import WebDriver.driver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by naman on 23/6/17.
 */
public class commonalitiesOfSexualPredatorsTests {
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

    @Test(priority = 0)
    public void canGoToCommonalitiesOfSexualPredators(){
        sideInMenuBarElements.safetyToolsTab().click();

        try{
            driver.waitDriverForElement(safetyToolsElements.commonalitiesofSexualPredatorsTab());
        }
        catch(IOException e){
            log4j.Log.info(e);
        }

        safetyToolsElements.commonalitiesofSexualPredatorsTab().click();

        try{
            driver.waitDriverForElement(safetyToolsElements.commonalitiesofSexualPredatorsTitle());
        }
        catch(IOException e){
            log4j.Log.info(e);
        }

        Assert.assertEquals(safetyTools.canGotoCommonalitiesOfSexualPredators(), true, "\"Commonalities of Sexual Predators\" page is not loaded!");
    }

    @Test(priority = 1)
    public void commonalitiesOfSexualPredatorsPage1CardsPresent(){
        Assert.assertEquals(safetyToolsElements.commonalitiesOfSexualPredatorsUiCards().get(0).isDisplayed() && safetyToolsElements.commonalitiesOfSexualPredatorsUiCards().get(1).isDisplayed(), true, "\"Commonalities of Sexual Predators\" UI cards are not present!");
    }

    @Test(priority = 2)
    public void canNavigateTo2ndPage(){
        safetyToolsElements.rightNavButton().click();

        Assert.assertEquals(safetyToolsElements.radarUiCards().get(2).isDisplayed(), true, "Informative UI cards are not shown!");
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
