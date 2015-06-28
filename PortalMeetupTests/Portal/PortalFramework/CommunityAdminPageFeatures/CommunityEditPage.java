package CommunityAdminPageFeatures;

/*
 * @author Anjali
 */
public class CommunityEditPage 
{

	public static CommunityUpdateCommand UpdateCommunityNameTo(String change)
	{
		return new CommunityUpdateCommand(change);
	}


}
