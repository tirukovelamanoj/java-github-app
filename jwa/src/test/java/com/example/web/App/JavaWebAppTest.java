package com.example.web.App;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JavaWebAppTest {
    @BeforeEach
    public void beforeEach(){
        System.out.println("[TEST] Starting test");
    }

    @Test
    public void squareOfNumber(){
        assertEquals(4, new JavaWebApp().squareOfNumber(2));
    }

    @Test
    public void cubeOfNumber(){
        assertEquals(8, new JavaWebApp().cubeOfNumber(2));
    }

    @AfterEach
    public void afterEach(){
        System.out.println("[TEST] Test completed");
    }
}