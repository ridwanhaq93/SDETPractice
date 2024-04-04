package TimBachulkaChallenges;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.PrintStream;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SeleniumPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        WebElement divElement= driver.findElement(By.id("gf-BIG")); //limiting webdriver scope
    int size= divElement.findElements(By.tagName("a")).size();
    System.out.println(size);

    //3.
        WebElement columnDriver= divElement.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        List<WebElement> columnzsize=columnDriver.findElements(By.tagName("a"));

        //4- click on each link in the column and check if the pages are opening.

        for (int i=1;i<columnzsize.size();i++) {

            String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columnzsize.get(i).sendKeys(clickOnLinkTab);
            //Thread.sleep(5000);
        }
     Set<String> abc= driver.getWindowHandles();
        Iterator<String> j = abc.iterator();
        while (j.hasNext()){
            driver.switchTo().window(j.next());
            System.out.println(driver.getTitle());
        }

      }



    }

