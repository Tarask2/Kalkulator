package com.homeWork.Kalkulator;

public class Kalk {

    int min(int x, int y) {
        if (x < y) {
            return x;
        } else
            return y;
    }

    int max(int x, int y) {
        if (x > y) {
            return x;
        } else
            return y;
    }

    boolean isPositive(int x) {
        if (x < 0) {
            return false;
        } else
            return true;
    }
}

