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
        url     = "https://www.wikipedia.org/"
)

public class WikipediaHomeTest extends Locomotive{
    @Test
    public void testEnglishLinkExists(){
        validatePresent(WikiPage.LOC_LNK_ENGLISHLINK);
    }

    @Test
    public void testEnglishLinkWorks(){
        click(WikiPage.LOC_LNK_ENGLISHLINK);
        validateUrl("https://en.wikipedia.org/wiki/Main_Page");
    }

    @Test
    public void testSearchWorks(){
        validatePresent(WikiPage.LOC_SRCH_SEARCHBOX);
    }
}
