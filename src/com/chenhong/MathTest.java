package com.chenhong;

/**
 * This class implements a MathTest
 *
 * @author chenhong
 * @version 1.1.0
 * @see Test
 */
public class MathTest extends Test {
    private String photoURL;
    private String calculationProcess;

    /**
     * Instantiates a new Math test.
     */
    public MathTest() {

    }

    /**
     * Instantiates a new Math test.
     *
     * @param code               the code
     * @param title              the title
     * @param difficultyDegree   the difficulty degree
     * @param scoreCriteria      the score criteria
     * @param photoURL           the photo url
     * @param calculationProcess the calculation process
     */
    public MathTest(String code, String title, int difficultyDegree, String scoreCriteria, String photoURL, String calculationProcess) {
        super(code, title, difficultyDegree, scoreCriteria);
        this.photoURL = photoURL;
        this.calculationProcess = calculationProcess;
    }

    /**
     * Gets photo url.
     *
     * @return the photo url
     */
    public String getPhotoURL() {
        return photoURL;
    }

    /**
     * Sets photo url.
     *
     * @param photoURL the photo url
     */
    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    /**
     * Gets calculation process.
     *
     * @return the calculation process
     */
    public String getCalculationProcess() {
        return calculationProcess;
    }

    /**
     * Sets calculation process.
     *
     * @param calculationProcess the calculation process
     */
    public void setCalculationProcess(String calculationProcess) {
        this.calculationProcess = calculationProcess;
    }

    @Override
    public String toString() {
        return "MathTest{" +
                "photoURL='" + photoURL + '\'' +
                ", calculationProcess='" + calculationProcess + '\'' +
                '}';
    }
}
