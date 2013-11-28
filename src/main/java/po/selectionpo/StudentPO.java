/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package po.selectionpo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author sheyunfeng
 */
public class StudentPO implements Serializable{
    private String id;
    private ArrayList<String> courselist;
    
    public StudentPO(String id, ArrayList<String> courselist){
        this.id = id;
        this.courselist = courselist;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    public String getID(){
        return id;
    }
    
    public void setCourseList(ArrayList<String> courselist){
        this.courselist = courselist;
    }
    
    public ArrayList<String> getCourseList(){
        return courselist;
    }
}
