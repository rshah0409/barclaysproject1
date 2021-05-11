package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class MultiBrowserTesting {
    static String baseUrl = "https://www.barclays.co.uk/";
    static String checkThisBrowser = "ie";
    static WebDriver driver;
    public static void main(String[] args) {

        if (checkThisBrowser.equalsIgnoreCase( "chrome" )){
            System.setProperty( "webdriver.chrome.driver","drivers/chromedriver.exe" );
            driver = new ChromeDriver();

        }else if(checkThisBrowser.equalsIgnoreCase( "ie" )  ){
            System.setProperty( "webdriver.ie.driver","drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.close();
           }else if (checkThisBrowser.equalsIgnoreCase( "firefox" ) ){
            System.setProperty( "webdriver.gecko.driver","drivers/geckodriver.exe" );
                driver = new FirefoxDriver();
            }else if(checkThisBrowser.equalsIgnoreCase( "edge" )) {
                System.setProperty( "webdriver.edge.driver", "drivers/msedgedriver.exe" );
                driver = new EdgeDriver();
            }else{

            System.out.println("you chose a wrong browser");

        }driver.get( baseUrl );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );
        driver.close();


    }
}
