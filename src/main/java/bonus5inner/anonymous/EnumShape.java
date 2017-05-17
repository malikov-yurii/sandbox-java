/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bonus5inner.anonymous;

/**
 *
 * @author Family
 */
public enum EnumShape {
               RECTANGLE, SQUARE, TRIANGLE {
                   public double getSquare(){
                       return a*b/2;
                   }
               };
               public double a, b;

               public void setShape(double a, double b){
                   if ((a <=0 || b<=0) || a!=b && this ==SQUARE)
                       throw new IllegalArgumentException();
                   else
                       this.a = a;
                       this.b = b;
               }
               public double getSquare(){
                   return a * b;
               }
               public String getParameters(){
                   return "a=" + a + ", b=" +b;
               }
}
