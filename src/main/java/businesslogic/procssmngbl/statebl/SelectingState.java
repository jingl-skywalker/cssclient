/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.procssmngbl.statebl;

import java.util.Calendar;
import java.util.Date;
import businesslogicservice.processmngblservice.state.MyState;
import sun.misc.Cache;

/**
 *
 * @author Administrator
 */
public class SelectingState implements MyState {

    Calendar calendar;
    StateContext context;
    StateTime stm;
    StateOperation stateOperation;

    public SelectingState(StateContext context) {
        this.context = context;
        stateOperation=new StateOperation(context);
    }
        @Override
    public int getStateNum()
    {
        return 5;
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
        context.setState(context.getReselectingState());
    }
}
