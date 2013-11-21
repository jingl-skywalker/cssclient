/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.vo.uservo;

/**
 *
 * @author Administrator
 */
public class UserInfoVO {

    private String ID;
    private String name;
    private String type;
    private String depart;
    private String sex;
    private String identification;
    
    public UserInfoVO(String ID,String name,String type,String depart,String sex,
            String identification){
        this.ID = ID;
        this.name = name;
        this.depart = depart;
        this.identification = identification;
        this.sex = sex;
        this.type = type;
    }
    
    public String[] getTableHeader(){
         String[] a = {"ID","name","type","depart","sex","identification"};
         return a;
    }
    
    public String[] getInfor(){
        String[] info = new String[6];
        info[0] = ID;
        info[1] = name;
        info[2] = type;
        info[3] = depart;
        info[4] = sex;
        info[5] = identification;
        return info;
    }
    
    
    public String getID() {
        return ID;
    }

    public String getDepart() {
        return depart;
    }

    public String getIdentification() {
        return identification;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getType() {
        return type;
    }
}
