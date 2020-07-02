package testngassignment;

import java.lang.Math;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testparameters {

	@BeforeClass
	public void startbrowser() {
		System.out.println("This is before class");
	}

	@BeforeMethod
	public void beforemethod() {

		System.out.println("This is before method executed before every test");
	}

	@Test(groups="ADDITION")
	@Parameters({ "a", "b" })
	public void addition(int a, int b) {
		int sum;
		sum = a + b;
	Assert.assertEquals(sum, 74);
		System.out.println("Addition result :" + sum);
		Reporter.log("TestNG_ReportsAndLogs -> Addition", true);
		System.out.println("Test Case Five with Thread Id:- "
				+ Thread.currentThread().getId());

	}

	@Test(groups="SUBTRACTION")
	@Parameters({ "a", "b" })
	public void sub(int a, int b) {
		int sub;
		sub = a - b;
		Assert.assertNotEquals(sub, 25);
		System.out.println(sub);
		Reporter.log("TestNG_ReportsAndLogs -> Subtraction", true);
		System.out.println("Test Case six with Thread Id:- "
				+ Thread.currentThread().getId());
	}

	@Test(groups="MULTIPLICATION")
	@Parameters({ "x", "y" })
	public void multiplication(int x, int y) {
		boolean status;
		if (x == 0 || y == 0) {
			status = false;

			System.out.println("The result is zero");
			Assert.assertFalse(status, "success");
			Reporter.log("TestNG_ReportsAndLogs -> Multiplication", true);
		} else {
			status = true;
			int mult;
			mult = x * y;
			System.out.println(mult);
			Assert.assertNotEquals(mult, 25);
			Reporter.log("TestNG_ReportsAndLogs -> Multiplication", true);
			System.out.println("Test Case seven with Thread Id:- "
					+ Thread.currentThread().getId());
		}

	}

	@Test(groups="DIVISION")
	@Parameters({ "a", "b" })
	public void division(int a, int b) {
		boolean status;
		if (a != 0 && b != 0) {
			float div;
			div = a / b;
			status = true;
			System.out.println(div);
			Assert.assertTrue(status, "success");
			Reporter.log("TestNG_ReportsAndLogs -> Division", true);
			System.out.println("Test Case eight with Thread Id:- "
					+ Thread.currentThread().getId());
		} else {

			status = false;
			Assert.assertTrue(status, "failure");
			System.out.println("Number cannot be divided by zero");
			Reporter.log("TestNG_ReportsAndLogs -> Division", true);
		}
	}
	@BeforeClass
	public void closebrowser() {
		System.out.println("This is after class");
	}

	@BeforeMethod
	public void aftermethod() {

		System.out.println("This is after method executed after every test");
	}

}
