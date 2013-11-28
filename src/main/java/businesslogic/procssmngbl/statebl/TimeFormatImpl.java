/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.procssmngbl.statebl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import businesslogicservice.processmngblservice.state.TimeFormat;
import java.text.ParseException;
import java.text.spi.DateFormatProvider;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class TimeFormatImpl implements TimeFormat {

    @Override
    public DateFormat getTimeFormat() {
        //return DateFormat.getDateInstance();
        return DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
    }

    @Override
    public Date getTime(String formattedString) {
        TimeFormat tf = new TimeFormatImpl();
        DateFormat df = tf.getTimeFormat();
        Date date = null;
        try {
            date = df.parse(formattedString);
        } catch (ParseException ex) {
            Logger.getLogger(TimeFormatImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
    }

    @Override
    public String getFormattedTimeString(Date date) {
        TimeFormat tf = new TimeFormatImpl();
        DateFormat df = tf.getTimeFormat();
        return df.format(date);
    }
}
