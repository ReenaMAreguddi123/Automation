package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.AutoConstant;
import Generics.ExcelLibrary;

public class ActiTimeCustomer implements AutoConstant
{
	@FindBy(xpath = "//div[@id='container_tasks']")
	   private WebElement tasksLink;
	   
	   @FindBy(xpath = "(//input[@placeholder='Start typing name ...'])[1]")
	   private WebElement inputTextField;
	   
	   @FindBy(xpath = "//span[.='r']")
	   private List<WebElement> cusomerlist;
	   
	   @FindBy(xpath = "//div[.='Add New']")
	   private WebElement addnewLink;
	   
	   @FindBy(xpath = "//div[@class='item createNewCustomer']")
	   private WebElement newcustomerLink;
	   
	   @FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	   private WebElement customernameTExtField;
	   
	   @FindBy(xpath = "//div[.='Create Customer']")
	   private WebElement createcustomerButton;
	   
	   public ActiTimeCustomer(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   public void createCustomer() throws InterruptedException, IOException
	   {
		   Thread.sleep(3000);
		   tasksLink.click();
		   Thread.sleep(2000);
		   inputTextField.clear();
		   inputTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetName2, 1, 0));
		   Thread.sleep(4000);
		   int count = cusomerlist.size();
		   if (count == 0) {
			   addnewLink.click();
			   newcustomerLink.click();
			   customernameTExtField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetName2, 1, 0));
			   Thread.sleep(4000);
			   createcustomerButton.click();
			   
		   }
		   else {
			   System.out.println("Duplicates not allowed");
		   }
		   
	   }

}
