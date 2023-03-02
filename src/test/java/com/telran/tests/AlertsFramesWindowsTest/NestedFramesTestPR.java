package com.telran.tests.AlertsFramesWindowsTest;


import com.telran.tests.TestBasePR;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class NestedFramesTestPR extends TestBasePR {

    @Test
    public void verifyTextInParentAndChildFrames() {
        page.navigate("https://demoqa.com/nestedframes");
        assertThat(page.frameLocator("#frame1").locator("#sampleHeading")).containsText("Parent");
        assertThat(page.frameLocator("#frame1").locator("#sampleHeading")).containsText("Child");

    }
}
