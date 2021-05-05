package temp.product.cscart.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.Reporter;

public class PO_Search {

	WebDriver driver;

	public PO_Search(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.NAME, using = "hint_q")
	private WebElement txtbx_search;

	@FindBy(how = How.CLASS_NAME, using = "ty-search-magnifier")
	private WebElement btn_search;

	// Methods
	public void SetSearchTextBox(String arg) {
		txtbx_search.sendKeys(arg);
		Reporter.log("Product entered in Search Box:" + arg, true);
	}

	public void ClickSearchButton() {
		btn_search.click();
		Reporter.log("Search Box button clicked", true);
	}

	// Business Method
	public void SearchAProduct(String arg) {
		SetSearchTextBox(arg);
		ClickSearchButton();
		String actual = driver.getTitle();
		String expected = "Search results";
		Assert.assertEquals(actual, expected, "App is not able to search product" + arg);
		Reporter.log("Able to Search product successfully. Product:" + arg, true);
	}
}
