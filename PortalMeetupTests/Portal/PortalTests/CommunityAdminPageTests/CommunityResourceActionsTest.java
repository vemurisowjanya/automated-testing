package CommunityAdminPageTests;
import static org.junit.Assert.*;
import junit.framework.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import BaseTests.CommonTests;
import CommunityAdminPageFeatures.CommunityNewsActions;
import CommunityAdminPageFeatures.CommunityResourceActions;

/*
 * @author Anjali
 */

/*
 * Verifies three actions, create, edit and delete resource.
 * FixMethod ensures that tests are executed in order,i.e, add executes first and delete at last
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CommunityResourceActionsTest extends CommonTests
{
	//Variables for creating resource
	private String Title="dummyResource", ResourceSlug="dummyResourceSlug", ResourceContent="xyz";

	//Validates creation of new resource
	@Test
	public void TestA_CreateResource()
	{

		Assert.assertEquals(true, CommunityResourceActions.CanAddResource(Title, ResourceSlug, ResourceContent));
	}
	
	//Checks edit current resource by changing the resource title
	@Test
	public void TestB_EditResource()
	{
		String Title= "dummyNewResource"; 
		Assert.assertEquals(true, CommunityResourceActions.HasTheResourceTitleChangedTo(Title));
	}

	//Validates delete current resource
	@Test
	public void TestC_DeleteResource()
	{
		Assert.assertEquals(true, CommunityResourceActions.HasCurrentResourceBeenDeleted());
	}
}
