/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lesson05Bonus.generic;

/**
 *
 * @author Family
 */
public class MetaRunner {
    public static void main(String[] args){
        GenericMetaClass<Double> md = new GenericMetaClass<>(71.4D);
          System.out.println(md.sameAny(md));
        GenericMetaClass<Integer> mi = new GenericMetaClass<>(71);
          System.out.println(md.sameAny(mi));
//          md.same(mi);
          System.out.println(md.roundMark3());
    }

}
