import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class thirdTest {
    @Test
    public void myThirdTest(){
        open("https://ee.ge/");
        $(".cart").click();
        $(byId("search_list")).setValue("კომპიუტერი").pressEnter();
        sleep(5000);
        $(byText("დაამატე კალათში"), 0).click();
        $(".cart").click();
        $(byText("წაშლა")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);






    }
}
