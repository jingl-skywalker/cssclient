/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogicservice.selectionblservice;

import java.util.ArrayList;

import njuseaurora.cssclient.vo.coursevo.CourseVO;
import njuseaurora.cssclient.vo.uservo.UserInfoVO;

/**
 *
 * @author Administrator
 */
public interface SelectionBLService {

    public ArrayList<CourseVO> getCourseList(String range);

    public UserInfoVO getStudent();

    public void addCourse(String courseNum);

    public void deleteCourse(String courseNum);

    public boolean quitCourse(String courssNum, String stuID);

    public ArrayList<CourseVO> observe();
}
