import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {
    public class OpenPage {
        public OpenPage search(String query) {
            $(By.name("q")).setValue(query).pressEnter();
            return page(OpenPage.class);
        }
    }

}
