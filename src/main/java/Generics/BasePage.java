package Generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage 
{
	public WebDriver driver;
	public void selectVisibleText(WebElement element,String text)
	{
		Select s = new Select(element);
	    s.selectByVisibleText(text); 
	}
	public void selectByValue(WebElement element, String value)
	{
		Select s = new Select(element);
	    s.selectByValue(value); 
	}
	public void selectByIndex(WebElement element, int index)
	{
		Select s = new Select(element);
	    s.selectByIndex(index); 
	}
	public void contextCick(WebDriver driver, WebElement element)
	{
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
		
		
	}
	public void robotEnter() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void alertaccept()
	{
		Alert a = driver.switchTo().alert();
		a.accept();
	}

}
