import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
public class secondTest {
    @Test
    public void mysecondTest(){
        open("https://ee.ge/");
        $(byText("რეგისტრაცია")).click();
        $(byId("singup")).shouldBe(Condition.disabled);
        $(byId("firstName")).click();
        $(byId("lastName")).click();
        $(byText("სახელი სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("email"), 0).click();
        $(byText("გვარი სავალდებულოა")).shouldBe(Condition.visible);
        $(byAttribute("placeholder", "პაროლი")).click();
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $(byAttribute("placeholder", "გაიმეორეთ პაროლი")).click();
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byId("firstName")).click();
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);

        $(byId("email")).setValue("lela");
        $(byId("firstName")).click();
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("password")).setValue("qwert");
        $(byId("confirmPassword")).click();
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byId("password")).setValue("qwertyuiop");
        $(byId("confirmPassword")).setValue("asdfghjkl");
        $(byId("firstName")).click();
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);







    }

}
