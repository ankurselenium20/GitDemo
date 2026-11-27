import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

//import static org.apache.commons.exec.util.StringUtils.split;

public class AddtoCard {


    public static void main(String[] args) throws InterruptedException {
        String [] cartaddeditems = {"cucumber","beetroot","carrot"};
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        addToCart(driver,cartaddeditems);
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        //Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.action-block")).click();
        driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
    driver.findElement(By.cssSelector("button.promoBtn")).click();
    System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("span.promoInfo"))));

driver.close();
        driver.quit();

          }








          public static void addToCart(ChromeDriver driver, String[] cartaddeditems) throws InterruptedException {
              List<WebElement> prodcts = driver.findElements(By.cssSelector("h4.product-name"));
              int i = -1;

              for(WebElement prodct:prodcts){
                  String productname=  prodct.getText();
                 // String[] productname1 = split(productname," ");

                  i=i+1;
                  // System.out.println(productname);
                  // System.out.println(i);
                  List<String> a = Arrays.stream(cartaddeditems).toList();


               //   if(a.contains(productname1[0].toLowerCase())){


                      driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

                  }

              }
             // Thread.sleep(2000);
              //driver.close();
              //    driver.quit();


          }

