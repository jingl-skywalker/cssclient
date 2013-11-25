/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package njuseaurora.cssclient.businesslogic.selectionbl;

import njuseaurora.cssclient.po.selectionpo.StudentPO;

/**
 *
 * @author sheyunfeng
 */
public class Selection {
    private final int maxCourseNum = 4;
    private Student student = null;
    private CourseList courselist = null;
    
    private boolean getStudent(String stuID){
        StudentPO studentpo;
        if((studentpo = null) == null){    //if((studentvo = getStudent(stuID)) != null)
            student = new Student(studentpo);
            courselist = new CourseList(student.getCourseList());
            return true;
        }
        else 
            return false;
    }
    private boolean checkStudent(String stuID){
        if(student == null){
            return getStudent(stuID);
        }
        else
            return student.getID().equals(stuID);
    }
    
    public boolean addCourse(String stuID, String courseNum){
        if(!checkStudent(stuID)){
            return false;
        }
        
        if(true){    //hasCourse(courseNum)
            if(courselist.getCourseNum() < maxCourseNum){
                return courselist.add(courseNum);
            }
            return false;
        }
        return false;
    }
    
    public boolean deleteCourse(String stuID, String coruseNum){
        if(!checkStudent(stuID)){
            return false;
        }
        
        return courselist.delete(coruseNum);
        
    }
    
    public boolean quitCoruse(String stuID, String courseNum){
        if(!checkStudent(stuID)){
            return false;
        }
        
        if(!courselist.contain(courseNum)){
            return false;
        }
        
        if(true){    //permitted
            courselist.delete(courseNum);
            return verify();            
        }
        else
            return false;
            
    }
    
    public boolean verify(){
        
        return true;
    }
        

}
