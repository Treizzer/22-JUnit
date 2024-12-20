package com.treizer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {

    private Main main;

    @BeforeEach
    public void init() {
        this.main = new Main();
    }

    @SuppressWarnings("static-access")
    @Test
    public void testMain() {
        this.main.main(null);
    }

}
