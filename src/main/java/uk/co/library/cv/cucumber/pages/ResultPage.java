package uk.co.library.cv.cucumber.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.cv.cucumber.utility.Utility;

public class ResultPage extends Utility {
    private static final Logger log= LogManager.getLogger(ResultPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

    public String verifyTheResults(String expected) {
         return getTextFromElement(resultText );


    }
}