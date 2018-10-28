package common;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllTest {
@BeforeMethod(alwaysRun=true)
public void login()
{
	Reporter.log("login",true);
}
@Test(groups={"user","smoke"})
public void createUser()
{
	Reporter.log("create User",true);
}
@Test(groups={"user"},enabled=false)
public void deleteUser()
{
	Reporter.log("delete user",true);
}
@Test(groups={"product","smoke"})
public void editProduct()
{
	Reporter.log("edit product",true);
}
@Test(groups={"product"})
public void deleteProduct()
{
	Reporter.log("delete product",true);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
