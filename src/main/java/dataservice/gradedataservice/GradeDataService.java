/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.gradedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.gradepo.GradePO;

/**
 *
 * @author Administrator
 */
public interface GradeDataService extends Remote {

    public void insert(GradePO po) throws RemoteException;

    public GradePO find(String ID, String Num) throws RemoteException;
}
