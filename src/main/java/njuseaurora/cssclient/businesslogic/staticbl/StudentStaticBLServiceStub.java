/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogic.staticbl;

import njuseaurora.cssclient.businesslogicservice.staticblservice.StudentStaticBLService;
import njuseaurora.cssclient.vo.staticvo.StudentStaticVO;

/**
 *
 * @author zili chen
 */
public class StudentStaticBLServiceStub implements StudentStaticBLService{
    
        public StudentStaticVO show(String term,String department) {
            return new StudentStaticVO(term,department);
       }
        
        public StudentStaticVO show() {
            return new StudentStaticVO();
        }
}
