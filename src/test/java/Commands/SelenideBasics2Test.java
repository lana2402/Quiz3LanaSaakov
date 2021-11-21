
package Commands;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;


import static com.codeborne.selenide.Selenide.open;

public class SelenideBasics2Test {

    @Test
    public void firstTest(){
        open("https://demoqa.com/books");

        List<SelenideElement> Elements = $$(".rt-tr-group").
                filterBy(Condition.and("Book Name", Condition.text("O'Reilly Media"), Condition.text("Javascript")));


        SoftAssert softAssert = new SoftAssert();
        int ElSize = ((ElementsCollection) Elements).size();
        softAssert.assertEquals(ElSize, 10);
        softAssert.assertAll(); }


}










