import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class Github {

    @Test
    public void githubTest() {
        open("https://github.com/");
        $("[name='q']").setValue("selenide").pressEnter();
        $("[href='/selenide/selenide']").click();
        $(byText("Wiki")).click();
        $(withText("Show 1 more pages")).click();
        $(byText("SoftAssertions")).should(visible).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:")/ancestor::ol/following-sibling::div[1]").should(visible);
    }
}
