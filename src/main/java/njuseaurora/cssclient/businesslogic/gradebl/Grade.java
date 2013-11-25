/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package njuseaurora.cssclient.businesslogic.gradebl;

import java.util.ArrayList;
import njuseaurora.cssclient.vo.gradevo.GradeVO;
import njuseaurora.cssclient.vo.uservo.UserInfoVO;
/**
 *
 * @author sheyunfeng
 */
public class Grade {
    private Student student = null;
    private Teacher teacher = null;
    
    private boolean addStudent(String stuID){
        UserInfoVO studentvo;
        if((studentvo = null) == null){    //if((studentvo = getStudent(stuID)) != null)
            student = new Student(studentvo);
            return true;
        }
        else 
            return false;
        
    }
    private boolean checkStudent(String stuID){
        if(student == null){
            return addStudent(stuID);
        }
        else
            return student.getStuID().equals(stuID);
    }
    
    private boolean addTeacher(String teacherID){
        UserInfoVO teachervo;
        if((teachervo = null) == null){    //if((teachervo = getTeacher(teacherID)) != null)
            teacher = new Teacher(teachervo);
            return true;
        }
        else 
            return false;
    }
    
    private boolean checkTeacher(String teacherID){
        if(teacher == null){
            return addTeacher(teacherID);
        }
        else
            return teacher.getTeacherID().equals(teacherID);
    }
    
    public ArrayList<GradeVO> getCourseScore(String ID, String term){
        if(!checkStudent(ID))
            return null;
        
        else
            return student.getCourseScore(term);
    }
    
    public double getGPA(String ID, String term) {
        if(!checkStudent(ID))
            return -1;
        
        else
            return student.getGPA(term);
    }
    
    public int getGradeSum(String ID, String term){
        if(!checkStudent(ID))
            return -1;
        
        else
            return student.getGradeSum(term);
    }
    
    public boolean recordScore(String teacherID, ArrayList<GradeVO> scores){
        if(!checkTeacher(teacherID))
            return false;
        
        return teacher.recordScore(scores);
       
    }
    
    
}
