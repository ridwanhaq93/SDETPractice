package TimBachulkaChallenges;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WebTableExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        List<WebElement> ListAmount = driver.findElements(By.xpath("//div[@class='tableFixHead']//tr/td[4]"));
        ArrayList<String> list = new ArrayList<>();
        for (WebElement ele : ListAmount) {
            list.add(ele.getText());
        }
        int total=0;
        for (String s: list){
            int number= Integer.parseInt(s);
            total= total+ number;
        }
        System.out.println(total);

        WebElement totalAmount= driver.findElement(By.xpath("//div[contains(text(),'Total Amount')]"));
        String getTextOfTotalAmount= totalAmount.getText();
        String [] splitGetText= getTextOfTotalAmount.split(" ");
        String needTotal= splitGetText[3];
        System.out.println(needTotal);
        String finaltotal= String.valueOf(total);
        Assert.assertEquals(finaltotal,needTotal);
    }
}