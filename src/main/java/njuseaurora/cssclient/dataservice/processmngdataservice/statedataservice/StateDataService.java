package njuseaurora.cssclient.dataservice.processmngdataservice.statedataservice;

import njuseaurora.cssclient.po.processmngpo.StatePO;

public interface StateDataService {

    public StatePO find(int stateNum);

    public boolean record(StatePO spo);
}
