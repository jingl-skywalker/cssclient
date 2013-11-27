/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entry;

import dataservice.datafactory.DataFactory;
import dataservice.datafactory.DataFactoryImpl;
import dataservice.framedataservice.FrameDataService;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;
import po.framepo.FramePO;

/**
 *
 * @author Administrator
 */
public class Server {
    public static void main(String[] args) {
           System.out.println("Server:");
        try {
            DataFactory factory = new DataFactoryImpl();
            FrameDataService fds = factory.getFrameData();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("dataFactory", factory);
            Naming.rebind("frameDataService", fds);
        } catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
