package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class FirefoxTesting {

    public static void main(String[] args) {
        String string = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS  );
        driver.get( string );
        String getTitle = driver.getTitle();
        boolean verifyTitle = getTitle.equals( "Personal banking | Barclays" );
        System.out.println(verifyTitle);
        boolean verifyIfTitle = getTitle.contains("Bank");
        System.out.println(verifyIfTitle);
        System.out.println(getTitle.toUpperCase( Locale.ROOT ));
        System.out.println(getTitle.length());
      //  String pageResource = driver.getPageSource();
      //  System.out.println(pageResource);
        driver.close();

    }





}
