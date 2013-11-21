/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.businesslogic.procssmngbl.statebl;

import njuseaurora.cssclient.businesslogicservice.processmngblservice.state.MyState;

/**
 *
 * @author Administrator
 */
public class StateContext {

    CourseLaunchingState cls;
    DroppingState ds;
    FrameLaunchingState fls;
    GradeInState gis;
    PlanUploadingState pus;
    ReselectingState rss;
    SelectingState sls;
    StartState sts;
    MyState state = sts;
    int count = 0;
    private volatile static StateContext uniqueContext;

    private StateContext() {
        cls = new CourseLaunchingState(this);
        ds = new DroppingState(this);
        fls = new FrameLaunchingState(this);
        gis = new GradeInState(this);
        pus = new PlanUploadingState(this);
        rss = new ReselectingState(this);
        sls = new SelectingState(this);
        sts = new StartState(this);
        state=sts;
    }

    public static StateContext getStateContext() { //双重加锁保证线程安全
        if (uniqueContext == null) {
            synchronized (StateContext.class) {
                if (uniqueContext == null) {
                    uniqueContext = new StateContext();
                }
            }
        }
        return uniqueContext;
    }

    public MyState getCourseLaunchingState() {
        return cls;
    }
    public MyState getDroppingState(){
        return ds;
    }
    public MyState getFrameLaunchingState(){
        return fls;
    }
    public MyState getGradeInState(){
        return  gis;
    }
    public MyState getPlanUploadingState(){
        return pus;
    }
    public MyState getReselectingState (){
        return rss;
    }
    public MyState getSelectingState(){
        return sls;
    }
    public MyState getStartState(){
        return sts;
    }
    
}
