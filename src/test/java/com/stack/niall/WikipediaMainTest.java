package com.stack.niall;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;

/**
 * Created by niall on 02/05/2017.
 */

@Config(
        browser = Browser.CHROME,
        url     = "https://en.wikipedia.org/wiki/Main_Page"
)
public class WikipediaMainTest extends Locomotive {
    @Test
    public void testSearchBoxExists(){
        validatePresent(WikiPage.LOC_SRCH_SEARCHBOX);
    }

    @Test
    public void testSearchBoxWorks(){
        setText(WikiPage.LOC_SRCH_SEARCHBOX, "Test automation");
        click(WikiPage.LOC_BTN_SEARCH);
        validateUrl("https://en.wikipedia.org/wiki/Test_automation");
    }
}
