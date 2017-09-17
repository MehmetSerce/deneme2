import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testsuit1Test {

    @Test
    public  void test1()
    {
        System.out.println("test deneme1");
    }


    @Test
    public  void test2()
    {
        //okayyy
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Jenkins\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //System.setProperty("webdriver.ie.driver", "C:\\Users\\User\\Desktop\\IEDriverServer\\IEDriverServer.exe");
       /*System.setProperty("webdriver.ie.driver", "C:\\Program Files (x86)\\Jenkins\\IEDriverServer.exe");
        WebDriver driver=new InternetExplorerDriver();*/
        driver.get("https://www.google.com.tr");
        long sleepTime = 10000;
      /*  WebDriverWait wait=new WebDriverWait(driver, 10);
      WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.id("q")));*/
      //Thread.sleep(sleepTime);
       WebElement element= driver.findElement(By.name("q"));
      element.sendKeys("mehmetserce.com");
        element.submit();
        WebElement element2= driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div[1]/div/div/h3/a"));
        element2.click();
      //  String s=   element.getText();

        System.out.println(driver.getTitle());
    }

}