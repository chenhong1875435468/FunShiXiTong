package com.chenhong;

import java.util.ArrayList;

/**
 * This class implements a TestDatabase
 *
 * @author chenhong
 * @version 1.1.0
 * @see Test
 */
public class TestDatabase {
    private ArrayList<Test> tests = new ArrayList<>();

    /**
     * Gets tests.
     *
     * @return the tests
     */
    public ArrayList<Test> getTests() {
        return tests;
    }

    /**
     * Add test.
     *
     * @param test the test
     */
    public void addTest(Test test) {
        tests.add(test);
    }

    /**
     * Remove test.
     *
     * @param test the test
     */
    public void removeTest(Test test) {
        tests.remove(test);
    }

    /**
     * Gets test.
     *
     * @param code the code
     * @return the test
     */
    public Test getTest(String code) {
        for (Test test : tests) {
            if (test.getCode().equals(code)) {
                return test;
            }
        }
        return null;
    }

    /**
     * Gets test.
     *
     * @param index the index
     * @return the test
     */
    public Test getTest(int index) {
        return tests.get(index);
    }

    /**
     * Gets number of tests.
     *
     * @return the number of tests
     */
    public int getNumberOfTests() {
        return tests.size();
    }
}
