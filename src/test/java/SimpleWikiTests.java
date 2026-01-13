import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.*;
public class SimpleWikiTests {
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