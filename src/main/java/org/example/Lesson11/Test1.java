package org.example.Lesson11;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test1 {
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
    public void test1() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://crm.geekbrains.space/user/login");
        driver.manage().window().setSize(new Dimension(1050, 708));
        driver.findElement(By.id("prependedInput")).click();
        driver.findElement(By.id("prependedInput")).sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).click();
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(By.id("_submit")).click();
        driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[3]/ul/li[4]/a/span")).click();
        driver.findElement(By.linkText("Создать проект")).click();
        driver.findElement(By.name("crm_project[name]")).click();
        driver.findElement(By.name("crm_project[name]")).sendKeys("ProjectPashkovTest");
        driver.findElement(By.xpath("//div[contains(@id,'s2id_crm_project_company-uid')]//span[@class='select2-arrow']")).click();
        driver.findElement(By.xpath("//div[@id='select2-drop']//input[@type='text'][@class='select2-input']")).sendKeys("PashkovTest");
        driver.findElement(By.xpath("//ul/li[descendant::span[contains(text(),'Pashkov')]]")).click();
        driver.findElement(By.xpath("//div[contains(@id,'s2id_crm_project_contactMain-uid')]//span[@class='select2-arrow']")).click();
        driver.findElement(By.xpath("//div[@class='select2-search']/input[@type='text'][@class='select2-input']")).sendKeys("Пашков Павел");
        driver.findElement(By.xpath("//ul/li[descendant::span[contains(text(),'Пашков Павел')]][1]")).click();
        driver.findElement(By.name("crm_project[businessUnit]")).click();
        {
            WebElement dropdown = driver.findElement(By.name("crm_project[businessUnit]"));
            dropdown.findElement(By.xpath("//option[. = 'Research & Development']")).click();
        }
        driver.findElement(By.name("crm_project[curator]")).click();
        {
            WebElement dropdown = driver.findElement(By.name("crm_project[curator]"));
            dropdown.findElement(By.xpath("//option[. = 'Applanatest Applanatest Applanatest']")).click();
        }
        driver.findElement(By.name("crm_project[rp]")).click();
        {
            WebElement dropdown = driver.findElement(By.name("crm_project[rp]"));
            dropdown.findElement(By.xpath("//option[. = 'Applanatest1 Applanatest1 Applanatest1']")).click();
        }
        driver.findElement(By.name("crm_project[administrator]")).click();
        {
            WebElement dropdown = driver.findElement(By.name("crm_project[administrator]"));
            dropdown.findElement(By.xpath("//option[. = 'Applanatest2 Applanatest2 Applanatest2']")).click();
        }
        driver.findElement(By.name("crm_project[manager]")).click();
        {
            WebElement dropdown = driver.findElement(By.name("crm_project[manager]"));
            dropdown.findElement(By.xpath("//option[. = 'Амелин Владимир']")).click();
        }
        driver.findElement(By.cssSelector(".btn-group:nth-child(4) > .btn")).click();
        driver.findElement(By.cssSelector(".icon-sort-down")).click();
        driver.findElement(By.linkText("Выйти")).click();
        driver.close();
        System.out.println("Test Complete!!!");
    }
}