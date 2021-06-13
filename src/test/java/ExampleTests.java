import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ExampleTests extends BaseTest {

    @Test(testName = "test1")
    public void myTest1() throws InterruptedException {
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(5000);
        driver.findElement(By.id("searchInput")).sendKeys("Food");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test(testName = "test2")
    public void myTest2() throws InterruptedException {
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(5000);
        driver.findElement(By.id("searchInput")).sendKeys("Drinks");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test(testName = "test3")
    public void myTest3() throws InterruptedException {
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(5000);
        driver.findElement(By.id("searchInput")).sendKeys("Banana");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test(testName = "test2")
    public void myTest4() throws InterruptedException {
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(5000);
        driver.findElement(By.id("searchInput")).sendKeys("Orange");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
