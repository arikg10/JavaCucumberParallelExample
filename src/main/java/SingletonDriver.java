import org.openqa.selenium.chrome.ChromeDriver;

public final class SingletonDriver {
    private static SingletonDriver instance;
    private ChromeDriver driver;
    private SingletonDriver(){
        driver = new ChromeDriver();
    }
    public static SingletonDriver getInstance(){
        if(instance == null){
            instance = new SingletonDriver();
        }
        return instance;
    }

    public ChromeDriver getDriver() {
        return driver;
    }

}


