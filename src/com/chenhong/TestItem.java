package com.chenhong;

/**
 * This class implements a TestItem
 *
 * @author chenhong
 * @version 1.1.0
 * @see Test
 */
public class TestItem {
    private double score;
    private Test test;

    /**
     * Gets test.
     *
     * @return the test
     */
    public Test getTest() {
        return test;
    }

    /**
     * Sets test.
     *
     * @param test the test
     */
    public void setTest(Test test) {
        this.test = test;
    }

    /**
     * Instantiates a new Test item.
     *
     * @param test  the test
     * @param score the score
     */
    public TestItem(Test test, int score) {
        this.test = test;
        this.score = score;
    }

    /**
     * Gets score.
     *
     * @return the score
     */
    public double getScore() {
        return score;
    }

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(double score) {
        this.score = score;
    }
}
