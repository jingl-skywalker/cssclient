/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogic.procssmngbl.statebl;

import java.util.Date;
import njuseaurora.cssclient.vo.processmngvo.StateVO;

/**
 *
 * @author Administrator
 */
public class StateOperation {

    StateContext context;
    StateTime stm;

    public StateOperation() {
    }
    public StateOperation(StateTime stm)
    {
        this.stm=stm;
    }
    public StateOperation(StateContext context, StateTime stm) {
        this.context = context;
        this.stm = stm;
    }

    public void setBegining(StateTime stm) {
        this.stm.setEndTime(stm.getEndTime());
    }

    public void setEnding(StateTime stm) {
        this.stm = stm;
    }

    public boolean reachBegining() {
        Date current = new Date();
        return current.after(this.stm.getStartTime());
    }

    public boolean reachEnding() {
        Date current = new Date();
        return current.after(this.stm.getEndTime());
    }

    public StateVO getStateInfo(int stateNum) {
        
        return null;
    }

    public boolean saveStateTime(StateTime stm) {
        return true;
    }
}
