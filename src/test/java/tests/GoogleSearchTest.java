package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Config;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import other.GoogleExaption;

import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchTest {
    @Test
    public void iUseSelenide() {
        Configuration.timeout = 10000;
       // Configuration.browser = "firefox";
        Configuration.headless = true;
        Configuration.startMaximized = true;
        open("http://google.com");
        $(By.name("q")).sendKeys("TeachMeSkills");
        $(By.name("q")).pressEnter();

        try {
            $(By.xpath("//a[@href='https://teachmeskills.by/']")).shouldBe(Condition.visible);
        } catch (Throwable e) {
            throw new GoogleExaption("Warning", e);
        }
        close();
    }
}
