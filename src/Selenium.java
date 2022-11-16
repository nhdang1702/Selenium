import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    public static void main(String[] argv) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dangh\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://daotao.vnu.edu.vn/dkmh/login.asp");
        driver.manage().window().maximize();
        WebElement txtUsername = driver.findElement(By.name("txtLoginId"));
        WebElement txtPassword = driver.findElement(By.name("txtPassword"));
        // Nhap Du lieu
        txtUsername.sendKeys("20021330");
        txtPassword.sendKeys("helloabcd");
        // Click login
        WebElement btnLogin = driver.findElement(By.className("button"));
        btnLogin.click();
        WebElement tracuu = driver.findElement(By.id("PortalModule_379"));
        tracuu.click();




    }





}
