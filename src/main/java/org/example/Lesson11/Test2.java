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

public class Test2 {
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
    public void test2() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://crm.geekbrains.space/user/login");
        driver.manage().window().setSize(new Dimension(1050, 708));
        driver.findElement(By.id("prependedInput")).click();
        driver.findElement(By.id("prependedInput")).sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).click();
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(By.id("_submit")).click();
        driver.findElement(By.xpath("//div[@id='main-menu']/ul/li/a/span")).click();
        driver.findElement(By.xpath("//div[@id='main-menu']/ul/li/ul/li[4]/a/span")).click();
        driver.findElement(By.linkText("Создать контактное лицо")).click();
        driver.findElement(By.name("crm_contact[lastName]")).click();
        driver.findElement(By.name("crm_contact[lastName]")).sendKeys("Пашков");
        driver.findElement(By.name("crm_contact[firstName]")).click();
        driver.findElement(By.name("crm_contact[firstName]")).sendKeys("Павел");
        driver.findElement(By.xpath("//div[contains(@id,'s2id_crm_contact_company-uid')]//span[@class='select2-arrow']")).click();
        driver.findElement(By.xpath("//div[@class='select2-search']/input")).sendKeys("PashkovTest");
        driver.findElement(By.xpath("//ul/li[descendant::span[contains(text(),'Pashkov')]]")).click();
        driver.findElement(By.cssSelector(".lang-ru")).click();
        driver.findElement(By.name("crm_contact[jobTitle]")).click();
        driver.findElement(By.name("crm_contact[jobTitle]")).sendKeys("Tester");
        driver.findElement(By.cssSelector(".btn-group:nth-child(4) > .btn")).click();
        driver.close();
        System.out.println("Test Complete!!!");
    }
}