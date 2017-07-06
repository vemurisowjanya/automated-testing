package SideInMenuBarFeatures;

import PageObjectModel.sideInMenuBarElements;
import PageObjectModel.policiesAndGlossaryElements;
import WebDriver.driver;
import org.openqa.selenium.WebElement;

/**
 * Created by naman on 24/6/17.
 */
public class polciesAndGlossary {
    public static boolean canGoToPolicySummarySheet()
    {
        sideInMenuBarElements.supportServicesTab().click();

        WebElement policySummarySheetTitle = policiesAndGlossaryElements.policySummarySheetTitle();
        if(policySummarySheetTitle.getText().contains("Peace Corps Policy Summary Sheet") && driver.Instance.getCurrentUrl().contains("policy-summary"))
        {
            return true;
        }
        else
            return false;
    }

    public static boolean canGoToGlossary()
    {
        sideInMenuBarElements.supportServicesTab().click();

        WebElement glossaryTitle = policiesAndGlossaryElements.glossaryTitle();
        if(glossaryTitle.getText().contains("Glossary") && driver.Instance.getCurrentUrl().contains("glossary"))
        {
            return true;
        }
        else
            return false;
    }

    public static boolean canGoToFurtherResources()
    {
        sideInMenuBarElements.supportServicesTab().click();

        WebElement furtherResourcesTitle = policiesAndGlossaryElements.furtherResourcesTitle();
        if(furtherResourcesTitle.getText().contains("Further Resources") && driver.Instance.getCurrentUrl().contains("further-resources"))
        {
            return true;
        }
        else
            return false;
    }


}
