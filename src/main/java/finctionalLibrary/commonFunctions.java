package finctionalLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class commonFunctions {
    public static WebDriver driver;


    public void openBrowser()
        {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        }


public void closeBrowser()
        {
driver.quit();
        }
}
