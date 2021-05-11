package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class EdgeTesting {
    public static void main(String[] args) {
        String baseUrl = "https://www.barclays.co.uk/";
        System.setProperty( "webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        driver.get( baseUrl );
        String title = driver.getTitle();
        System.out.println(title);
        boolean verifyTitle = title.equals( "Barcleays");
        System.out.println(verifyTitle);
        boolean checkIfTitleHas = title.contains( "Bank");
        System.out.println(checkIfTitleHas);
        System.out.println(title.length());
        String source = driver.getPageSource();
        System.out.println(source);
        driver.close();



    }
}
