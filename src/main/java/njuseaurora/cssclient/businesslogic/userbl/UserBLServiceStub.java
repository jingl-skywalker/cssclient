/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogic.userbl;

import java.util.ArrayList;

import njuseaurora.cssclient.businesslogicservice.userblservice.UserBLService;
import njuseaurora.cssclient.enumeration.ResultMessage;
import njuseaurora.cssclient.vo.uservo.UserInfoVO;

/**
 *
 * @author Administrator
 */
public class UserBLServiceStub implements UserBLService{

    
    public ResultMessage addUser(String file) {
        System.out.println("add success!");
        return ResultMessage.SUCCESS;
    }

    
    public ResultMessage changeUserInfo(String ID, UserInfoVO vo) {
        System.out.println("change success!");
        return ResultMessage.SUCCESS;
    }

    
    public ResultMessage deletUser(String ID) {
        System.out.println("delete success!");
        return ResultMessage.SUCCESS;
    }

    
    public ArrayList<UserInfoVO> getUser(String type) {
        ArrayList<UserInfoVO> vos = new ArrayList<UserInfoVO>();
        vos.add(new UserInfoVO("121250114","ret","student","softwate","male",
                "3444443535635856856"));
        return vos;
    }
    
}
