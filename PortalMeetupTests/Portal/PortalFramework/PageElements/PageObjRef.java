package PageElements;
import org.openqa.selenium.By;

/*
* @author Anjali
*/

public class PageObjRef
{
	
    public static String baseURL="http://127.0.0.1:8000/";

    //HomePage Elements
    public static By CommunityTab = By.xpath("html/body/div[1]/div/div[2]/ul[1]/li[2]/a");
    public static By ChooseCommunity = By.xpath("html/body/div[1]/div/div[2]/ul[1]/li[2]/ul/li[3]/a");
    public static By ReadMore1 = By.xpath("html/body/div[2]/div[2]/div[1]/a");
    public static By ReadMore2 = By.xpath("html/body/div[2]/div[4]/div[1]/a");
    public static By ReadMore3 = By.xpath("html/body/div[2]/div[3]/div[2]/a");
    public static By ReadMore4 = By.xpath("html/body/div[2]/div[5]/div[2]/a");
    public static By SignUp = By.xpath("html/body/div[1]/div/div[2]/ul[2]/li[1]/a");
    public static By JoinSysters= By.xpath("html/body/div[2]/div[1]/p[2]/a");
    public static By AboutUs= By.xpath("html/body/div[1]/div/div[2]/ul[1]/li[1]/a");
    public static By Wiki= By.xpath("html/body/div[1]/div/div[2]/ul[1]/li[3]/a"); 
    public static By Contact= By.xpath("html/body/div[1]/div/div[2]/ul[1]/li[4]/a");
    
    //About Us Page
    public static By AboutTitle= By.xpath("html/body/div[2]/div/h1");
    
    //Wiki Page
    public static By WikiTitle= By.xpath(".//*[@id='welcome_to_the_systers_wiki_-_systers_development_community']");
    
    //Contact Page
    public static By ContactTitle= By.xpath("html/body/div[2]/div/h1");
    
    //SystersInitiativesPage
    public static By SystersInitiativesTitle= By.xpath(".//*[@id='post-6992']/div[1]/h2");
    
    //SystersAndCRAwPage
    public static By SystersAndCRAwTitle= By.xpath(".//*[@id='post-7082']/div[1]/h2");
    
    //SystersCommunitiesPage
    public static By SystersCommunitiesTitle= By.xpath(".//*[@id='post-266']/div[1]/h2");
    
    //SystersTechnicalInitiativePage
    public static By SystersTechnicalInitiativeTitle= By.xpath(".//*[@id='post-7130']/div[1]/h2");
    
    //Community Proposal Form
    public static By FormTitle = By.xpath("html/body/div[1]/div/div[2]/div/h1");
    
    //Login Page
    public static By Login= By.xpath("html/body/div[1]/div/div[2]/ul[2]/li[2]/a");
    public static By LoginCheck= By.xpath("html/body/div[2]/div/div");
    public static By AtLoginPage= By.xpath("html/body/div[2]/div[1]/form/h2");
    public static By username=By.id("id_login");
    public static By password=By.id("id_password");
    public static By SignIn=By.xpath("//button[@type='submit']");
    public static By Google=By.xpath("html/body/div[2]/div[1]/div/a[4]");
    public static By Facebook=By.xpath("html/body/div[2]/div[1]/div/a[3]");
    public static By Github=By.xpath("html/body/div[2]/div[1]/div/a[2]");
    public static By Twitter=By.xpath("html/body/div[2]/div[1]/div/a[1]");
  
    
    
    //User/Admin Profile Page
    public static By Edit= By.xpath("html/body/div[3]/div[2]/div[2]/div/div[2]/div[1]/a");
    public static By Lastname= By.id("id_last_name");
    public static By Submit=By.id("submit-id-save");
    public static By UpdatedName=By.xpath("html/body/div[1]/div/div[2]/ul[2]/li/a");
    public static By Logout= By.xpath("html/body/div[1]/div/div[2]/ul[2]/li/ul/li[3]/a");
    
    
    //SignUp Page
    public static By SignUpUsername= By.xpath(".//*[@id='id_username']");
    public static By SignUpEmail= By.xpath(".//*[@id='id_email']");
    public static By SignUpPassword= By.xpath(".//*[@id='id_password1']");
    public static By SignUpConfirmPassword= By.xpath(".//*[@id='id_password2']");
    public static By SignUpSubmit= By.xpath(".//*[@id='signup_form']/button");
    public static By checkSignUp = By.xpath("html/body/div[1]/div/div[2]/ul[2]/li/ul/li[3]/a");
    
    
    //Community Admin Page
    public static By DummyCommunityName= By.cssSelector("a.table-anchor");
    public static By News= By.linkText("News");
    public static By Resources= By.linkText("Resources");
    public static By ViewCommunityProfile =By.linkText("View Community Profile");
    public static By EditCommunityProfile =By.linkText("Edit Community Profile");
    public static By ShowJoinRequests =By.linkText("Show Join Requests");
    public static String dummySlug="dummySlug";
    
    
    //Community Edit Page
    public static By CommunityName=By.xpath(".//*[@id='id_name']");
    public static By CommunityEditSubmit=By.xpath(".//*[@id='submit-id-save']");
    public static By  NewCommunityName= By.xpath("html/body/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[2]");
    
    //Community  News Page
    public static By AddNews= By.linkText("Add news");
    public static By EditCurrentNews= By.linkText("Edit current news");
    public static By DeleteCurrentAddNews= By.linkText("Delete current news");
    public static By NewsTitle = By.id("id_title");
    public static By NewsSlug = By.id("id_slug");
    public static By NewsSubmit= By.id("submit-id-save");
    public static By NewsContent= By.xpath("/html/body/div[2]/div[2]/div[2]/div/form/div[3]/div/div/div/div/div/iframe");
    public static By NewsTobeEdited= By.linkText("dummyNews");
    public static By UpdatedNewsTilte = By.xpath("html/body/div[2]/div[2]/div[2]/div/div/h3");
    public static By NewsTobeDeleted = By.linkText("dummyNewNews");
    public static By ConfirmNewsDelete= By.cssSelector("input.btn.btn-danger");
    
    //Community Resource Page
    public static By AddResource = By.linkText("Add resource");
    public static By EditCurrentResource = By.linkText("Edit current resource");
    public static By DeleteCurrentResource = By.linkText("Delete current resource");
    public static By ResourceTitle = By.id("id_title");
    public static By ResourceSlug = By.id("id_slug");
    public static By ResourceSubmit= By.id("submit-id-save");
    public static By ResourceContent= By.xpath("/html/body/div[2]/div[2]/div[2]/div/form/div[3]/div/div/div/div/div/iframe");
    public static By ResourceTobeEdited= By.linkText("dummyResource");
    public static By UpdatedResourceTitle = By.xpath("html/body/div[2]/div[2]/div[2]/div/div/h3");
    public static By ResourceTobeDeleted = By.linkText("dummyNewResource");
    public static By ConfirmResourceDelete= By.cssSelector("input.btn.btn-danger");
    
    
    //Community Page Actions
    public static By AddPage = By.linkText("Add page");
    public static By EditCurrentPage = By.linkText("Edit current page");
    public static By DeleteCurrentPage = By.linkText("Delete current page");
    public static By PageTitle = By.id("id_title");
    public static By PageSlug = By.id("id_slug");
    public static By PageOrder = By.id("id_order");
    public static By PageSubmit= By.id("submit-id-save");
    public static By PageContent= By.xpath("/html/body/div[2]/div[2]/div[2]/div/form/div[4]/div/div/div/div/div/iframe");
    public static By CreatedPageTitle= By.xpath("html/body/div[2]/div[2]/div[2]/ul/li[1]/a");
    public static By ConfirmPageDelete= By.cssSelector("input.btn.btn-danger");
}
