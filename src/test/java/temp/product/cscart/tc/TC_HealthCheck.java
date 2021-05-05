package temp.product.cscart.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import temp.product.cscart.po.PO_Search;
import temp.product.cscart.utils.BrowserManager;

public class TC_HealthCheck {

//	String url = "http://demos.cs-cart.com/22181ed0ec98b97f/";

	@Test
	@Parameters({"browser","url"})
	public void t_01_cscart_search(String browser, String url) {
		WebDriver driver = BrowserManager.getDriver("chrome", url);
		PO_Search obj = PageFactory.initElements(driver, PO_Search.class);
		obj.SearchAProduct("computer");

	}
}
