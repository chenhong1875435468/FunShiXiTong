package com.chenhong;

import java.util.ArrayList;

/**
 * This class implements a ExamPaper
 *
 * @author chenhong
 * @version 1.1.0
 * @see TestItem
 */
public class ExamPaper {
    private ArrayList<TestItem> testItems = new ArrayList<>();

    /**
     * Gets test items.
     *
     * @return the test items
     */
    public ArrayList<TestItem> getTestItems() {
        return testItems;
    }

    /**
     * Gets total score.
     *
     * @return the total score
     */
    public double getTotalScore() {
        int sum = 0;
        for (TestItem testItem : testItems) {
            sum += testItem.getScore();
        }
        return sum;
    }

    /**
     * Add test item.
     *
     * @param testItem the test item
     */
    public void addTestItem(TestItem testItem) {
        testItems.add(testItem);
    }

    /**
     * Remove test item.
     *
     * @param testItem the test item
     */
    public void removeTestItem(TestItem testItem) {
        testItems.remove(testItem);
    }

    /**
     * Gets test item.
     *
     * @param index the index
     * @return the test item
     */
    public TestItem getTestItem(int index) {
        return testItems.get(index);
    }


    /**
     * Gets number of items.
     *
     * @return the number of items
     */
    public int getNumberOfItems() {
        return testItems.size();
    }

    @Override
    public String toString() {
        return "ExamPaper{" +
                "testItems=" + testItems +
                '}';
    }
}
