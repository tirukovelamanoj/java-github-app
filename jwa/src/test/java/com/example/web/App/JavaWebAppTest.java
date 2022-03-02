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
        assertEquals(new JavaWebApp().squareOfNumber(2), 4);
    }

    @Test
    public void cubeOfNumber(){
        assertEquals(new JavaWebApp().cubeOfNumber(2), 8);
    }

    @AfterEach
    public void afterEach(){
        System.out.println("[TEST] Test completed");
    }
}