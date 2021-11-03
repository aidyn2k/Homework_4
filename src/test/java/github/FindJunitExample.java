package github;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FindJunitExample {

    @Test
    void findJunit() {
        Configuration.startMaximized = true;
        Configuration.headless = false;

        //Открываем браузер
        open("https://github.com/selenide/selenide");

        //Нажимаем на Wiki
        $("#wiki-tab").click();

        //Нажимаем на фильтр Pages и вставляем значение soft
        $("#wiki-pages-filter").setValue("soft");

        //Проеряем что есть SoftAssertions и нажимаем
        $(byText("SoftAssertions")).shouldBe(visible)
                .click();

        //Находим блок кода и проверяем что он есть
        $(byText("Using JUnit5 extend test class:")).closest("div").$("pre").shouldBe(visible);
    }
}
