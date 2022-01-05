package com.buddi;


import com.buddi.basepage.BasePage;
import com.buddi.loadproperty.LoadProperty;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BasePage {
    String browser = new LoadProperty().getProperty("browser");

    @Before
    public void inIt() {
        selectBrowser(browser);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
