/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogic.procssmngbl.statebl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import njuseaurora.cssclient.businesslogicservice.processmngblservice.state.StateBLService;
import njuseaurora.cssclient.dataservice.datafactory.DataFactory;
import njuseaurora.cssclient.dataservice.processmngdataservice.statedataservice.StateDataService;
import njuseaurora.cssclient.po.processmngpo.StatePO;
import njuseaurora.cssclient.vo.processmngvo.StateVO;

/**
 *
 * @author Administrator
 */
public class StateController implements StateBLService {

    DataFactory dataFactory;
    StateDataService sds;

    public StateController() {
        try {
            dataFactory = (DataFactory) Naming.lookup("datafactory");
            sds = dataFactory.getStateData();
        } catch (NotBoundException ex) {
            Logger.getLogger(StateController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(StateController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(StateController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public boolean recordState(StateVO svo) {
        StatePO spo = new StatePO(svo);
        return sds.record(spo);

    }

    @Override
    public StateVO lookStateInfo(int stateNum) {
        StatePO spo=sds.find(stateNum);
        return new StateVO(spo);
    }
}
