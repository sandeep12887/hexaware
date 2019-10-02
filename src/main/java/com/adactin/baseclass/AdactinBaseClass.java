package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdactinBaseClass {
	public static WebDriver driver;

	public static WebDriver getbrowser(String browsername) throws Exception {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\samples\\\\Driver\\\\chromedriver.exe");
				driver = new ChromeDriver();
				
			} else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				
			}else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}else {
				throw new Exception("Not a valid Browser");
			}
			return driver;
			
		} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
		}
	} 	
	
	public static WebDriver getUrl(String url) throws Exception {
		try {
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			return driver;
		} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
		}
	}
	
	public static boolean elementDisplayed(WebElement element) throws Exception {
        try {
			boolean displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
        

	}
	public static boolean elementEnabled(WebElement element) throws Exception {
        try {
			boolean enabled = element.isEnabled();
			return enabled;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
    }
	
	public static boolean elementSelected(WebElement element) throws Exception {
        try {
			boolean selected = element.isSelected();
			return selected;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
        }
	
	public static void waitUntilElementVisibility(WebElement element) throws Exception {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 50);
			wb.until(ExpectedConditions.visibilityOf(element));
		
		} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
		}
			}
	public static void elementClear(WebElement element) throws Exception{
		
		try {
			waitUntilElementVisibility(element);
			if (elementDisplayed(element)&&elementEnabled(element))  {	
				element.clear();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public static void inputValueMethod(WebElement element, String value)throws Exception {
		try {
			waitUntilElementVisibility(element);
			if (elementDisplayed(element)&&elementEnabled(element)) {
				element.clear();
				element.sendKeys(value);
				
			}
		} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
		}
	}
	
	public static void elementClick(WebElement element)throws Exception {
		try {
			waitUntilElementVisibility(element);
			element.click();
		} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
		}
		
	}
	
	public static String getElementText(WebElement element) {
		try {
			waitUntilElementVisibility(element);
			String text = element.getText();
			return text;
		} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
		}
	}
	
	public static String getElementAttributetext(WebElement element) {
     try {
		waitUntilElementVisibility(element);
		 String attribute = element.getAttribute("value");
		 return attribute;
	} catch (Exception e) {
	e.printStackTrace();
	throw new RuntimeException();
	}
}
	
	public static String getTitle() {
		try {
			String title = driver.getTitle();
			return title;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public static void selectValueFromDD(WebElement element, String options, String value) throws Exception {
		try {
			waitUntilElementVisibility(element);
			Select sc = new Select(element);
			if (options.equalsIgnoreCase("value")) {
				sc.selectByValue(value);
			}else if (options.equalsIgnoreCase("index")) {
				sc.selectByIndex(Integer.parseInt(value));
			}else if (options.equalsIgnoreCase("visibletext")) {
				sc.selectByVisibleText(value);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			throw new RuntimeException();
		} 
	}
	
	public static void moveToElement(WebElement element) {
		try {
			waitUntilElementVisibility(element);
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}
	
	public static void dragAndDrop(WebElement source, WebElement target) {
		try {
			waitUntilElementVisibility(source);
			Actions ac = new Actions(driver);
			ac.dragAndDrop(source, target).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public static void doubleclick(WebElement element) {
		try {
			waitUntilElementVisibility(element);
			Actions ac = new Actions(driver);
			ac.doubleClick(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public static void contextClick(WebElement element) {
		try {
			waitUntilElementVisibility(element);
			Actions ac = new Actions(driver);
			ac.contextClick(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public static void elementClickUsingActions(WebElement element) {
		try {
			waitUntilElementVisibility(element);
			Actions ac = new Actions(driver);
			ac.contextClick(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public static void elementInputValueUsingActions(WebElement element, String value) {
		try {
			waitUntilElementVisibility(element);
			Actions ac = new Actions(driver);
			ac.sendKeys(element, value);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public static void scrollUpandDownUsingElement(WebElement element) {
		try {
			waitUntilElementVisibility(element);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public static void scrollUpandDownUsngCoordinates(String width, String height) {
		
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("windows.scrollBy("+width+","+height+")");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public static File takeScreenShot(String filename) throws IOException  {
		try {
			File f = new File(System.getProperty("user.dir")+"\\Library\\"+filename+".png");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File temp=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(temp, f);
			return f;
		} catch (WebDriverException e) {
			e.printStackTrace();
			throw new RuntimeException();
		} 
	}

	 public static void scrolltoBottomPage() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeaith)");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	 
	 public static void waitForAlertIsPresent() {
		 try {
			WebDriverWait wb = new WebDriverWait(driver, 50);
			 wb.until(ExpectedConditions.alertIsPresent());
		} catch (Exception e) {
		 e.printStackTrace();
		 throw new RuntimeException();
		}
	 }
	 
	 public static void simpleAlert() {
		 try {
			waitForAlertIsPresent();
			 Alert alert = driver.switchTo().alert();
			 alert.accept();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	 }
	 
	 public static void confirmAlert(String options) {
		 try {
			waitForAlertIsPresent();
			 Alert alert = driver.switchTo().alert();
			 if (options.equalsIgnoreCase("confirm")) {
				alert.accept();
			}else if (options.equalsIgnoreCase("dismiss")) {
				alert.dismiss();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	 }
	 
	 public static void promptAlert(String options, String values) {
		 try {
			waitForAlertIsPresent();
			 Alert alert = driver.switchTo().alert();
			 if (options.equalsIgnoreCase("confirm")) {
				alert.sendKeys(values);
				alert.accept();
			}else if (options.equalsIgnoreCase("dismiss")) {
				alert.dismiss();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	 }
	 
	 public static WebDriver navigationtToUrl(String url) {
		try {
			driver.navigate().to(url);
			 
			 return driver;
		} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
		}
		 
	 }
	 
	 public static WebDriver navigationCommands(String option) {
		try {
			if (option.equalsIgnoreCase("back")) {
				driver.navigate().back();
			}else if (option.equalsIgnoreCase("forward")) {
				driver.navigate().forward();
			}else if (option.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			}
			 
			 return driver;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		 
	 }
	 
	 public static void swithToIframe(String options, Object value) {
		 try {
			if (options.equalsIgnoreCase("index")) {
				driver.switchTo().frame(Integer.parseInt((String)value));
			}else if (options.equalsIgnoreCase("name")) {
				driver.switchTo().frame((String)value);
			}else if (options.equalsIgnoreCase("element")) {
				driver.switchTo().frame((WebElement)value);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			
		}
	 }
	 
	 public static void switchToDefaultContent() {
	        try {
				driver.switchTo().defaultContent();
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException();
			}
	}
	 
	 public static void switchToSecondWindow() {
		try {
			String cid = driver.getWindowHandle();
			Set<String> pid = driver.getWindowHandles();
			for (String x : pid) {
				if (!x.equals(cid)) {
					driver.switchTo().window(x);
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}
	 
	 public static void switchToMultipleWindow(int index) {
		 try {
			String cid = driver.getWindowHandle();
			 Set<String> pid = driver.getWindowHandles();
			 List<String> li = new ArrayList<String>();
			 li.addAll(pid);
			 driver.switchTo().window(li.get(index));
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		 
	 }
	 
	 public static void getValueFromWebtable(String element, int i) {
		 try {
			WebElement table = driver.findElement(By.xpath(element));
			 List<WebElement> findElements = table.findElements(By.xpath("//tr[0]//td["+i+"]"));
			 for (WebElement x : findElements) {
				 System.out.println(x.getText());
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	 }
	 
	 
	 
	 public static void driverQuit() {
		 driver.quit();
	 }
}





