package CommunityAdminPageTests;
import junit.framework.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import BaseTests.CommonTests;
import CommunityAdminPageFeatures.CommunityPageActions;

/*
 * @author Anjali
 */

/*
 * Verifies three actions, create, edit and delete page.
 * FixMethod ensures that tests are executed in order,i.e, add executes first and delete at last
 */


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CommunityPageActionsTest extends CommonTests
{

	//Variables for creating Page
	private String Title="dummyPage", PageSlug="dummyPageSlug", PageContent="xyz", PageOrder="1";
	
	//Validates creation of new page
	@Test
	public void TestA_AddPage() 
	{
		Assert.assertEquals(true, CommunityPageActions.CanAddPage(Title, PageSlug, PageContent, PageOrder));
	}
	
	//Checks edit current resource by changing the page title
	@Test
	public void TestB__EditPage()
	{
		String Title= "UpdateddummyPage";
		Assert.assertEquals(true, CommunityPageActions.HasThePageTitleChangedTo(Title));
	}
	
	//Validates delete current page
	@Test
	public void TestC_DeletePage()
	{
		Assert.assertEquals(true, CommunityPageActions.HasCurrentPageBeenDeleted());
	}

}
