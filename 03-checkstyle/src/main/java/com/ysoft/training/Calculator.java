package com.ysoft.training;

// Generate Checkstyle warning - unused import
import java.util.Date;

public class Calculator {

    /** Internal counter */
    private int counter;

    Calculator() {
        counter = 0;
    }


    public int getCounter() {
        return counter;
    }

    void add(int i) {

        // Generate PMD warning
        if (i==1) {
        }

        counter += i;
    }
}

