import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class webtablefilter

    {


    public static void main(String[] args) throws InterruptedException {
         ChromeDriver driver = new ChromeDriver();
         driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
         driver.findElement(By.id("search-field")).sendKeys("rice");
        List<WebElement> VegName = driver.findElements(By.xpath("//div[@class='container']//table//tbody/tr/td[1]"));

        List <WebElement>veg = VegName.stream().filter(e -> e.getText().equalsIgnoreCase("rice")).toList();
       if(veg.size()>0)
       {
           System.out.println(veg.get(0).getText());

       }
}
}
