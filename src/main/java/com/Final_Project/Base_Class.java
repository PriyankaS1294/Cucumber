package com.Final_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	// to initialize the driver
				public static WebDriver driver; //null driver
				
				public static WebDriver browserLaunch(String browser) {
					try {
					if (browser.equalsIgnoreCase("Chrome")) {
						System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Final_Project\\Driver\\chromedriver.exe");
						
						 driver = new ChromeDriver();                  
						}
					else {
						System.out.println("invalid");
					}
					
					driver.manage().window().maximize();
				}catch(Exception e) {
					e.printStackTrace();
				}
					
					return driver;

				}
				//driver.get
				
				public static void launchUrl(String url) {
					try {
					driver.get(url);
					}catch(Exception e) {
						e.printStackTrace();
					}
					}
				
					//web element methods
				
						//click
				
				public static void  clickOn(WebElement element) {
					try {
					element.click();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				//sendkeys
				
				public static void inputValue(WebElement element , String str) {
					try {
					element.sendKeys(str);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				

				//switchto
				
				public static void switchTo(WebElement element) {
					driver.switchTo().frame(element);

				}
				
				//gettitle
				public static void getTitle() {
					try {
					 String title = driver.getTitle();  //driver.getTilt();
					System.out.println(title);
			}catch(Exception e) {
				e.printStackTrace();
			}}

				//get text
				public static  void Text(WebElement element) {
					element.getText();
			}
				//close
				public static void close() {
					try {
				driver.close();
			}catch(Exception e) {
			}
			}
				//navigate to
				public static void navigateTo(String url) {
					try {
					driver.navigate().to(url);  //("")
					}catch(Exception e) {
			}}
				
				//navigate back
				public static void navigateBack() {
					try {
					driver.navigate().back();
					}catch(Exception e) {
						e.printStackTrace();
					}
					}

				
				
				//navigate forward
				
				public static void navigateForward() {
					try {
					driver.navigate().forward();

				}catch(Exception e) {
					e.printStackTrace();
				}
				}
				//navigate refresh
				
				public static  void navigateRefresh() {
					try {
					driver.navigate().refresh();
			}catch(Exception e) {
				e.printStackTrace();
			}}
				
				//quit
				public static void quit() {
					try {
					driver.quit();
					}catch(Exception e) {

				}}
				
				//Actions
				
				public static  void action(WebElement element) {
					Actions ac = new Actions(driver);
					ac.moveToElement(element).build().perform();

				}
				//dragdrop
				
				public static void dragdrop(WebElement drag, WebElement drop) {
					try {
						Actions ac = new Actions(driver);
						ac.dragAndDrop(drag, drop).build().perform();
					}catch(Exception e) {
					}
					}
					

				
				//Alert
				//simplealert
				public static void simplealert() {
					try {
						Alert simplealert = driver.switchTo().alert();
						simplealert.accept();
					}catch(Exception e) {
					}
					}
			//confirmalert
				public static void confirmalert() {
					try {
						Alert confirmalert = driver.switchTo().alert();
						confirmalert.accept();
					}catch(Exception e) {
					}
					}
				//promptalert
				public static void promptalert() {
					try {
						Alert promptalert = driver.switchTo().alert();
						promptalert.accept();
					}catch(Exception e) {
					}
					}
				public static void Alert() {
				Alert alert = driver.switchTo().alert();
				alert.accept();
				}
				//Frames
				public static void Frames(WebElement iframe) {
					driver.switchTo().frame(0);
			}
			//getCurrentUrl
				public static void currentUrl() {
					try {
					String currentUrl = driver.getCurrentUrl(); //driver.getCurrentUrl()
			System.out.println(currentUrl);
				}catch(Exception e) {
					e.printStackTrace();
				}}
				
				//Dropdown
				public static void DropDown(WebElement element, String option, String str) {
					Select s = new Select(element);
					if(option.equals("index")) {
					int parseInt =Integer.parseInt(str);
					s.selectByIndex(parseInt);
					}else if(option.equals("value")) {
						s.selectByValue(str);
					}else if(option.equals("text")) {
						s.selectByVisibleText(str);
					}
					
					}//0 1 2
				
				//dropDownValue
				public static void dropDownValue(WebElement element,String str) {
					Select s = new Select(element);
					s.selectByValue(str);

				}
				//dropDownIndex
				public static void dropDownIndex(WebElement element,int index) {
					Select s = new Select(element);
					s.selectByIndex(index);

				}
				//is selected
				public static  void isSelected(WebElement element) {
					try {
					element.isSelected();
			}catch(Exception e) {
			}
			}
				//is enabled
				public static void isEnabled(WebElement element) {
					try {
				element.isEnabled();
			}catch(Exception e) {
			}}
			//is displayed
				public static void isDisplayed(WebElement element) {
					try {
					element.isDisplayed();
			}catch(Exception e) {
			}}
				//takescreenshot
				public static void takeScreenshot(String path) throws IOException {
					TakesScreenshot ts = (TakesScreenshot)driver;
					File srcfile = ts.getScreenshotAs(OutputType.FILE);
					File destfile= new File(path);
					FileUtils.copyFile(srcfile, destfile);

				}
				
				//isMultiple
				public static void isMultiple(WebElement element) {
					Select obj = new Select(element);
					boolean multiple = obj.isMultiple();
					System.out.println(multiple);
					
				}
				//get options//
				public static void getOptions(WebElement element) {
					Select obj = new Select(element);
					List<WebElement> options = obj.getOptions();
					for (WebElement webElement : options) {
						webElement.getText();
						System.out.println(webElement);
					}
					}
				//all Selected options//
				public static void allSelected(WebElement element) {
					Select obj = new Select(element);
					List<WebElement> allSelectedOptions = obj.getAllSelectedOptions();
					for (WebElement webElement : allSelectedOptions) {
						System.out.println(webElement.getText());
					}
				}
				//first selected//
				public static void firstSelected(WebElement element) {
					Select obj = new Select(element);
					WebElement firstSelectedOption = obj.getFirstSelectedOption();
			       System.out.println(firstSelectedOption.getText());
					
				
				}

				//implicitwait
				public static void implicitwait() {
					try {
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					}catch(Exception e) {
						
					}
				}

				//explicitwait
				
				public static void explicitwait(long seconds, WebElement element) {
					try {
						WebDriverWait wait = new WebDriverWait(driver,seconds);
						wait.until(ExpectedConditions.visibilityOf(element));
					}catch(Exception e) {
						
					}

				}
				
				//windowshandling
				public static void windowshandling() {
					try {
						driver.getWindowHandles();
						
					}catch(Exception e) {

				}
			}
				//robot
				public static void Robot(WebElement element) throws AWTException {
					Robot r = new Robot();
					r.keyPress(KeyEvent.VK_DOWN);
					r.keyRelease(KeyEvent.VK_DOWN);
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);

				}
				
				//getAttribute
				public static void getAttribute(By bySearchButton) {
					WebElement element = driver.findElement(bySearchButton);
					System.out.println(element);

				}
				
				
				
}
