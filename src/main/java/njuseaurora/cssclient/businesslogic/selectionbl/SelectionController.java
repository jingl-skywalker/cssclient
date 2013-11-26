/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package njuseaurora.cssclient.businesslogic.selectionbl;

import java.util.ArrayList;
import njuseaurora.cssclient.businesslogicservice.selectionblservice.SelectionBLService;
import njuseaurora.cssclient.vo.coursevo.CourseVO;
import njuseaurora.cssclient.vo.selectionvo.SelectionVO;
/**
 *
 * @author sheyunfeng
 */
public class SelectionController implements SelectionBLService{

    Selection selection = new Selection();
    
    public boolean addCourse(SelectionVO selectionvo) {
        return selection.addCourse(selectionvo.stuID(), selectionvo.getCouseNum());
    }

    
    public boolean deleteCourse(SelectionVO selectionvo) {
        return selection.deleteCourse(selectionvo.stuID(), selectionvo.getCouseNum());
    }

    
    public boolean quitCourse(SelectionVO selectionvo) {
        return selection.quitCoruse(selectionvo.stuID(), selectionvo.getCouseNum());
    }

    
    public boolean verify() {
        return selection.verify();
    }

    @Override
    public ArrayList<CourseVO> getCourseList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CourseVO> getMyCourseList(String stuID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
