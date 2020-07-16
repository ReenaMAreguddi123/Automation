package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Generics.BaseTest;
import Pages.ActiTimeCustomer;

public class TestCustomer extends BaseTest
{
 @Test
 public void create() throws InterruptedException, IOException 
 {
	 ActiTimeCustomer customer = new ActiTimeCustomer(driver);
	 customer.createCustomer();
 }
}
