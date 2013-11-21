/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.dataservice.staticdataservice;

import njuseaurora.cssclient.po.staticpo.CourseStaticPO;
import njuseaurora.cssclient.po.staticpo.StudentStaticPO;
import njuseaurora.cssclient.po.staticpo.TeacherStaticPO;

/**
 *
 * @author zili chen
 */
public interface StaticDataService {
    
    public TeacherStaticPO find(TeacherStaticPO tpo);
    
    public StudentStaticPO find(StudentStaticPO spo);
    
    public CourseStaticPO find(CourseStaticPO cpo);
}
