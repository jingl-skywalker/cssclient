/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.dataservice.userdataservice;

import njuseaurora.cssclient.enumeration.ResultMessage;
import njuseaurora.cssclient.po.userpo.UserLoginPO;

/**
 *
 * @author Administrator
 */
public interface UserLoginDataService {

    public ResultMessage find(UserLoginPO po);
}
