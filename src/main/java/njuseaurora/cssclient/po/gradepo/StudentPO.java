/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package njuseaurora.cssclient.po.gradepo;

import java.util.ArrayList;

/**
 *
 * @author sheyunfeng
 */
public class StudentPO {
    private String id;
    private ArrayList<GradePO> scorelist;
    
    public StudentPO(String id, ArrayList<GradePO> scorelist){
        this.id = id;
        this.scorelist = scorelist;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    public String getID(){
        return id;
    }
    
    public void setScoreList(ArrayList<GradePO> scorelist){
        this.scorelist = scorelist;
    }
    
    public ArrayList<GradePO> getScoreList(){
        return scorelist;
    }
}
