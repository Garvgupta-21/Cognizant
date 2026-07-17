package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    // 🔧 SETUP (runs BEFORE every test)
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator initialized");
    }

    // 🧹 TEARDOWN (runs AFTER every test)
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator destroyed");
    }

    // -------------------------
    // TEST 1: ADD
    // AAA Pattern applied
    // -------------------------
    @Test
    public void testAdd() {

        // ARRANGE
        int a = 2;
        int b = 3;

        // ACT
        int result = calculator.add(a, b);

        // ASSERT
        assertEquals(5, result);
    }

    // -------------------------
    // TEST 2: MULTIPLY
    // AAA Pattern applied
    // -------------------------
    @Test
    public void testMultiply() {

        // ARRANGE
        int a = 4;
        int b = 5;

        // ACT
        int result = calculator.multiply(a, b);

        // ASSERT
        assertEquals(20, result);
    }
}