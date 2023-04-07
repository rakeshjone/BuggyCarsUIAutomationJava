package Framework;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    private WebDriver webDriver;
    public SearchContext Driver;

    private DriverManager() {
    }

    private SearchContext getDriver() {
        return webDriver;
    }

    private void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public SearchContext LoadDriver(String browser){
        webDriver = null;
        switch (browser){
            case "edge": webDriver = new EdgeDriver(); break;
            default:
                webDriver = new ChromeDriver(); break;
        }
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        webDriver.manage().window().maximize();

        return webDriver;
    }

    public void CloseDriver(){
        if (webDriver!=null){
            webDriver.close();
        }
    }
}
