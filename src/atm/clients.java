/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.ArrayList;
/*
Mariam Ehab Mostafa Ahmed
Computer Science Division
*/
/**
 *
 * @author user
 */
public class clients {
   private  String name;
   private int accno;
   private int password;
   private double amount;
  
   clients () {
       name="";
       accno=0;
       password=0;
       amount=0.0;
   }
   clients (String n,int acc,int pass,double amo) {
       this.name=n;
       this.accno=acc;
       this.password=pass;
       this.amount=amo;
   }
   clients(int ac) {
       this.accno=ac;
   }

    public void setName(String n) {
        this.name = n;
    }

    public void setAccno(int acc) {
        this.accno = acc;
    }

    public void setPassword(int pass) {
        this.password = pass;
    }

    public void setAmount(double amo) {
        this.amount = amo;
    }

    public String getName() {
        return name;
    }

    public int getAccno() {
        return accno;
    }

    public int getPassword() {
        return password;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "clients{" + "name=" + name + ", accno=" + accno + ", password=" + password + ", amount=" + amount + '}';
    }
     
}
