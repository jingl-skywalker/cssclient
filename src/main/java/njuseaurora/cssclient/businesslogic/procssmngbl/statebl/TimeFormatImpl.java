/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogic.procssmngbl.statebl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import njuseaurora.cssclient.businesslogicservice.processmngblservice.state.TimeFormat;

/**
 *
 * @author Administrator
 */
public class TimeFormatImpl implements TimeFormat{

    @Override
    public DateFormat getTimeFormat() {
            return DateFormat.getDateInstance();
    }
    
}
