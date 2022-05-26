/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Date;
/*
Mariam Ehab Mostafa Ahmed
Computer Science Division
*/
/**
 *
 * @author user
 */
public class transactions extends clients {
    private String nametrans;
    private Date datetrans;
    private double amounttrans;
 
    transactions (int acc,String ntrans,Date datrans,double amotrans) {
       super(acc);
        this.nametrans=ntrans;
        this.datetrans=datrans;
        this.amounttrans=amotrans;
    }

   
    public void setNametrans(String nametrans) {
        this.nametrans = nametrans;
    }

    public void setAmounttrans(double amounttrans) {
        this.amounttrans = amounttrans;
    }

    public String getNametrans() {
        return nametrans;
    }


    public double getAmounttrans() {
        return amounttrans;
    }

    public void setDatetrans(Date datetrans) {
        this.datetrans = datetrans;
    }

    public Date getDatetrans() {
        return datetrans;
    }
    
   
   
    @Override
    public String toString() {
       
        String d=new String();
        d="" + nametrans + " ... " +  datetrans + " ... " + amounttrans + " ";
        return   d;
    }

   

    
}
