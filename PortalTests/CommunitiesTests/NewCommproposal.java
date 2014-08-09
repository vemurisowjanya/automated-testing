package CommunitiesTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class NewCommproposal extends Helper.CommonCode {


	@Test
	public void testCommunityPropLink() {
		driver.get(baseUrl + "/");
	    driver.findElement(CommunitiesLink).click();
	    driver.findElement(CommunityProp).click();
	    assertTrue(driver.getPageSource().contains("Please sign in"));
	    assertEquals(driver.getCurrentUrl(), baseUrl + "/accounts/login/?next=/community_proposal/");
	    
	}

}
