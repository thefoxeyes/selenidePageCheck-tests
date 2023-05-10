package com.ezopikhinaelena.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelectorsCheckTests {
    @Test
    void transitionTest() {
//        Открываем сайт https://github.com/selenide/selenide
        open("https://github.com/selenide/selenide");
//        Переходим в раздел Wiki
        $("#wiki-tab").click();
//        Убеждаемся в наличии SoftAssertions в Pages и переходим в раздел SoftAssertions
        $(".js-wiki-more-pages-link").click();
        $("a[href=\"/selenide/selenide/wiki/SoftAssertions\"]").shouldBe(visible).click();
//        Убеждаемся в наличии примера кода для JUnit5
        $(".markdown-body").shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}
