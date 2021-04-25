package TestRetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

//2nd Method RunTime Implementation

public class RunTimeRetryTest {
	
	@Test
	//public void Login()  // SInce we didn't mentioned the priority test will be executed based on alpahbet
	  public void Test1(){		
		Assert.assertEquals(true, false);		
	}
	
	@Test
	//public void Homepage(){		
	  public void Test2(){	
		Assert.assertEquals(true, false);
	}
	
	@Test
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
