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
public class StartState implements MyState {

    Calendar calendar;
    StateContext context;
    StateTime stm;
    StateOperation stateOperation;

    public StartState(StateContext context) {
        this.calendar = Calendar.getInstance();
        this.context = context;
        this.stateOperation = new StateOperation(context, stm);
    }

    @Override
    public void setBegining(StateTime stm) {
        stateOperation.setBegining(stm);
    }

    @Override
    public void setEnding(StateTime stm) {
        stateOperation.setEnding(stm);
    }

    @Override
    public boolean reachBegining() {
        return stateOperation.reachBegining();
    }

    @Override
    public boolean reachEnding() {
        return stateOperation.reachEnding();
    }

    @Override
    public void nextState() {
        context.setState(context.getFrameLaunchingState());
    }
}
