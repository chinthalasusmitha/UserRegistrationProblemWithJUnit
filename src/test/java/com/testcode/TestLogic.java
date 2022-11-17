package com.testcode;

import com.junit.UserRegistration;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestLogic {
    @Test
    public void CheckingFirstName() {
        //        assertEquals("Pinky", UserRegistration.validFirstName("aaaa"));
        assertEquals("Pinky", UserRegistration.validFirstName("Pinky"));
        assertEquals("Reddy", UserRegistration.validLastName("Reddy"));
        assertEquals("list", UserRegistration.validEmail("list"));
        assertEquals("+91 7999171774", UserRegistration.validPhoneNumber("+91 7999171774"));
        assertEquals("pInKy@123", UserRegistration.validPassword("pInKy@123"));
        assertEquals("list", UserRegistration.removingAddedMailId("list"));


    }
}
