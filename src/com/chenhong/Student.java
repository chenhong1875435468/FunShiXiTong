package com.chenhong;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class implements a Student
 *
 * @author chenhong
 * @version 1.1.0
 * @date 2021 /10/10
 * @see ExamPaper
 */
public class Student {

    private String id;
    private String name;
    private ExamPaper examPaper;

    /**
     * create a student
     */
    public Student() {

    }

    /**
     * Instantiates a new Student.
     *
     * @param id   the id
     * @param name the name
     */
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets exam paper.
     *
     * @return the exam paper
     */
    public ExamPaper getExamPaper() {
        return examPaper;
    }

    /**
     * Sets exam paper.
     *
     * @param examPaper the exam paper
     */
    public void setExamPaper(ExamPaper examPaper) {
        this.examPaper = examPaper;
    }

    @Override
    public String toString() {
        return id + "_" + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Student)) {
            return false;
        }

        Student student = (Student) o;
        return getId().equals(student.getId()) && getName().equals(student.getName()) && getExamPaper().equals(student.getExamPaper());
    }

}
