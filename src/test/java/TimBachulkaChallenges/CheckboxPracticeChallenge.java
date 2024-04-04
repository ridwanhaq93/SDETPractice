package TimBachulkaChallenges;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class CheckboxPracticeChallenge {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        WebElement checkboX1= driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
        checkboX1.click();
        String textOfCheecbox1= checkboX1.getText();
        WebElement clickDowndownBox= driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        clickDowndownBox.click();
        Select s = new Select(clickDowndownBox);

        for (WebElement ele: s.getOptions()){
          if (ele.getText().equals(textOfCheecbox1)){
              ele.click();
              break;
          }
            }
        }



    }
