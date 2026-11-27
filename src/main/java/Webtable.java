import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Webtable
{
    public static  void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor)(driver);
        js.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(2000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
       List <WebElement>columnlist =  driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
       int a =  columnlist.size();

      int sum = 0 ;
        for (int j=0;j<a;j++)
        {
           // System.out.println(columnlist.get(j).getText());
           sum = sum+Integer.parseInt( columnlist.get(j).getText());

        }
        System.out.println(sum);
        List <WebElement> table2listrows = driver.findElements(By.xpath("//div[@class='left-align']//table/tbody/tr"));
        List<WebElement>table2listCol = driver.findElements(By.xpath("//div[@class='left-align']//table/tbody/tr[2]/td"));

        System.out.println("Rows:" + table2listrows.size());
        System.out.println("columns :" + table2listCol.size());

        for(int i=0;i<table2listCol.size();i++)

            {
             // List <WebElement>  table2rows= driver.findElements(By.xpath("//div[@class='left-align']//table/tbody/tr[2]/th"));
             //  System.out.println( table2rows.size());
               System.out.println( table2listCol.get(i).getText());
            }

    }

    }


