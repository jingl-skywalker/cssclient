/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.userbl;

import java.util.ArrayList;

import businesslogicservice.userblservice.UserBLService;
import enumeration.ResultMessage;
import vo.uservo.UserInfoVO;

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
