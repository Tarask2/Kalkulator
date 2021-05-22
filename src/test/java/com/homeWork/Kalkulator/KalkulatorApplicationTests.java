package com.homeWork.Kalkulator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KalkulatorApplicationTests {
    @Autowired
    @Test
    void min() {
        System.out.println("Min");
    }

    @Autowired
    @Test
    void max() {
        System.out.println("Max");
    }

    @Autowired
    @Test
    void isPositive() {
        System.out.println("Wartosz dodatnia/ujemna");
    }

}
