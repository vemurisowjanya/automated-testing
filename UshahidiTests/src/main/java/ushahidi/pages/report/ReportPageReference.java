/**
 * 
 */
package ushahidi.pages.report;

import org.openqa.selenium.By;

/**
 * @author Kesha
 *
 */
public class ReportPageReference {
	private By formType = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[1]/div/h4/span[2]/select");
	private By reportTitle = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[1]/input");
	private By description = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[2]/textarea");
	private By categories = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[6]/div");
	private By TEFL = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[6]/div/ul[1]/li[1]/label/input");
	private By CED = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[6]/div/ul[1]/li[2]/label/input");
	private By YD = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[6]/div/ul[1]/li[3]/label/input");
	private By PCV_SecondaryProject = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[6]/div/ul[1]/li[4]/label/input");
	private By unfriendlyPlaces = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[6]/div/ul[2]/li[1]/label/input");
	private By Language = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[6]/div/ul[2]/li[2]/label/input");
	private By Transportation = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[6]/div/ul[2]/li[3]/label/input");
	private By pCVName = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[1]/input");
	private By location = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[2]/div[2]/input");
	private By organization = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[2]/input");
	private By counterPart = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[3]/input");
	private By projects = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[4]/textarea");
	private By workEnvironment = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[5]/textarea");
	private By directorInfo = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[6]/input");
	private By strength = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[7]/textarea");
	private By weakness = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[8]/textarea");
	private By yearsWithPCV = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div/div[9]/table/tbody");
	private By az1 = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[9]/table/tbody/tr[1]/td[1]/span/input");
	private By az2 = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[9]/table/tbody/tr[1]/td[2]/span/input");
	private By az3 = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[9]/table/tbody/tr[2]/td[1]/span/input");
	private By az4 = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[9]/table/tbody/tr[2]/td[2]/span/input");
	private By az5 = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[9]/table/tbody/tr[3]/td[1]/span/input");
	private By az6 = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[9]/table/tbody/tr[3]/td[2]/span/input");
	private By az7 = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[9]/table/tbody/tr[4]/td[1]/span/input");
	private By az8 = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[9]/table/tbody/tr[4]/td[2]/span/input");
	private By az9 = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[9]/table/tbody/tr[5]/td[1]/span/input");
	private By az10 = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[9]/table/tbody/tr[5]/td[2]/span/input");
	private By az11 = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[9]/table/tbody/tr[6]/td[1]/span/input");
	private By az12 = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[9]/table/tbody/tr[6]/td[2]/span/input");
	private By startDate = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[10]/input");
	private By endDate = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[11]/input");
	private By inSearchOf = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[7]/div[12]/textarea");
	private By firstName = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[8]/div[1]/input");
	private By lastName = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[8]/div[2]/input");
	private By email = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/div[8]/div[3]/input");
	private By newsSourceLink = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[2]/div[3]/div/input");
	private By externalVideoLink = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[2]/div[4]/div/input");
	private By uplaodPhotos = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[2]/div[5]/div/input");
	private By Submit = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[2]/div[6]/input");
	private By errorList = By.xpath("/html/body/div[3]/div/div/div/div/form/div/div[1]/ul/li");
	
	/**
	 * @return the formType
	 */
	public By getFormType() {
		return formType;
	}
	/**
	 * @return the reportTitle
	 */
	public By getReportTitle() {
		return reportTitle;
	}
	/**
	 * @return the description
	 */
	public By getDescription() {
		return description;
	}
	/**
	 * @return the categories
	 */
	public By getCategories() {
		return categories;
	}
	/**
	 * @return the tEFL
	 */
	public By getTEFL() {
		return TEFL;
	}
	/**
	 * @return the cED
	 */
	public By getCED() {
		return CED;
	}
	/**
	 * @return the yD
	 */
	public By getYD() {
		return YD;
	}
	/**
	 * @return the pCV_SecondaryProject
	 */
	public By getPCV_SecondaryProject() {
		return PCV_SecondaryProject;
	}
	/**
	 * @return the unfriendlyPlaces
	 */
	public By getUnfriendlyPlaces() {
		return unfriendlyPlaces;
	}
	/**
	 * @return the language
	 */
	public By getLanguage() {
		return Language;
	}
	/**
	 * @return the transportation
	 */
	public By getTransportation() {
		return Transportation;
	}
	/**
	 * @return the pCVName
	 */
	public By getpCVName() {
		return pCVName;
	}
	/**
	 * @return the location
	 */
	public By getLocation() {
		return location;
	}
	/**
	 * @return the organization
	 */
	public By getOrganization() {
		return organization;
	}
	/**
	 * @return the counterPart
	 */
	public By getCounterPart() {
		return counterPart;
	}
	/**
	 * @return the projects
	 */
	public By getProjects() {
		return projects;
	}
	/**
	 * @return the workEnvironment
	 */
	public By getWorkEnvironment() {
		return workEnvironment;
	}
	/**
	 * @return the directorInfo
	 */
	public By getDirectorInfo() {
		return directorInfo;
	}
	/**
	 * @return the strength
	 */
	public By getStrength() {
		return strength;
	}
	/**
	 * @return the weakness
	 */
	public By getWeakness() {
		return weakness;
	}
	/**
	 * @return the yearsWithPCV
	 */
	public By getYearsWithPCV() {
		return yearsWithPCV;
	}
	/**
	 * @return the az1
	 */
	public By getAz1() {
		return az1;
	}
	/**
	 * @return the az2
	 */
	public By getAz2() {
		return az2;
	}
	/**
	 * @return the az3
	 */
	public By getAz3() {
		return az3;
	}
	/**
	 * @return the az4
	 */
	public By getAz4() {
		return az4;
	}
	/**
	 * @return the az5
	 */
	public By getAz5() {
		return az5;
	}
	/**
	 * @return the az6
	 */
	public By getAz6() {
		return az6;
	}
	/**
	 * @return the az7
	 */
	public By getAz7() {
		return az7;
	}
	/**
	 * @return the az8
	 */
	public By getAz8() {
		return az8;
	}
	/**
	 * @return the az9
	 */
	public By getAz9() {
		return az9;
	}
	/**
	 * @return the az10
	 */
	public By getAz10() {
		return az10;
	}
	/**
	 * @return the az11
	 */
	public By getAz11() {
		return az11;
	}
	/**
	 * @return the az12
	 */
	public By getAz12() {
		return az12;
	}
	/**
	 * @return the startDate
	 */
	public By getStartDate() {
		return startDate;
	}
	/**
	 * @return the endDate
	 */
	public By getEndDate() {
		return endDate;
	}
	/**
	 * @return the inSearchOf
	 */
	public By getInSearchOf() {
		return inSearchOf;
	}
	/**
	 * @return the firstName
	 */
	public By getFirstName() {
		return firstName;
	}
	/**
	 * @return the lastName
	 */
	public By getLastName() {
		return lastName;
	}
	/**
	 * @return the email
	 */
	public By getEmail() {
		return email;
	}
	/**
	 * @return the newsSourceLink
	 */
	public By getNewsSourceLink() {
		return newsSourceLink;
	}
	/**
	 * @return the externalVideoLink
	 */
	public By getExternalVideoLink() {
		return externalVideoLink;
	}
	/**
	 * @return the uplaodPhotos
	 */
	public By getUplaodPhotos() {
		return uplaodPhotos;
	}
	/**
	 * @return the submit
	 */
	public By getSubmit() {
		return Submit;
	}
	/**
	 * @return the errorList
	 */
	public By getErrorList() {
		return errorList;
	}
	
}
