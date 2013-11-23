package njuseaurora.cssclient.dataservice.processmngdataservice.noticedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import njuseaurora.cssclient.po.processmngpo.NoticePO;

public interface NoticeDataService extends Remote {

    public boolean insert(NoticePO npo) throws RemoteException;

    public ArrayList<NoticePO> find() throws RemoteException;
}
