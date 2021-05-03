package selenide;

import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Selenide.*;

public class POC {
    @Test
    public void selenide() {
        // Цель: проверить соответствует ли введенный текст в поле задачи, сохраненному.
        open("http://todomvc4tasj.herokuapp.com");
        element("#new-todo").setValue("c").pressEnter();
        elements("#todo-list li:last-child label font font").shouldHave(exactTexts("c"));





    }
}


