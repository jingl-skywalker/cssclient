/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.dataservice.userdataservice;

import java.util.ArrayList;

import njuseaurora.cssclient.enumeration.ResultMessage;
import njuseaurora.cssclient.po.userpo.UserInfoPO;

/**
 *
 * @author Administrator
 */
public interface UserInfoDataService {

    public ResultMessage insert(ArrayList<UserInfoPO> pos);

    public ResultMessage update(String ID, UserInfoPO po);

    public ResultMessage delete(UserInfoPO po);

    public ArrayList<UserInfoPO> find(String type);
    //question here
}
