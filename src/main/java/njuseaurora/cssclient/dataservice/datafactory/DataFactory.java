/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.dataservice.datafactory;

import java.rmi.Remote;
import java.rmi.RemoteException;
import njuseaurora.cssclient.dataservice.framedataservice.FrameDataService;
import njuseaurora.cssclient.dataservice.gradedataservice.GradeDataService;
import njuseaurora.cssclient.dataservice.plandataservice.PlanDataService;
import njuseaurora.cssclient.dataservice.processmngdataservice.noticedataservice.NoticeDataService;
import njuseaurora.cssclient.dataservice.processmngdataservice.statedataservice.StateDataService;

/**
 *
 * @author Administrator
 */
public interface DataFactory extends Remote {

    public FrameDataService getFrameData() throws RemoteException;

    public PlanDataService getPlanData() throws RemoteException;

    public StateDataService getStateData() throws RemoteException;

    public NoticeDataService getNoticeData() throws RemoteException;

    public GradeDataService getGradeData() throws RemoteException;
}
