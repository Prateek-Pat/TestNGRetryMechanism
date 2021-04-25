package TestRetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

//1st Method @Test
//1) @Test(RetryAnalyzer = PackgeName.ClassName.class)

public class TestLevelRetry {
	
	@Test(retryAnalyzer = RetryMecahnism.RetryAnalyzer.class)
	//public void Login()  // SInce we didn't mentioned the priority test will be executed based on alpahbet
	  public void Test1(){		
		Assert.assertEquals(true, false);		
	}
	
	@Test(retryAnalyzer = RetryMecahnism.RetryAnalyzer.class)
	//public void Homepage(){		
	  public void Test2(){	
		Assert.assertEquals(true, true);
	}
	
	@Test(retryAnalyzer = RetryMecahnism.RetryAnalyzer.class)
	//public void SearchProduct()
	  public void Test3(){		
		Assert.assertEquals(true, false);
	}
	
	@Test
	//public void OrderProduct()
	  public void Test4(){		
		Assert.assertEquals(true, false);
	}
	
	@Test
	//public void Logout()
	  public void Test5(){		
		Assert.assertEquals(true, true);
	}	
}
