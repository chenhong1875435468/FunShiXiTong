package com.chenhong;

/**
 * This class implements a EnglishTest
 *
 * @author chenhong
 * @version 1.1.0
 * @see Test
 */
public class EnglishTest extends Test{
    private String type;

    /**
     * Instantiates a new English test.
     */
    public EnglishTest() {

    }

    /**
     * Instantiates a new English test.
     *
     * @param code             the code
     * @param title            the title
     * @param difficultyDegree the difficulty degree
     * @param scoreCriteria    the score criteria
     * @param type             the type
     */
    public EnglishTest(String code, String title, int difficultyDegree, String scoreCriteria, String type) {
        super(code, title, difficultyDegree, scoreCriteria);
        this.type = type;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "EnglishTest{" +
                "type='" + type + '\'' +
                '}';
    }
}
