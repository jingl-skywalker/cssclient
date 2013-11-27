/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.gradevo;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class GradeVO {

    String courseNum;
    String courseName;
    String stuID;
    String stuName;
    String teacherID;
    String teacherName;
    double grade;

    public GradeVO(String cNum, String cNa, String sID, String sNa, String tID, String tNa, double g) {
        courseNum = cNum;
        courseName = cNa;
        stuID = sID;
        stuName = sNa;
        teacherID = tID;
        teacherName = tNa;
        grade = g;
    }

    public GradeVO(String stuNum, String courseID, double grade) {
        stuID = stuNum;
        courseID = courseID;
        grade = grade;
    }

    public String getCourseNum() {
        return courseNum;
    }

    public String getCouseName() {
        return courseName;
    }

    public String getStuID() {
        return stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public double getGrade() {
        return grade;
    }
}
