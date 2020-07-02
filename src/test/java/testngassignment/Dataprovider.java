package testngassignment;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dataprovider {

	
	@Test(groups="MODULUS")
	@Parameters({ "a", "b"})	
	public void mod(int a,int b) {		
		float mod=a%b;
		System.out.println("Modulation :"+mod);
		Reporter.log("TestNG_ReportsAndLogs -> Modulation", true);
		System.out.println("Test Case One with Thread Id:- "
				+ Thread.currentThread().getId());
	}
	
	@Test(groups="INVERSE")
	@Parameters({ "a"})
	 public void  inverse(int a) {
	      if (a == 0) {
	        System.out.println("Cannot divide by 0!");
	        Reporter.log("TestNG_ReportsAndLogs -> inverse", true);
	      }
	      else {
	    	double inv= 1 /a;
	    	System.out.println(inv);
	    	Reporter.log("TestNG_ReportsAndLogs -> inverse", true);
	    	System.out.println("Test Case two with Thread Id:- "
					+ Thread.currentThread().getId());
	      }
	     
	   }
	
	@Test(groups="NEGATION")
	@Parameters({ "a"})
	public void negate(int a) {
		System.out.println("Before Negation :"+a);
		int negate=~a;		
		System.out.println("After Negation :"+negate);
		Reporter.log("TestNG_ReportsAndLogs -> Negation", true);	
		System.out.println("Test Case three with Thread Id:- "
				+ Thread.currentThread().getId());
	}
	 @DataProvider(name="operations")
	  public Object[][] data() {
	    return new Object[][] {
	      new Object[] { 3, 8 },
	      new Object[] { 12, 16 },
	      new Object[] { 29, 40 }
	    };
	  }
	  
	 
	  @Test(dataProvider="operations",groups="OPERATIONS")
	  public void squareRoot(int p,int q) {
		 
		  System.out.println("Result set one = "+ (p*p*p)+q);
		  System.out.println("Result set two = "+ (q*q*q)+p);
		  Reporter.log("TestNG_ReportsAndLogs -> operations", true);
		  System.out.println("Test Case four with Thread Id:- "
					+ Thread.currentThread().getId());
	  }
		}



