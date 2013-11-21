/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogicservice.staticblservice;

import njuseaurora.cssclient.vo.staticvo.StudentStaticVO;

/**
 *
 * @author zili chen
 */

public interface StudentStaticBLService {
    
    public StudentStaticVO show();
    
    public StudentStaticVO show(String term,String department);
    
}
