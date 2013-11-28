/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.procssmngbl.statebl;

import businesslogicservice.processmngblservice.state.MyState;

/**
 *
 * @author Administrator
 */
public class ReselectingState implements MyState{
    StateContext context;
    StateTime stm;
    
    public ReselectingState(StateContext context){
        this.context=context;
    }

    
    public void setBegining(StateTime stm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void setEnding(StateTime stm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public boolean reachBegining() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public boolean reachEnding() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
