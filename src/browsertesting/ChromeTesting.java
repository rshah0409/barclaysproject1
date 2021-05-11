package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeTesting {
    public static void main(String[] args) {

        String string = "https://www.barclays.co.uk/";
        System.setProperty( "webdriver.chrome.driver","drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );
        driver.get( string );
        String title = driver.getTitle();
        boolean correctTitle = title.equals( "Personal banking | Barclays" );
        System.out.println(correctTitle);
        boolean checkTitleContains = title.contains( "Barclays" );
        System.out.println(checkTitleContains);
        System.out.println(title.length());
        String resource = driver.getPageSource();
        System.out.println(resource);
        driver.close();

    }






}
