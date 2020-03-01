package testFillingFilds;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class TestOpenBrowser {

   @Test
   public void test(){
        open("http://comfy.ua/dnepropetrovsk/");
        sleep(20000);
        $("header-search__input digi-autocomplete jc-ignore")
                .shouldBe(Condition.visible)
                .setValue("xiomi")
                .sendKeys(Keys.ENTER);
    }
    
}
