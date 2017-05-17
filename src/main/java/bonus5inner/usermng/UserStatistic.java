/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bonus5inner.usermng;

import bonus5inner.objects.CommonObject;

/**
 *
 * @author Family
 */
public class UserStatistic extends CommonObject {
    private long id;
    private int mark;

    public UserStatistic(){
        super();
    }
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public int getMark(){
        return mark;
    }
    public void setMark(int mark){
        this.mark = mark;
    }
}
