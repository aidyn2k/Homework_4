package github;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.*;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {

    @Test
    void dragDrop() {
        Configuration.startMaximized = true;

        //Открытие браузера
        open("https://the-internet.herokuapp.com/drag_and_drop");

//        actions().clickAndHold($("#column-a"))
//                .moveToElement($("#column-b"));
//                .perform();

        //Перенос квадрата А в квадрат Б
        $("#column-a").dragAndDropTo($("#column-b"));

        //Проверка что квадраты поменялись
        $("#column-a header").shouldHave(text("B"));

    }
}
