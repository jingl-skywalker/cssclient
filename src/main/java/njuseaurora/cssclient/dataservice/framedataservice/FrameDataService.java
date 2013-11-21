/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.dataservice.framedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import njuseaurora.cssclient.po.framepo.FramePO;

/**
 *
 * @author Administrator
 */
public interface FrameDataService extends Remote {

    public void insert(FramePO fpo) throws RemoteException;

    public void update(FramePO fpo) throws RemoteException;

    public FramePO find() throws RemoteException;
}
