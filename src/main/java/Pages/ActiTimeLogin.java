package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.AutoConstant;
import Generics.ExcelLibrary;

public class ActiTimeLogin implements AutoConstant
{
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextField;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBox;
	
	@FindBy(xpath="//div[.='Login ']")
    private WebElement loginButton;
	
	public ActiTimeLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginmethod() throws IOException
	{
		usernameTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetName, 1, 0));
		passwordTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetName, 1, 1));
		keepLoggedInCheckBox.click();
		loginButton.click();
	}

}
