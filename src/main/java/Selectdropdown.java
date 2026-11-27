//import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.List;
import java.util.Locale;

//import static dev.failsafe.internal.util.Assert.*;

public class Selectdropdown

{

    public  Selectdropdown(String a)
    {
        System.out.println("i am in consutructor");
    }

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.getCapability(ChromeOptions.CAPABILITY);
        driver = new ChromeDriver(options);


        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Ankur");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abc.kumar@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("abc");
        driver.findElement(By.id("exampleCheck1")).click();
       WebElement A= driver.findElement(By.id("exampleFormControlSelect1"));
       Select dropdown = new Select(A);
       dropdown.selectByIndex(1);
       driver.findElement(By.xpath("(//input[@class='form-check-input'])[3]")).click();
        driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("27111998");
        driver.findElement(By.cssSelector("input[type='submit']")).click() ;
        Thread.sleep(2000);
      String msg=  driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();

    System.out.println(msg.toLowerCase().contains("the Form has been submitted successfully"));
        System.out.println(msg);

      if (msg.toLowerCase().contains("the Form has been submitted successfully")){
          System.out.println("Form has been submitted successfully");}
      else{
        System.out.println("Form has been submitted failed");}
    driver.close();
    driver.quit();
     //Selectdropdown a = new Selectdropdown();




     //dropdown.selectByValue("USD");




}
}
