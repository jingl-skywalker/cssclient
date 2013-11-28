/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package po.gradepo;

import java.util.ArrayList;

/**
 *
 * @author sheyunfeng
 */
public class TeacherPO {
    private String id;
    private ArrayList<String> courselist;
    
    public TeacherPO(String id, ArrayList<String> courselist){
        this.id = id;
        this.courselist = courselist;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    public String getID(){
        return id;
    }
    
    public ArrayList<String> getCourselist(){
        return courselist;
    }
    
}
