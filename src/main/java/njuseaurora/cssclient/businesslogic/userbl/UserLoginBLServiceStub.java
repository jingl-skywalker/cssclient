/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogic.userbl;

import njuseaurora.cssclient.businesslogicservice.userblservice.UserLoginBLService;
import njuseaurora.cssclient.enumeration.ResultMessage;

/**
 *
 * @author Administrator
 */
public class UserLoginBLServiceStub implements UserLoginBLService {

    
    public ResultMessage login(String ID, String psw) {
        System.out.println("login success!");
        return ResultMessage.SUCCESS;
    }
}
