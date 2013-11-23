package njuseaurora.cssclient.po.processmngpo;

import java.util.Date;
import njuseaurora.cssclient.vo.processmngvo.StateVO;

public class StatePO {

    private Date startDate;
    private Date endDate;
    private int stateNum;

    public StatePO(int stateNum, Date s, Date end) {
        this.stateNum = stateNum;
        this.startDate = s;
        this.endDate = end;
    }

    public StatePO(StateVO svo) {
        this(svo.getStateNum(), svo.getStartDate(), svo.getEndDate());
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getStateNum() {
        return stateNum;
    }

    public void setStateNum(int stateNum) {
        this.stateNum = stateNum;
    }
}
