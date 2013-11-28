/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businesslogic.selectionbl;

import java.util.ArrayList;
import po.selectionpo.StudentPO;
import java.util.Iterator;
/**
 *
 * @author sheyunfeng
 */
public class Student {
    private String stuID;
    private ArrayList<String> courseList;
    
    public Student(StudentPO studentpo){
        this.stuID = studentpo.getID();
        courseList = new ArrayList<String>();
        ArrayList<String> list = studentpo.getCourseList();        
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String courseNum = iterator.next();
            if(true){               /////////////isPublicCourse(courseNum);
                courseList.add(courseNum);
            }
        }
    }
    
    public String getID(){
        return stuID;
    }
    
    public ArrayList<String> getCourseList(){
        return courseList;
    }
    
    
}
