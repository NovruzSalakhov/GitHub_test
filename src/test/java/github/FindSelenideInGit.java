package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class FindSelenideInGit {

    @BeforeAll
    static void BeforeAll() {
        Configuration.holdBrowserOpen=true;
        Configuration.browser="chrome";

    }

    @Test
    void SelenideSearch () {
        open("https://github.com");
        //$(".js-site-search-type-field").setValue("Selenide").pressEnter();
        $("[placeholder='Search GitHub']").setValue("Selenide").pressEnter();



    }
}
