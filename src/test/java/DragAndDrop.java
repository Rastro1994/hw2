import org.junit.jupiter.api.Test;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


    public class DragAndDrop {

        @Test
        public void DragandDroptest() {
            open("https://the-internet.herokuapp.com/drag_and_drop");
            $("#column-a").dragAndDropTo("#column-b");
            $$(".column").get(0).should(text("B"));
        }

    }