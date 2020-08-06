package com.sura.pruebascorevida.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public class GeneralPage extends PageObject {
    WebDriver driver;

    public GeneralPage(WebDriver wdriver) {
        super(wdriver);
        driver = wdriver;
    }

    public String getCurrentUrl(){
        return getDriver().getCurrentUrl();
    }
}
