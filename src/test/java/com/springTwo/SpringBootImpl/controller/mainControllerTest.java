package com.springTwo.SpringBootImpl.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainControllerTest {

    mainController mc;
    @BeforeEach
    void setUp() {
        mc = new mainController();
    }

    @Test
    void helloWorld() {
        assertEquals("hello world",mc.helloWorld());
        System.out.println(mc.helloWorld());
    }

    @Test
    void helloWorld2(){
        assertEquals("hello world 2",mc.helloWorld());
        System.out.println("Failed ");
    }
}