/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogicservice.frameblservice;

import njuseaurora.cssclient.businesslogic.framebl.FrameController;

/**
 *
 * @author Administrator
 */
public class FrameOperationFactory {
    public FrameBLService createFrameBL()
    {
        return new FrameController();
    }
}
