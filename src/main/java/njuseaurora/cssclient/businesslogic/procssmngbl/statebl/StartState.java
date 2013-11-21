/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogic.procssmngbl.statebl;

import java.util.Calendar;
import java.util.Date;

import njuseaurora.cssclient.businesslogicservice.processmngblservice.state.MyState;

/**
 *
 * @author Administrator
 */
public class StartState implements MyState{
	
	Calendar calendar;
    StateContext context;
    StateTime stm;
    
    public StartState(StateContext context){
    	this.calendar=Calendar.getInstance();
        this.context=context;
    }

    
    public void setBegining(StateTime stm) {
       this.stm.setEndTime(stm.getEndTime());
    }

    
    public void setEnding(StateTime stm) {
       this.stm=stm;
    }

    
    public boolean reachBegining() {
    	Date current=new Date();
    	return current.after(this.stm.getStartTime());
    }

    
    public boolean reachEnding() {
    	Date  current=new Date();
        return current.after(this.stm.getEndTime());
    }
}
