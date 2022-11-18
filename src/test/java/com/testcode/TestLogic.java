package com.testcode;

import com.junit.UserRegistration;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestLogic {
    @Test
    public void CheckingFirstName() {
        //        assertEquals("Pinky", UserRegistration.validFirstName("aaaa"));
        assertEquals("Pinky", UserRegistration.validFirstName("Pinky"));
    }

    @Test
    public void CheckingLastName() {

        assertEquals("Reddy", UserRegistration.validLastName("Reddy"));

    }

    @Test

    public void CheckingEmail() {

        assertEquals("list", UserRegistration.validEmail("list"));


    }

    @Test

    public void CheckingNumber() {

        assertEquals("+91 7999171774", UserRegistration.validPhoneNumber("+91 7999171774"));

    }


@Test
    public void CheckingPassword() {

        assertEquals("pInKy@123", UserRegistration.validPassword("pInKy@123"));

    }
    @Test
    public void RemovingMails() {

        assertEquals("list", UserRegistration.removingAddedMailId("list"));


    }
    @Test
    public void CheckingUserEntries() {

        assertEquals("SAD", UserRegistration.ValidateUserEntry("SAD"));

    }

}