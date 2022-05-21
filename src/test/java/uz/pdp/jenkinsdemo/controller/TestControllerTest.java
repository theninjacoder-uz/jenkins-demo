package uz.pdp.jenkinsdemo.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestControllerTest {

    private TestController testController = new TestController();

    @Test
    public void testLoginWhenUserIsLoggedInThenReturnSuccessfullyLogin() {

        String expected = "Successfully login";
        String actual = testController.login();
        assertEquals(expected, actual);
    }

}