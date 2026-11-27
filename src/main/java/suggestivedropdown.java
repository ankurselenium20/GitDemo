import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class suggestivedropdown

{
    public  static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("autocomplete")).sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement> dropdown = driver.findElements(By.cssSelector("li.ui-menu-item"));
       int a=  dropdown.size();
       System.out.println(a);
       for(int i=0;i<a;i++){
           if(dropdown.get(i).getText().equalsIgnoreCase("indonesia")){
               dropdown.get(i).click();
               break;
           }
       }
       System.out.println(driver.findElement(By.id("autocomplete")).getText());
       driver.close();
       driver.quit();
    }


}
