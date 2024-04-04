package TimBachulkaChallenges;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalenderTest {

    @Test
    public void CalenDerTest() throws InterruptedException {
        String monthNumber= "6";
        String date="15";
        String year="2027";
        String [] expected= {monthNumber,date,year};
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       // driver.manage().window().maximize();
        WebElement clickCalenderIcon= driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']//*[name()='svg']"));
        clickCalenderIcon.click();
        Thread.sleep(2000);
        //clicking on the mid march icon
        driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();

        //clicking again
        driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
        WebElement clickon2027= driver.findElement(By.xpath("//button[contains(text(),'2027')]"));
        clickon2027.click();
        WebElement selectJuly= driver.findElement(By.xpath("//abbr[contains(text(),'June')]"));
        selectJuly.click();
        WebElement selectDate15= driver.findElement(By.xpath("//abbr[contains(text(),'15')]"));
        selectDate15.click();
        List<WebElement> actualList=driver.findElements(By.xpath("//input[contains(@class, 'react-date-picker__inputGroup__input')]"));

        for (int i=0;i<actualList.size();i++){

            Assert.assertEquals( actualList.get(i).getAttribute("value"),expected[i]);
        }

    }
}
