package com.chenhong;

/**
 * This class implements a Test
 *
 * @author chenhong
 * @version 1.1.0
 */
public class Test {
    private String code;
    private String title;
    private int difficultyDegree;
    private String scoreCriteria;

    @Override
    public String toString() {
        return code + " | " + title + " | " + difficultyDegree;
    }

    /**
     * Instantiates a new Test.
     */
    public Test() {

    }

    /**
     * Instantiates a new Test.
     *
     * @param code             the code
     * @param title            the title
     * @param difficultyDegree the difficulty degree
     * @param scoreCriteria    the score criteria
     */
    public Test(String code, String title, int difficultyDegree, String scoreCriteria) {
        this.code = code;
        this.title = title;
        this.difficultyDegree = difficultyDegree;
        this.scoreCriteria = scoreCriteria;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets difficulty degree.
     *
     * @return the difficulty degree
     */
    public int getDifficultyDegree() {
        return difficultyDegree;
    }

    /**
     * Sets difficulty degree.
     *
     * @param difficultyDegree the difficulty degree
     */
    public void setDifficultyDegree(int difficultyDegree) {
        this.difficultyDegree = difficultyDegree;
    }

    /**
     * Gets score criteria.
     *
     * @return the score criteria
     */
    public String getScoreCriteria() {
        return scoreCriteria;
    }

    /**
     * Sets score criteria.
     *
     * @param scoreCriteria the score criteria
     */
    public void setScoreCriteria(String scoreCriteria) {
        this.scoreCriteria = scoreCriteria;
    }
}
