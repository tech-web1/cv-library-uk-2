package uk.co.library.cv.cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import uk.co.library.cv.cucumber.propertyreader.PropertyReader;
import uk.co.library.cv.cucumber.utility.Utility;


/**
 * Created by Jay Vaghani
 */
public class Hooks extends Utility {
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));

    }
    @After
    public void tearDown(){
        closeBrowser();

    }

}
