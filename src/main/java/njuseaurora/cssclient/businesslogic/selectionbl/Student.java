/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package njuseaurora.cssclient.businesslogic.selectionbl;

import java.util.ArrayList;
import njuseaurora.cssclient.po.selectionpo.StudentPO;
/**
 *
 * @author sheyunfeng
 */
public class Student {
    private String stuID;
    private ArrayList<String> courseList;
    
    public Student(StudentPO studentpo){
        this.stuID = studentpo.getID();
        this.courseList = studentpo.getCourseList();        
    }
    
    public String getID(){
        return stuID;
    }
    
    public ArrayList<String> getCourseList(){
        return courseList;
    }
    
    public boolean updateCourseList(ArrayList<String> newCourseList){
        courseList = newCourseList;
        
        return true;
    }
    
    
}
