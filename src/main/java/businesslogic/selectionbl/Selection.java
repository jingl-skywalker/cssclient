/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businesslogic.selectionbl;

import java.rmi.Naming;
import po.selectionpo.StudentPO;
import po.selectionpo.SelectionPO;
import dataservice.selectiondataservice.SelectionDataService;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sheyunfeng
 */
public class Selection {
    private final int maxCourseNum = 4;
    private Student student = null;
    private CourseList courselist = null;
    private final String term = "2013,Spring";
    
    private SelectionDataService selectiondataservice;
    
    public Selection(){
        selectiondataservice = null;
        /*try{
            selectiondataservice = (SelectionDataService)Naming.lookup("//localhost:1499/SelectionDataService");
            SelectionPO selectionpo = selectiondataservice.find("001", "001");
            System.out.println(selectionpo.getCouseNum() + " " + selectionpo.getStuID() + " " + selectionpo.getTerm());
        }catch(Exception e){
            System.out.println("SelectionDataService exception:" + e);
        }*/
    }
    
    private boolean addStudent(String stuID){
        
        
        StudentPO studentpo = null;
        try {
            studentpo = selectiondataservice.findStudent(stuID, term);
        } catch (RemoteException ex) {
            System.out.println(ex);
        }
        
        if(!(studentpo == null)){
            student = new Student(studentpo);
            courselist = new CourseList(student.getCourseList());
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
            return student.getID().equals(stuID);
    }
    
    public boolean addCourse(String stuID, String courseNum){
        if(!checkStudent(stuID)){
            return false;
        }
        
        if(courselist.getCourseNum() < maxCourseNum){
            return courselist.add(courseNum);
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
        try{
        ArrayList<String> newCourseList = courselist.getList();
        ArrayList<String> oldCourseList = student.getCourseList();
        
        Iterator<String> iterator = newCourseList.iterator();
        while(iterator.hasNext()){
            String courseNum = iterator.next();
            if(!oldCourseList.contains(courseNum)){
                SelectionPO selectionpo = new SelectionPO(courseNum, student.getID(), term);
                selectiondataservice.insert(selectionpo);
            }
        }
        
        iterator = oldCourseList.iterator();
        while(iterator.hasNext()){
            String courseNum = iterator.next();
            if(!newCourseList.contains(courseNum)){
                SelectionPO selectionpo = new SelectionPO(courseNum, student.getID(), term);
                selectiondataservice.delete(selectionpo);
            }
        }
                
        return true;       
        }catch(Exception e){
            System.out.println("Exception:" + e);
            return false;
        }
    }
        

    /*public static void main(String args[]){
        Selection selection = new Selection();
    }*/
}
