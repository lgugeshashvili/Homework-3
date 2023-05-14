import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
public class fourthTest {
    @Test
    public void myfourthTest(){
        open("https://ee.ge/");
        Configuration.browserSize = "1920x1080";
        $(".cart").click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byText("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);
        $(byId("search_list")).setValue("კომპიუტერი").pressEnter();
        $(byText("დაამატე კალათში"), 0).click();
        $(".cart").click();
        $(byText("შენახვა")).click();
        $(byText("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldNotBe(Condition.visible);
        $(".cart").click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byText("შენახული ნივთები")).click();
        $(".cross_icon").click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);





    }
}
