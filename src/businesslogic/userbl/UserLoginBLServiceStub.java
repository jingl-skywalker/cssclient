/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.userbl;

import businesslogicservice.userblservice.UserLoginBLService;
import enumeration.ResultMessage;

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
