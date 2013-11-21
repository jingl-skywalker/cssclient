/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogicservice.userblservice;
import java.util.ArrayList;

import njuseaurora.cssclient.enumeration.ResultMessage;
import njuseaurora.cssclient.vo.uservo.UserInfoVO;

/**
 *
 * @author Administrator
 */
public interface UserBLService {
    public ResultMessage addUser(String file);
    public ResultMessage changeUserInfo(String ID,UserInfoVO vo);
    public ResultMessage deletUser(String ID);
    public ArrayList<UserInfoVO> getUser(String type);
    
}
