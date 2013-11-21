/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogicservice.userblservice;

import njuseaurora.cssclient.enumeration.ResultMessage;

/**
 *
 * @author Administrator
 */
public interface UserLoginBLService {
     public ResultMessage login(String ID,String psw);
}
