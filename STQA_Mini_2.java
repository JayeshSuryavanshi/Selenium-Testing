/*
Selenium Automated Testing
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
 
public class STQA_Mini_2 {
 
         public static void main(String [] args) throws InterruptedException{
                  
                  //System.setProperty("webdriver.chrome.driver",path of executable file "Chromedriver.exe")
                  System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
                  
                  WebDriver driver = new ChromeDriver();
                  driver.get("https://jayeshsuryawanshi.wordpress.com/");

                  System.out.println("Waiting for the page to load");
                  Thread.sleep(5000);
                  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			//Wait x seconds

                  //WebElement button = driver.findElement(By.id("comp-jfghx3472label"));			//Click on Blog
  				  //button.click();
  				  driver.get("https://jayeshsuryawanshi.wordpress.com/2016/12/11/oneplus-3t/");

  				  System.out.println("Waiting for the page to load");
                  Thread.sleep(5000);
  				  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			//Wait x seconds

  				  //button = driver.findElement(By.id("comp-jfgenleb_MediaBottomPage_PhotoPost__0_0_0_0_ReadMoreBtnlabel"));			//Click on Read More
  				  //button.click();


				  driver.get("https://jayeshsuryawanshi.wordpress.com/contact/");

  				  System.out.println("Waiting for the page to load");
                  Thread.sleep(5000);
  				  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			//Wait x seconds

  				  //button = driver.findElement(By.id("comp-jfgenleb_MediaBottomPage_PhotoPost__0_0_0_0_ReadMoreBtnlabel"));			//Click on Read More
  				  //button.click();


  				  driver.get("https://jayeshsuryawanshi.wordpress.com/about/");

  				  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			//Wait x seconds
                  
                  Thread.sleep(8000);
                  System.out.println("Selenium Webdriver Script in Chrome browser");
                  driver.close();
                  System.out.println("Thank you for using this program! :D");
                  
           }
}
