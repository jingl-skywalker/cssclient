/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogic.procssmngbl.statebl;

import njuseaurora.cssclient.businesslogicservice.processmngblservice.state.MyState;

/**
 *
 * @author Administrator
 */
public class StateStringList {

    MyState states[];

    public StateStringList() {
        states = new MyState[8];
        states[0] = new StartState(null);
        states[1] = new FrameLaunchingState(null);
        states[2] = new PlanUploadingState(null);
        states[3] = new CourseLaunchingState(null);
        states[4] = new SelectingState(null);
        states[5] = new ReselectingState(null);
        states[6] = new DroppingState(null);
        states[7] = new GradeInState(null);
    }

    public MyState getState(int stateNum) {
        return states[stateNum - 1];
    }

    public int getStateNum(MyState state) {
        for (int i = 0; i < 8; i++) {
            if(state.equals(states[i]))
            {
                return i+1;
            }
        }
        return 0;
    }
}
