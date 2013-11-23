/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogic.procssmngbl.statebl;

import junit.framework.TestCase;
import njuseaurora.cssclient.businesslogicservice.processmngblservice.state.MyState;

/**
 *
 * @author Administrator
 */
public class StateContextTest extends TestCase {
    
    public StateContextTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getStateContext method, of class StateContext.
     */
    public void testGetStateContext() {
        System.out.println("getStateContext");
        StateContext expResult = null;
        StateContext result = StateContext.getStateContext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourseLaunchingState method, of class StateContext.
     */
    public void testGetCourseLaunchingState() {
        System.out.println("getCourseLaunchingState");
        StateContext instance = null;
        MyState expResult = null;
        MyState result = instance.getCourseLaunchingState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDroppingState method, of class StateContext.
     */
    public void testGetDroppingState() {
        System.out.println("getDroppingState");
        StateContext instance = null;
        MyState expResult = null;
        MyState result = instance.getDroppingState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrameLaunchingState method, of class StateContext.
     */
    public void testGetFrameLaunchingState() {
        System.out.println("getFrameLaunchingState");
        StateContext instance = null;
        MyState expResult = null;
        MyState result = instance.getFrameLaunchingState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGradeInState method, of class StateContext.
     */
    public void testGetGradeInState() {
        System.out.println("getGradeInState");
        StateContext instance = null;
        MyState expResult = null;
        MyState result = instance.getGradeInState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlanUploadingState method, of class StateContext.
     */
    public void testGetPlanUploadingState() {
        System.out.println("getPlanUploadingState");
        StateContext instance = null;
        MyState expResult = null;
        MyState result = instance.getPlanUploadingState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReselectingState method, of class StateContext.
     */
    public void testGetReselectingState() {
        System.out.println("getReselectingState");
        StateContext instance = null;
        MyState expResult = null;
        MyState result = instance.getReselectingState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectingState method, of class StateContext.
     */
    public void testGetSelectingState() {
        System.out.println("getSelectingState");
        StateContext instance = null;
        MyState expResult = null;
        MyState result = instance.getSelectingState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartState method, of class StateContext.
     */
    public void testGetStartState() {
        System.out.println("getStartState");
        StateContext instance = null;
        MyState expResult = null;
        MyState result = instance.getStartState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
