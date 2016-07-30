/*
 * @author Anjali
 * @since 2016-07-31
 * This test script tests the navigation by clicking on all the tabs under "Safety Tools" on the side in menu bar.
 */
package SideInMenuBarTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTests.commonTest;
import Logs.log4j;
import SideInMenuBarFeatures.sideInMenu;

public class safetyToolsNavigationsTest extends commonTest
{
	@Test(priority = 0)
	public void canNavigateToSafetyToolsMain()
	{
		log4j.Log.info("Starting canNavigateToSafetyToolsMain");
		sideInMenu.gotoWelcomePage();
		Assert.assertEquals(sideInMenu.canNavigateToSafetyToolsMain(), true, "canNavigateToSafetyToolsMain failed");
		log4j.Log.info("canNavigateToSafetyToolsMain over");
	}
	
	@Test(priority = 1)
	public void canNavigateToPersonalSecurityStrategies()
	{
		log4j.Log.info("Starting canNavigateToPersonalSecurityStrategies");
		sideInMenu.gotoWelcomePage();
		Assert.assertEquals(sideInMenu.canNavigateToPersonalSecurityStrategies(), true, "canNavigateToPersonalSecurityStrategies failed");
		log4j.Log.info("canNavigateToPersonalSecurityStrategies over");
	}
	
	@Test(priority = 2)
	public void canNavigateToRADAR()
	{
		log4j.Log.info("Starting canNavigateToRADAR");
		sideInMenu.gotoWelcomePage();
		Assert.assertEquals(sideInMenu.canNavigateToRADAR(), true, "canNavigateToRADAR failed");
		log4j.Log.info("canNavigateToRADAR over");
	}
	
	@Test(priority = 3)
	public void canNavigateToCopingwithUnwantedAttention()
	{
		log4j.Log.info("Starting canNavigateToCopingwithUnwantedAttention");
		sideInMenu.gotoWelcomePage();
		Assert.assertEquals(sideInMenu.canNavigateToCopingwithUnwantedAttention(), true, "canNavigateToCopingwithUnwantedAttention failed");
		log4j.Log.info("canNavigateToCopingwithUnwantedAttention over");
	}
	
	@Test(priority = 4)
	public void canNavigateToCommonalitiesofSexualPredators()
	{
		log4j.Log.info("Starting canNavigateToCommonalitiesofSexualPredators");
		sideInMenu.gotoWelcomePage();
		Assert.assertEquals(sideInMenu.canNavigateToCommonalitiesofSexualPredators(), true, "canNavigateToCommonalitiesofSexualPredators failed");
		log4j.Log.info("canNavigateToCommonalitiesofSexualPredators over");
	}
	
	
	
	@Test(priority = 5)
	public void canNavigateToBystanderIntervention()
	{
		log4j.Log.info("Starting canNavigateToBystanderIntervention");
		sideInMenu.gotoWelcomePage();
		Assert.assertEquals(sideInMenu.canNavigateToBystanderIntervention(), true, "canNavigateToBystanderIntervention failed");
		log4j.Log.info("canNavigateToBystanderIntervention over");
	}
	
	@Test(priority = 6)
	public void canNavigateToSafetyPlanBasics()
	{
		log4j.Log.info("Starting canNavigateToSafetyPlanBasics");
		sideInMenu.gotoWelcomePage();
		Assert.assertEquals(sideInMenu.canNavigateToSafetyPlanBasics(), true, "canNavigateToSafetyPlanBasics failed");
		log4j.Log.info("canNavigateToSafetyPlanBasics over");
	}
}
