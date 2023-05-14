import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
public class firstTest {
   @Test
    public void myfirsttest(){

        open("https://ee.ge/");

       $(byText("რეგისტრაცია")).click();
$(byId("firstName")).setValue("ლელა").shouldNotBe(Condition.empty);
$(byId("lastName")).setValue("გუგეშაშვილი").shouldNotBe(Condition.empty);
$(byId("email")).setValue("lela.23.02.93@gmail.com").shouldNotBe(Condition.empty);
$(byAttribute("placeholder", "პაროლი")).setValue("Lela1993@").shouldNotBe(Condition.empty);
$(byAttribute("placeholder", "გაიმეორეთ პაროლი")).setValue("Lela1993@").shouldNotBe(Condition.empty);
$(byId("singup")).isEnabled();




    }
}
