/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.userdataservice;

import java.util.ArrayList;

import enumeration.ResultMessage;
import po.userpo.UserInfoPO;

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
