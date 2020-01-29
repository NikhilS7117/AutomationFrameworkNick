package CampaignTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import GenericLib.Genericlib;
import pomClasses.CampaignPage;
import pomClasses.CreateCampaignPage;
import pomClasses.Home_Page;

public class TestCampaign2  extends BaseClass
{

	public Genericlib lib = new Genericlib();
	@Test
	public void CampaignTest2() throws Throwable
	{

		Home_Page hp = new Home_Page(driver);
		hp.getMore().click();
		hp.getCamp().click();
		CampaignPage cp = new CampaignPage(driver);
		lib.implicitWait(driver);
		//Thread.sleep(2000);
		cp.getImgaddBtn().click();
		CreateCampaignPage ccp= new CreateCampaignPage(driver);
		lib.implicitWait(driver);
		//Thread.sleep(2000);
		ccp.getOrgNameBox().sendKeys(lib.getExcelDataFixSHEET("Sheet1", 1, 0)+lib.genRandomvalue());
		ccp.getTargetBox().sendKeys("asdadsa");
		ccp.getSaveProduct().click();
		
	}
}
