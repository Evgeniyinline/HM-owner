package vetmap.webTest;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import vetmap.webTest.config.TestBase;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class VetMapTest extends TestBase {
    @Test
    @DisplayName("Проверка текста на главной странице")
    public void searchTestVetmap() {
        open("https://vetmap.pet/");
        $(byTagAndText("div","Сервис для тебя"))
                .shouldBe(Condition.visible);
    }
}
