/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogicservice.staticblservice;

import njuseaurora.cssclient.vo.staticvo.CourseStaticVO;

/**
 *
 * @author zili chen
 */
public interface CourseStaticBLService {
    
    public CourseStaticVO show();
    
    public CourseStaticVO show(String department);
    
}
