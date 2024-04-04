package nestedPojoPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SampleTest {
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.ca/");
        List<WebElement> ele=  driver.findElements(By.xpath("//input[@id='SSS']"));
        for (WebElement s : ele){
            if(s.getText().contains("sss")){
                System.out.println("It is true");
            }


        }
    }
}
