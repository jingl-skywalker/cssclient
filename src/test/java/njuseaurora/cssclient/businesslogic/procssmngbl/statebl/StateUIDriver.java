/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogic.procssmngbl.statebl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import njuseaurora.cssclient.businesslogicservice.processmngblservice.state.MyState;
import njuseaurora.cssclient.businesslogicservice.processmngblservice.state.TimeFormat;

/**
 *
 * @author Administrator
 */
public class StateUIDriver {

    StateContext stateContext;
    MyState state;
    String startString;
    String endString;
    Date startDate;
    Date endDate;

    public StateUIDriver() {
        TimeFormat tf = new TimeFormatImpl();
        DateFormat f1 = tf.getTimeFormat();
        try {
            startDate = f1.parse(startString);
            endDate = f1.parse(endString);
        } catch (ParseException ex) {
            Logger.getLogger(StateUIDriver.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void startEnsurePressed() {
    }

    public void endEnsurePressed() {
    }
}
