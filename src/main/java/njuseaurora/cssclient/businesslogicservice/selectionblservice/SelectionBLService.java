/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogicservice.selectionblservice;

import java.util.ArrayList;

import njuseaurora.cssclient.vo.selectionvo.SelectionVO;

/**
 *
 * @author Administrator
 */
public interface SelectionBLService {

    public boolean addCourse(SelectionVO selectionvo);

    public boolean deleteCourse(SelectionVO selectionvo);

    public boolean quitCourse(SelectionVO selectionvo);

    public boolean verify();
}
