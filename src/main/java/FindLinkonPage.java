import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FindLinkonPage

{
    public static void  main(String[] args) throws Exception
    {
         ChromeDriver driver = new ChromeDriver();
         driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        int noOfLinks =  driver.findElements(By.tagName("a")).size();
        System.out.println(noOfLinks);

        WebElement footdriver = driver.findElement(By.id("gf-BIG"));
        int noOfFooterLink = footdriver.findElements(By.tagName("a")).size();
        System.out.println(noOfFooterLink);

         List<WebElement> links = driver.findElements(By.xpath("//div/table/tbody/tr/td[1]/ul//a"));
       List<String> Urls = new ArrayList<String>();
        for(WebElement link : links) {

            String clickLinkInNewTab = Keys.chord(Keys.COMMAND, Keys.ENTER);
            link.sendKeys(clickLinkInNewTab);
            //Thread.sleep(2000);

            // Thread.sleep(2000);
            // driver.navigate().back();
            Thread.sleep(2000);
        }
            Set<String> noOfWindowHandles = driver.getWindowHandles();
            Iterator<String> it = noOfWindowHandles.iterator();
            while(it.hasNext()){
                driver.switchTo().window(it.next());
            System.out.println(driver.getTitle()) ;

            }










        driver.close();
        driver.quit();

    }
}
