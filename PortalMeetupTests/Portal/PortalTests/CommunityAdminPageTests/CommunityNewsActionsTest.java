package CommunityAdminPageTests;
import junit.framework.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import BaseTests.CommonTests;
import CommunityAdminPageFeatures.CommunityNewsActions;


/*
 * @author Anjali
 */


/*
 * Verifies three actions, create, edit and delete news.
 * FixMethod ensures that tests are executed in order,i.e, add executes first and delete at last
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CommunityNewsActionsTest extends CommonTests
{
	//Variables for creating news
	private String Title="dummyNews", NewsSlug="dummyNewsSlug", NewsContent="xyz";
	
	//Validates creation of new news
	@Test
	public void TestA_AddNews() 
	{
		Assert.assertEquals(true, CommunityNewsActions.CanAddNews(Title, NewsSlug, NewsContent));
	}
	
	//Checks edit current news by changing the news title
	@Test
	public void TestB__EditNews()
	{
		String NewTitle="dummyNewNews";
	
		//Validate
		Assert.assertEquals(true, CommunityNewsActions.HasTheNewsTitleChangedTo(NewTitle));
		
	}
	
	//Validates delete current news
	@Test
	public void TestC_DeleteNews()
	{
		Assert.assertEquals(true, CommunityNewsActions.HasCurrentNewsBeenDeleted());
	}

}
