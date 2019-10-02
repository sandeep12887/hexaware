package com.adactin.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Random;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.AdactinBaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\reports\\report.html",
		"html:src\\test\\resource\\reports",
		"json:src\\test\\resource\\reports\\report.json",
		"junit:src\\test\\resource\\reports\\report.xml" },
		features = "src\\test\\java\\com\\adactin\\feature\\",
		tags = {"@TC1,@TC2"},
		dryRun = false,strict=true,
		glue = "com.adactin.stepdefinition",
		monochrome = true
		)

public class TestRunner {

	public static WebDriver driver;
	
	@BeforeClass
	
	public static void browserLaunch() throws Exception {
		driver = AdactinBaseClass.getbrowser("chrome");
	}
	
	@AfterClass
	public static void browserQuit() {
		driver.quit();
	}
	/*public static void main(String[] args) {


		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		LocalDate now2 = LocalDate.now();
		System.out.println(now2);
		
		
	}*/
}
