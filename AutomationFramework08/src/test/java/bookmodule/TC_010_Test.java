package bookmodule;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;
@Listeners(ListenerUtility.class)
public class TC_010_Test  extends BaseClass {
	@Test
	public void ClickOnBooks() {
		hp=new HomePage(driver);
		hp.getBooksLink().click();
		Assert.assertEquals(driver. getTitle(),"Demo Web Shop. Books");
		//Assert.fail();
		Reporter.log("Books page is displayed",true);
	}
}
