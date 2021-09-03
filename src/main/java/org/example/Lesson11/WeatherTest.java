package org.example.Lesson11;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WeatherTest {
    private WebDriver driver;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void wheaterTest3() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Открываем сайт погоды gismeteo.ua
        driver.get("https://www.gismeteo.ua/");
        // Размер открытого окна
        driver.manage().window().setSize(new Dimension(866, 708));
        // Ставим курсор в строку поиска и вводим город который нам нужен
        driver.findElement(By.id("js-search")).click();
        // Вводим в строку поиска город Киев
        driver.findElement(By.id("js-search")).sendKeys("Киев");
        // Нажимаем на название и переходим на страницу с прогнозом погоды на сегодня в городе Киев
        driver.findElement(By.cssSelector(".js-myloc-uid-4944 .founditem__desc:nth-child(3)")).click();
        // Просмотр прогноза погоды на завтра в городе Киев
        driver.findElement(By.linkText("Завтра")).click();
        // Просмотр прогноза погоды на три дня в городе Киев
        driver.findElement(By.linkText("3 дня")).click();
        // Просмотр прогноза погоды на десять дней в городе Киев
        driver.findElement(By.linkText("10 дней")).click();
        // Просмотр прогноза погоды на две недели в городе Киев
        driver.findElement(By.linkText("2 недели")).click();
        // Просмотр прогноза погоды на месяц в городе Киев
        driver.findElement(By.linkText("Месяц")).click();
        // Закрыть сайт погоды gismeteo.ua
        driver.close();
        System.out.println("Test Complete!!!");
    }
}

