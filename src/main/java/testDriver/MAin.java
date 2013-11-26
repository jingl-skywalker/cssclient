/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testDriver;

/**
 *
 * @author Administrator
 */
public class MAin {

    public static void main(String[] args) {
        FrameUIDriver frameUIDriver = new FrameUIDriver();
        frameUIDriver.createFPressed();
        frameUIDriver.finishBlockPressed();
        frameUIDriver.releasePressed();
    }
}
