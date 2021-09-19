/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner (System.in);
        float a=5,b=2;
       b%=a;
         System.out.print("el modulo combinado es :"+b+"\n");
       b+=a; 
       System.out.print(" la suma seria :"+b+"\n");
       b-=a;
       System.out.print(" la resta seria :"+b+"\n");
       b*=a;
       System.out.print(" la multiplicacion seria :"+b+"\n");
       double r=2.0;
       r/=a;
       System.out.print(" la division seria :"+r+"\n");  // TODO code application logic here
    }

}
