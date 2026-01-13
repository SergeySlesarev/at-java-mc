import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.*;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
public class AllureWikiTests {
    @BeforeAll
    static void beforeAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
    @Test
    void test01FindSuccess() {
        open("https://ru.wikipedia.org/wiki/Selenium");
        webdriver().shouldHave(title("Selenium — Википедия"));
    }
    @Test
    void test02FindFailed() {
        open("https://ru.wikipedia.org/wiki/Selenium");
        webdriver().shouldHave(title("Selenide"));
    }
}