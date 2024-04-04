package TimBachulkaChallenges;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

//click add to cart to add iems to grocery
public class GroceryItemsChallenge {
  @Test
    public void test(){
      int j=0;
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String []expectedNames={"Cucumber","Brocolli","Beetroot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        List<WebElement> productNames = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i=0;i<productNames.size();i++){
            String[] name=productNames.get(i).getText().split("-");
            String formattedName= name[0].trim();
List itemsNeededList= Arrays.asList(expectedNames);

if (itemsNeededList.contains(formattedName)){
                //click on add to cart
    j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                //lets say the code came into this block 3 times
                if (j==3){
                    break;
                }
            }
        }
    }
}