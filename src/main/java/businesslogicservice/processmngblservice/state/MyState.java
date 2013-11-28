/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.processmngblservice.state;

import businesslogic.procssmngbl.statebl.StateTime;

/**
 * 
 * @author Administrator
 */
public interface MyState {
	public void setBegining(StateTime stm);

	public void setEnding(StateTime stm);

	public boolean reachBegining();

	public boolean reachEnding();
}
