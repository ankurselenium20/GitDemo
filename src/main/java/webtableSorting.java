import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class webtableSorting

    {
        public static void main(String[] args) throws InterruptedException {
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
            driver.findElement(By.cssSelector(".sort-descending")).click();
//           WebElement pagemenu=  driver.findElement(By.id("page-menu"));
//            Select a = new Select(pagemenu) ;
//            a.selectByValue("20");
            Thread.sleep(2000);
          //  System.out.println(VegName.size());
            List<WebElement> veg;
            do {
                List<WebElement> VegName = driver.findElements(By.xpath("//div[@class='container']//table//tbody/tr/td[1]"));
                Thread.sleep(5000);
                veg = VegName.stream().filter(e -> e.getText().equalsIgnoreCase("almond")).toList();
                if (veg.size() > 0)
                    veg.stream().map(e -> e.findElement(By.xpath("./following-sibling::td[1]"))).forEach(e -> System.out.println(e.getText()));
                else
                    driver.findElement(By.xpath("//a[text()='Next']")).click();
            } while (veg.size() < 1);

//           for( int i=0;i<VegName.size();i++){
//               System.out.println(driver.findElements(By.xpath("//div[@class='container']//table//tbody/tr/*")).get(i).getText());
//           }
//           VegName.stream().filter(e->e.getText().equalsIgnoreCase("beans")).map(e->e.findElement(By.xpath("./following-sibling::td[1]")).
//                   getText()).forEach(text->System.out.println(text));


// Corrected Stream implementation

            //List <String> Vegnamelist =  VegName.stream().map(e->e.getText()).collect(Collectors.toList());
            // Vegnamelist.stream().forEach(e->System.out.println(e));
            // List <String> Vegnamelistsorted = Vegnamelist.stream().sorted().map(s->s.toUpperCase()).toList();
            // List<WebElement> VegName2 = VegName.stream().sorted().toList();
            //  VegName2.stream().forEach(e->System.out.println(e.getText()));
            //Boolean isIdentical = Vegnamelistsorted.equals(Vegnamelist);
            //System.out.println(isIdentical);
            driver.close();
            driver.quit();
        }
}
