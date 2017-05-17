/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bonus5inner.actions;


import bonus5inner.usermng.UserStatistic;

/**
 *
 * @author Family
 */
public class CreatorStatistic {

    public static UserStatistic createUserStatistic(long id){
        UserStatistic temp = new UserStatistic();
        temp.setId(id);
        int mark = 7;
        temp.setMark(mark);
        return temp;
    }
    public static void main(String[] args) {
        UserStatistic us = createUserStatistic(71);
        System.out.println(us.getMark());
    }

}
