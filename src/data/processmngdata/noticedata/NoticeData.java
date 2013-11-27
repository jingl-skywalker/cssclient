/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.processmngdata.noticedata;

import data.fileutility.FileUtility;
import data.fileutility.FileutilityImpl;
import dataservice.processmngdataservice.noticedataservice.NoticeDataService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import po.processmngpo.NoticePO;

/**
 *
 * @author Administrator
 */
public class NoticeData extends UnicastRemoteObject implements NoticeDataService {

    FileUtility fileUtility = new FileutilityImpl("resources/notice.txt");

    NoticeData() throws RemoteException {
    }

    @Override
    public boolean insert(NoticePO npo) throws RemoteException {
        return fileUtility.append(npo.toStoreString());

    }

    @Override
    public ArrayList<NoticePO> find() throws RemoteException {
        ArrayList<NoticePO> list = new ArrayList<NoticePO>();
        ArrayList<String> strings = fileUtility.find();
        for (String s : strings) {
            list.add(new NoticePO(s));
        }
        return list;
    }
}
