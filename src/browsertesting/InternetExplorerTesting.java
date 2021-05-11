package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class InternetExplorerTesting {
    public static void main(String[] args) {
        String baseUrl = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
        WebDriver isDriver = new InternetExplorerDriver();
        isDriver.manage().window().maximize();
        isDriver.manage().timeouts().implicitlyWait( 15, TimeUnit.SECONDS );
        isDriver.get( baseUrl );
        String title = isDriver.getTitle();
        System.out.println(title);
        boolean verifyTitle = title.equals("Personal banking | Barclays");
        System.out.println(verifyTitle);
        boolean verifyIfTitleHas = title.contains("");
        System.out.println(verifyIfTitleHas);
        String pageSource = isDriver.getPageSource();
        System.out.println(pageSource);
        isDriver.close();
        isDriver.quit();

    }
}
