package com.bank.axis;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAxisBank {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi S\\eclipse-workspace\\AxisBank\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(
				"https://retail.axisbank.co.in/wps/portal/rBanking/axisebanking/AxisRetailLogin/!ut/p/a1/04_Sj9CPykssy0xPLMnMz0vMAfGjzOKNAzxMjIwNjLwsQp0MDBw9PUOd3HwdDQwMjIEKIoEKDHAARwNC-sP1o_ArMYIqwGNFQW6EQaajoiIAVNL82A!!/dl5/d5/L2dBISEvZ0FBIS9nQSEh/");

		driver.manage().window().maximize();

		/*
		 * Thread.sleep(2000);
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver; WebElement emil1 =
		 * driver.findElement(By.xpath("//input[@placeholder='Login ID']"));
		 * js.executeScript("arguments[0].setAttribute('value', '853401741')", emil1);
		 * Thread.sleep(1000); WebElement pass1 = driver.findElement(By.name("pwd"));
		 * js.executeScript("arguments[0].setAttribute('value', 'santhis!30')", pass1);
		 * WebElement login1 =
		 * driver.findElement(By.xpath("//input[@name='ABCustomLoginPortletFormSubmit']"
		 * )); js.executeScript("arguments[0].click()", login1);
		 */

		WebElement uname = driver.findElement(By.xpath("//input[@placeholder='Login ID']"));

		uname.sendKeys("853401741");
		String attribute = uname.getAttribute("value");
		System.out.println(attribute);
		Thread.sleep(2000);

		WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pass.sendKeys("santhis!30");

		WebElement login = driver.findElement(By.xpath("//input[@name='ABCustomLoginPortletFormSubmit']"));
		String text = login.getText();
		System.out.println(text);
		login.click();

		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Gopi S\\eclipse-workspace\\AxisBank\\SS\\sample1.png");
		FileUtils.copyFile(srcFile, f);
		// WebElement lout =
		// driver.findElement(By.xpath("//a[@onclick=\"document.getElementById('logoutlink1').onclick()\"]"));
		// lout.click();
		/*
		 * String text1 = login.getText(); System.out.println(text1);
		 */

	}

	}
