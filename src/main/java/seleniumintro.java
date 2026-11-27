import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class seleniumintro


{

     static ChromeDriver driver = new ChromeDriver();



    public  static void main(String[] args) throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      //  seleniumintro d = new seleniumintro();
        String b=Getpassword();
        driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
        Thread.sleep(2000);
        System.out.println(b);
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("a");
        driver.findElement(By.cssSelector("input[type='Password']")).sendKeys(b);
        driver.findElement(By.cssSelector("button.signInBtn")).click();
        String a = driver.findElement(By.cssSelector("p.error")).getText();
        driver.findElement(By.linkText("Forgot your password?")).click();

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ankur");
        System.out.println(a);
        driver.close();
        driver.quit();


    }

    public static String Getpassword() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();;
       String a =driver.findElement(By.tagName("p")).getText();
        String[] c = a.split("'");
       return c[1];
    }
}
