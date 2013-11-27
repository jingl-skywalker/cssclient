/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.userdataservice;

import enumeration.ResultMessage;
import po.userpo.UserLoginPO;

/**
 *
 * @author Administrator
 */
public interface UserLoginDataService {

    public ResultMessage find(UserLoginPO po);
}
