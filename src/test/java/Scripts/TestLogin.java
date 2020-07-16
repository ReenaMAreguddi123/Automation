package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Generics.BaseTest;
import Pages.ActiTimeLogin;

public class TestLogin extends BaseTest
{
	@Test
	public void login() throws IOException
	{
		ActiTimeLogin login = new ActiTimeLogin(driver);
		login.loginmethod();
	}

}
