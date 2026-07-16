/*
 * Selenium Automated Testing — STQA mini-project.
 * Opens Chrome and walks through a sequence of pages.
 *
 * Requires Selenium 4.6+ (see pom.xml): Selenium Manager resolves a matching
 * ChromeDriver automatically, so no chromedriver binary needs to be on disk.
 *
 * Run:  mvn -q compile exec:java
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class STQA_Mini_2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://jayeshsuryawanshi.wordpress.com/");
        System.out.println("Waiting for the page to load");
        Thread.sleep(5000);

        driver.get("https://jayeshsuryawanshi.wordpress.com/2016/12/11/oneplus-3t/");
        System.out.println("Waiting for the page to load");
        Thread.sleep(5000);

        driver.get("https://jayeshsuryawanshi.wordpress.com/contact/");
        System.out.println("Waiting for the page to load");
        Thread.sleep(5000);

        driver.get("https://jayeshsuryawanshi.wordpress.com/about/");
        Thread.sleep(8000);

        System.out.println("Selenium Webdriver script in Chrome browser");
        driver.quit();
        System.out.println("Thank you for using this program! :D");
    }
}
