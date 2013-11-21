/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogicservice.staticblservice;

import njuseaurora.cssclient.vo.staticvo.TeacherStaticVO;

/**
 *
 * @author zili chen
 */
public interface TeacherStaticBLService {
    
    public TeacherStaticVO show();
    
    public TeacherStaticVO show(String department);
}
