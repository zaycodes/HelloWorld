package com.interswitch.helloworld.apitest;

import com.interswitch.helloworld.Api;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApiTest {

    @Test
    public void greeting() {
        String message = "Hello World";
        assertEquals(message , Api.Message());
    }
}