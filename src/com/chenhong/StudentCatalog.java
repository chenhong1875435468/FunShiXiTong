package com.chenhong;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class implements a StudentCatalog
 *
 * @author chenhong
 * @version 1.1.0
 * @see Student
 */
public class StudentCatalog {
    private ArrayList<Student> students = new ArrayList<>();

    /**
     * Gets students.
     *
     * @return the students
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * Add student.
     *
     * @param student the student
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Remove student.
     *
     * @param student the student
     */
    public void removeStudent(Student student) {
        students.remove(student);
    }

    /**
     * Gets student.
     *
     * @param id the id
     * @return the student
     */
    public Student getStudent(String id) {
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()) {
            Student student = iterator.next();
            if(student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    /**
     * Gets student.
     *
     * @param index the index
     * @return the student
     */
    public Student getStudent(int index) {
        return students.get(index);
    }

    /**
     * Gets number of students.
     *
     * @return the number of students
     */
    public int getNumberOfStudents() {
        return students.size();
    }
}
