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

public class PartsForMobilePhoneTest {
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
    public void partsForMobilePhone() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Открываем сайт mokc.com.ua
        driver.get("http://mokc.com.ua/");
        // Размер открываемого окна
        driver.manage().window().setSize(new Dimension(831, 812));
        // Открытие страницы: Вход в аккаунт
        driver.findElement(By.cssSelector(".login .icon")).click();
        // Установка курсора на поле для ввода Логина пользователя
        driver.findElement(By.id("username")).click();
        // Ввод логина пользователя
        driver.findElement(By.id("username")).sendKeys("Pavel_Pashkov");
        // Ввод пароля пользователя
        driver.findElement(By.id("password")).sendKeys("87604371284");
        // Нажатие клавиши "Войти" с последующим переходом на главную страницу сайта с авторизованным аккаунтом
        driver.findElement(By.name("signin[do]")).click();
        // Переход во вкладку: "Запчасти для телефонов и планшетов "
        driver.findElement(By.linkText("Запчасти для телефонов и планшетов")).click();
        // Переход в подраздел: "Дисплеи Сенсоры"
        driver.findElement(By.cssSelector(".category:nth-child(5) .title")).click();
        // Переход в подраздел: "Дисплеи для Apple"
        driver.findElement(By.cssSelector(".category:nth-child(4) .title")).click();
        // Переход на третью страницу раздела: "Дисплеи для Apple"
        driver.findElement(By.xpath("(//a[contains(text(),'3')])[2]")).click();
        // Нажатие на клавишу "купить" позицию: "Дисплей для Apple iPhone 11 Pro Max с тачскрином"
        driver.findElement(By.xpath("//div[6]/div[5]/form/div/div[2]/input")).click();
        // Товар: "Дисплей для Apple iPhone 11 Pro Max с тачскрином" добавлен в корзин .
        driver.findElement(By.xpath("//section")).click();
        // Выход из аккаунта
        driver.findElement(By.cssSelector(".logout")).click();
        // Закрытие сайта(Теста)
        driver.close();
        System.out.println("Test Complete!!!");
    }
}
