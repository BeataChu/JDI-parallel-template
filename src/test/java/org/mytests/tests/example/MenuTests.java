package org.mytests.tests.example;

import org.mytests.tests.TestsInit;
import org.mytests.tests.states.States;
import org.testng.annotations.Test;

import static org.mytests.uiobjects.example.entities.LeftMenuData.*;
import static org.mytests.uiobjects.example.site.SiteJdi.*;
import static org.testng.Assert.assertEquals;

public class MenuTests extends TestsInit {


    @Test
    public void menuTest() {
        States.shouldBeLoggedIn();
        homePage.shouldBeOpened();
        leftMenu.select(Service, ContactForm);
        contactFormPage.checkOpened();
    }
    @Test
    public void customMenuTest() {
        States.shouldBeLoggedIn();
        homePage.shouldBeOpened();
        menu.select(ContactForm);
        assertEquals(menu.selected(), ContactForm.value);
    }
}
