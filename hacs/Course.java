package hacs;

import java.util.*;

/**
 * Title:        HACS
 * Description:  CSE870 Homework 3:  Implementing Design Patterns
 * Copyright:    Copyright (c) 2002
 * Company:      Department of Computer Science and Engineering, Michigan State University
 *
 * @author Ji Zhang, Wei Zhu
 * @author mjfindler
 * @version 2.0
 * Update to Java 8
 */

public class Course {
    String CourseName;
    public ArrayList<Assignment> assignmentList=new ArrayList<Assignment>();
    int numberOfAssignment;
    int courseLevel;
    boolean accepted = false;

    public Course(String strCourse, int theLevel) {
        this.CourseName = strCourse;
        //0 HighLeve presentation    1  LowLevel Experiment
        this.courseLevel = theLevel;
        // this.AssList = NULL;
        this.numberOfAssignment = 0;
    }

    public boolean isAccepted() {
        return accepted;
    }
    public int getCourseLevel() {
        return courseLevel;
    }

    public void addAssignment(Assignment newAss) throws NullPointerException {
        assignmentList.add(newAss);
    }

    public String toString() {
        return CourseName;
    }

    void accept(NodeVisitor visitor) {
        visitor.visitCourse(this);
        accepted=true;
    }

}