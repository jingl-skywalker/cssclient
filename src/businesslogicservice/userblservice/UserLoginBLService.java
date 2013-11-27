/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.userblservice;

import enumeration.ResultMessage;

/**
 *
 * @author Administrator
 */
public interface UserLoginBLService {
     public ResultMessage login(String ID,String psw);
}
