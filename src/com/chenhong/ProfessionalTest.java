package com.chenhong;

/**
 * This class implements a ProfessionalTest
 *
 * @author chenhong
 * @version 1.1.0
 * @see Test
 */
public class ProfessionalTest extends Test{
    private String programInstruction;
    private String programming;
    private String photoURL;

    /**
     * Instantiates a new Professional test.
     */
    public ProfessionalTest() {

    }

    /**
     * Instantiates a new Professional test.
     *
     * @param programInstruction the program instruction
     * @param programming        the programming
     * @param photoURL           the photo url
     */
    public ProfessionalTest(String programInstruction, String programming, String photoURL) {
        this.programInstruction = programInstruction;
        this.programming = programming;
        this.photoURL = photoURL;
    }

    /**
     * Instantiates a new Professional test.
     *
     * @param code               the code
     * @param title              the title
     * @param difficultyDegree   the difficulty degree
     * @param scoreCriteria      the score criteria
     * @param programInstruction the program instruction
     * @param programming        the programming
     * @param photoURL           the photo url
     */
    public ProfessionalTest(String code, String title, int difficultyDegree, String scoreCriteria, String programInstruction, String programming, String photoURL) {
        super(code, title, difficultyDegree, scoreCriteria);
        this.programInstruction = programInstruction;
        this.programming = programming;
        this.photoURL = photoURL;
    }

    /**
     * Gets program instruction.
     *
     * @return the program instruction
     */
    public String getProgramInstruction() {
        return programInstruction;
    }

    /**
     * Sets program instruction.
     *
     * @param programInstruction the program instruction
     */
    public void setProgramInstruction(String programInstruction) {
        this.programInstruction = programInstruction;
    }

    /**
     * Gets programming.
     *
     * @return the programming
     */
    public String getProgramming() {
        return programming;
    }

    /**
     * Sets programming.
     *
     * @param programming the programming
     */
    public void setProgramming(String programming) {
        this.programming = programming;
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

    @Override
    public String toString() {
        return "ProfessionalTest{" +
                "programInstruction='" + programInstruction + '\'' +
                ", programming='" + programming + '\'' +
                ", photoURL='" + photoURL + '\'' +
                '}';
    }
}
