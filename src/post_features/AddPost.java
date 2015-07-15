/**
 * This class tests the Add Post functionality.
 * 
 * @author Daisy Nkweteyim
 */


package post_features;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class AddPost extends common.CommonCode {
		
	@Test
	public void addpostTest() {
		
		addpost("The Title", "This is a descripition of the post");
	}
		
}