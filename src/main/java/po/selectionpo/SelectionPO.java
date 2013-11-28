/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po.selectionpo;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class SelectionPO implements Serializable{

    private String courseNum;
    private String stuID;
    private String term;

    public SelectionPO(String num, String id, String term) {
        courseNum = num;
        stuID = id;
        this.term = term;
    }

    public String getCouseNum() {
        return courseNum;
    }

    public String getStuID() {
        return stuID;
    }
    
    public void setTerm(String term) {
        this.term = term;
    }

    public String getTerm() {
        return term;
    }
}
