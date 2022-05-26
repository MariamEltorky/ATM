 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Collections;
/*
Mariam Ehab Mostafa Ahmed
Computer Science Division
*/

/**
 *
 * @author user
 */
public class ATM implements ActionListener , FocusListener{
String numbers1=new String();     //to get password from user in main
String numbers=new String();      //to get account number from user in main
static ArrayList<clients> a1;      //arraylist to insert data of clients
 static ArrayList <transactions> a2;    //arraylist to insert transactions data 
 static ArrayList <transactions> s;     //used in sortt method to get transactons data for specifed user
 static  main mm;                       //object from jframe main
 static mainaccount maa;                //object from jframe mainaccount
  static addmoney admon;                //object from jframe addmoney
  static withdrawmoney withmon;          //object from jframe withdrawmoney
  static availableamount ava;             //object from jframe availableamount
  static accountinfo info;                //object from jframe accountinfo
  static last5trans last;                 //object from jframe last5trans
 static int c=0;                           //counter used in action of login button in main to pass all data
 static   int mis=0;                       //counter used in action of login button in main to make 3 tries only
  static boolean accno=false;              //to know which textfield is focus in main
 static   boolean pass=false;               //to know which textfield is focus in main
 static SimpleDateFormat sdf;               //to define date
  static   String date11 ;                  //string of date
  static String date22 ;
   static   String date33 ;
  static String date44 ;
   static   String date55 ;
  static String date66 ;
   static   String date77 ;
  static String date88 ;
  static   String date99 ;
  static String date00 ;
 static Date date1;                     //to convert string data to date
 static Date date2;
 static Date date3;
 static Date date4;
 static Date date5;
 static Date date6;
 static Date date7;
 static Date date8;
 static Date date9;
 static Date date0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    a1=new ArrayList <clients>();
   a2=new ArrayList<transactions>();
  sdf = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
   
     
    try {
       date11 = "2001/10/01 13:20:30";
        date1=sdf.parse(date11);
        date22 = "2002/12/15 14:21:31";
         date2=sdf.parse(date22);
        date33 = "2020/06/18 15:22:32";
         date3=sdf.parse(date33);
        date44 ="2004/08/19 16:23:33";
         date4=sdf.parse(date44);
        date55 ="2005/06/18 17:24:34";
         date5=sdf.parse(date55);
        date66 = "2006/04/01 18:25:35";
         date6=sdf.parse(date66);
        date77 = "2007/06/06 19:26:36";
         date7=sdf.parse(date77);
        date88 ="2008/10/20 20:28:37";
         date8=sdf.parse(date88);
        date99 = "2009/05/28 06:29:38";
         date9=sdf.parse(date99);
        date00 = "2010/08/09 10:56:40";
         date0=sdf.parse(date00);
     } catch (ParseException ex) {
        Logger.getLogger(ATM.class.getName()).log(Level.SEVERE, null, ex);
    }
clients c1=new clients("Mohamed Rady",123456,123123,20000 );
        clients c2= new clients("Ahmed Ali",654321,456456,30000);
        clients c3= new clients("Samer Mostafa",123789,789789,15000);
        clients c4=  new clients("Manar Kamal",111,222,50000);
        clients c5= new clients("Osama Ahmed",456789,654654,25000);
         a1.add(c1);
         a1.add(c2);
         a1.add(c3);
         a1.add(c4);
         a1.add(c5);
        transactions t1=new transactions (c1.getAccno(),"Add",date1,4000);
         transactions t2=new transactions (c4.getAccno(),"Withdraw",date2,2000);
         transactions t3=new transactions (c4.getAccno(),"Add",date3,6000);
         transactions t4=new transactions (c4.getAccno(),"Withdraw",date4,8000);
          transactions t5=new transactions (c5.getAccno(),"Add",date5,10000);
           transactions t6=new transactions (c4.getAccno(),"Withdraw",date6,2000);
         transactions t7=new transactions (c4.getAccno(),"Add",date7,2500);
         transactions t8=new transactions (c4.getAccno(),"Withdraw",date8,4500);
         transactions t9=new transactions (c4.getAccno(),"Add",date9,5000);
          transactions t10=new transactions (c5.getAccno(),"Withdraw",date0,6000);
           a2.add(t1);
           a2.add(t2);
           a2.add(t3);
           a2.add(t4);
           a2.add(t5);
           a2.add(t6);
           a2.add(t7);
           a2.add(t8);
           a2.add(t9);
           a2.add(t10);
 
      
        mm = new main();
        maa= new mainaccount();
        admon = new addmoney();
        withmon=new withdrawmoney();
        ava=new availableamount() ;
       info=new accountinfo();
        last=new last5trans();
       mm.setVisible(true);
       ATM atm =new ATM();                           
      
       
        maa.addMainAcc(atm);           //method in mainaccount to addActionListener of buttons in mainaccount jframe
       mm.addATM(atm);                   //method in main to addActionListener of buttons in main jframe
       mm.addFoucs(atm);             //method in main to addFocusListener to know which text field is focus in main jframe
       admon.addaddmon(atm);         //method in addmoney to addActionListener of buttons in addmoney jframe
       withmon.withwithmon(atm);       //method in withdrawmoney to addActionListener of buttons in withdrawmoney jframe
       ava.addava(atm);              //method in availableamount to addActionListener of buttons in availableamount jframe
      info.addinfo(atm);            //method in accountinfo to addActionListener of buttons in accountinfo jframe
      last.addlast(atm);             //method in last5trans to addActionListener of buttons in last5trans jframe
        
        
        
        
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
            numbers1="" +mm.getPassword().getText();
          numbers="" +mm.getaccountno().getText();
          //actions of buttons numbers in main jframe
        if (e.getSource().equals(mm.getOne())) {
           if(accno==true)
            mm.getaccountno().setText("" +numbers.concat("1"));
            if (pass==true)
               mm.getPassword().setText("" +numbers1.concat("1"));
        }
       else if (e.getSource().equals(mm.getTwo())) {
           if(accno==true)
            mm.getaccountno().setText("" +numbers.concat("2"));
            if (pass==true)
               mm.getPassword().setText("" +numbers1.concat("2"));
        }
          else if (e.getSource().equals(mm.getThree())) {
           if(accno==true)
            mm.getaccountno().setText("" +numbers.concat("3"));
            if (pass==true)
               mm.getPassword().setText("" +numbers1.concat("3"));
        }
          else if (e.getSource().equals(mm.getFour())) {
           if(accno==true)
            mm.getaccountno().setText("" +numbers.concat("4"));
            if (pass==true)
               mm.getPassword().setText("" +numbers1.concat("4"));
        }
          else if (e.getSource().equals(mm.getFive())) {
           if(accno==true)
            mm.getaccountno().setText("" +numbers.concat("5"));
            if (pass==true)
               mm.getPassword().setText("" +numbers1.concat("5"));
        }
          else if (e.getSource().equals(mm.getSix())) {
           if(accno==true)
            mm.getaccountno().setText("" +numbers.concat("6"));
            if (pass==true)
               mm.getPassword().setText("" +numbers1.concat("6"));
        }
          else if (e.getSource().equals(mm.getSeven())) {
           if(accno==true)
            mm.getaccountno().setText("" +numbers.concat("7"));
            if (pass==true)
               mm.getPassword().setText("" +numbers1.concat("7"));
        }
          else if (e.getSource().equals(mm.getEight())) {
           if(accno==true)
            mm.getaccountno().setText("" +numbers.concat("8"));
            if (pass==true)
               mm.getPassword().setText("" +numbers1.concat("8"));
        }
          else if (e.getSource().equals(mm.getNine())) {
           if(accno==true)
            mm.getaccountno().setText("" +numbers.concat("9"));
            if (pass==true)
               mm.getPassword().setText("" +numbers1.concat("9"));
        }
          else if (e.getSource().equals(mm.getZero())) {
           if(accno==true)
            mm.getaccountno().setText("" +numbers.concat("0"));
            if (pass==true)
               mm.getPassword().setText("" +numbers1.concat("0"));
        }
            //action of login button in main jframe
          else if (e.getSource().equals(mm.getLogin())) {
                if (!mm.getAccountno().getText().isEmpty() && !mm.getPassword().getText().isEmpty()) {
                    try {
                     int x=Integer.parseInt(numbers);
                int y=Integer.parseInt(numbers1);
        
              for (int i=0;i<a1.size();i++) {
                  if (a1.get(i).getAccno()==x && a1.get(i).getPassword()==y) {
                    maa.setVisible(true);
                      mm.setVisible(false);
                  }
                  else  {
                    c++;
                    
                  }
                  
              }
              if (c==a1.size()) {
                  if (mis<3) {
                      mm.getAccountno().setText("");
                      mm.getPassword().setText("");
                  JOptionPane.showMessageDialog(null, "be care, system will close after 3 tries (Please Enter Correct accountno And Password)", "WARNING", 0);
                c=0;
                  mis++;
                  } 
                  else {
                      mm.getAccountno().setText("");
                      mm.getPassword().setText("");
                      JOptionPane.showMessageDialog(null, "System Will Close , Try Again Later","WARNING" , 0);
                      System.exit(0);
                  }
              }
              
                    } catch (NumberFormatException ex){
                         mm.getAccountno().setText("");
                      mm.getPassword().setText("");
                    JOptionPane.showMessageDialog(null, "Account Number And Password must contains numbers only", "MESSAGE",0);
                    
                    }
                }
                else{
                     mm.getAccountno().setText("");
                      mm.getPassword().setText("");
                JOptionPane.showMessageDialog(null, "Please Enter Account Number And Password", "MESSAGE",0);
                
                }
          }
          
          
            //action of add button in mainaccount jframe
          else  if (e.getSource().equals(maa.getAddd())) {
              
                    admon.setVisible(true);
                    maa.setVisible(false);
              
        }
          
          
           //action of withdraw button in mainaccount jframe
        else if (e.getSource().equals(maa.getWithdraw())) { 
                 withmon.setVisible(true);
                    maa.setVisible(false);
        }
        
        //action of confirm button in addmoney jframe
        else if (e.getSource().equals(admon.getConfirmadd())) {
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
         LocalDateTime now = LocalDateTime.now();
         String t=new String();
      
         Date z=new Date();
                try {
                       t=dtf.format(now);
                    z=sdf.parse(t);
                } catch (ParseException ex) {
                    Logger.getLogger(ATM.class.getName()).log(Level.SEVERE, null, ex);
                }
   
                 int ind;
               ind= searchAccount(numbers); 
               String r=new String();
               if (!admon.getAd().getText().isEmpty()) {
               try {
             r=admon.getAd().getText();
            // System.out.println("rrr-->  "+r);
              double k=Double.parseDouble(r);
            //  System.out.println("account number -->"+numbers+" "+ind);
             double newamount= a1.get(ind).getAmount() + k;
             a1.get(ind).setAmount(newamount);
            transactions tt=new transactions (a1.get(ind).getAccno(),"Add",z,k);
            a2.add(tt);
            sortt(a2);
             admon.getAd().setText("");
            if (JOptionPane.showConfirmDialog(null, "Do You Want To Make Another operation? \n If You choose No You Will LogOut", "MESSAGE",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        maa.setVisible(true);
                          admon.setVisible(false);
            } else {
                       mm.getAccountno().setText("");
                      mm.getPassword().setText("");
                             mm.setVisible(true);
                              admon.setVisible(false);
                           
            }
             } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "must contain the amount of numbers", "MESSAGE",0);
                    admon.getAd().setText("");
                    }
             //System.out.println("New Ammount: "  + a1.get(ind).getAmount());
                
    }
               else {
                    JOptionPane.showMessageDialog(null, "Please Enter Amount Of Money You Want To Add", "MESSAGE",0);
               }
        }
        
        //action of back button in addmoney jframe
        else if (e.getSource().equals(admon.getBack())) {
                     maa.setVisible(true);
                   admon.setVisible(false);
                   
        }
        
        //action of confirm button in withdrawmoney jframe
        else if (e.getSource().equals(withmon.getConfirmwithd())) {
             DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
         LocalDateTime now = LocalDateTime.now();            //to get current date and time
           String t=new String();
         t=dtf.format(now);
         Date z=new Date();
                try {
                    z=sdf.parse(t);
                } catch (ParseException ex) {
                    Logger.getLogger(ATM.class.getName()).log(Level.SEVERE, null, ex);
                }
    //  System.out.println("" + numbers);
                 int ind;
               ind= searchAccount(numbers); 
               String r;
                    if (!withmon.getWithd().getText().isEmpty()) {
               try {
             r=withmon.getWithd().getText();
            // System.out.println("rrr-->  "+r);
              double k=Double.parseDouble(r);
            //  System.out.println("account number -->"+numbers+" "+ind);
              boolean checkbalan = checkAmount(ind,r);   // //check amount of withdraw smaller than amount
              if (checkbalan == true) {
             double newamount= a1.get(ind).getAmount() - k;
            // System.out.println("Nwe" + newamount);
             a1.get(ind).setAmount(newamount);
            transactions qq=new transactions (a1.get(ind).getAccno(),"Withdraw",z,k);
            a2.add(qq);
            sortt(a2);
               withmon.getWithd().setText("");
                if (JOptionPane.showConfirmDialog(null, "Do You Want To Make Another operation? \n If You choose No You Will LogOut", "MESSAGE",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        maa.setVisible(true);
                     withmon.setVisible(false);
            } else {
                       mm.getAccountno().setText("");
                      mm.getPassword().setText("");
                             mm.setVisible(true);
                             withmon.setVisible(false);
                                
            }
          //   System.out.println("New Ammount: "  + a1.get(ind).getAmount());
              }
              else{
                JOptionPane.showMessageDialog(null, "You Don't Have Enough Amount Of Money you have only  " +a1.get(ind).getAmount());
                 withmon.getWithd().setText("");
                 
              }
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "must contain the amount of numbers", "MESSAGE",0);
                    withmon.getWithd().setText("");
                    }
    } 
            else {
                    JOptionPane.showMessageDialog(null, "Please Enter Amount Of Money You Want To Withdraw", "MESSAGE",0);
               }
        }
        
        //action of back button in withdraw jframe
         else if (e.getSource().equals(withmon.getBack())) {
                     maa.setVisible(true);
                   withmon.setVisible(false);
                   
        }
         
         //action of available amount of money button in mainaccount jframe
        else if (e.getSource().equals(maa.getAmountmoney())) {
             int ind;
               ind= searchAccount(numbers);
                 //System.out.println("hhhoooo");
                  ava.setVisible(true);
                    maa.setVisible(false);
                    ava.getAva().setEnabled(false);
               ava.getAva().setText(""+a1.get(ind).getAmount());
              //ava.setAvaset(a1.get(ind).getAmount());
        }
        
        //action of back button in availableamount jframe
           else if (e.getSource().equals(ava.getBack())) {
                     maa.setVisible(true);
                   ava.setVisible(false);
                   
        }
           
           //action of my account button in acountinfo jframe
         else if (e.getSource().equals(maa.getAccount())) {
             int ind;
               ind= searchAccount(numbers);
                  info.setVisible(true);
                    maa.setVisible(false);
                    info.getInfoaccount().setEnabled(false);
               info.getInfoaccount().setText("Name:   "+a1.get(ind).getName()+"\n" + "AccountNo:   " + a1.get(ind).getAccno()+"\n" + "Amount Of Money:   " + a1.get(ind).getAmount());
        }
         
         //action of back button in accountinfo jframe
          else if (e.getSource().equals(info.getBack())) {
                     maa.setVisible(true);
                   info.setVisible(false);
                   
        }
           
          //action of log out button in mainaccount jframe
          else if (e.getSource().equals(maa.getLogout())) {
                    
                   mm.setVisible(true);
                    maa.setVisible(false);
                    mm.getaccountno().setText("");
                    mm.getPassword().setText("");
                   
        }
          
          //action of last 5 transactions in mainaccount jframe
          else if (e.getSource().equals(maa.getLast5trans())) {
               int ind;
               int count=0;
       
               String y=new String();
               y="";
               ind= searchAccount(numbers);     //to get data of specifed account number
                     last.setVisible(true);
                    maa.setVisible(false);
                    last.getLast5().setEnabled(false);
                sortt(a2);                      //to sort arraylist according to date
            
                       for (int i=0;i<5;i++) {
                            y=y +s.get(i).toString() + "\n";
                            last.getLast5().setText(y+ "\n");
          }
                
          }
          
          //action of back button in last5trans jframe
        else if (e.getSource().equals(last.getBack())) {
                     maa.setVisible(true);
                   last.setVisible(false);
                   
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
          if (e.getSource().equals(mm.getaccountno()))
       {  
            pass=false;
           accno=true;
           
       }
        if (e.getSource().equals(mm.getPassword()))
       {
           accno=false;
           pass=true;
           
       
       }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int searchAccount(String numbers) {          // to get index of specifed account number
        int t=Integer.parseInt(numbers);
    for (int i=0;i<a1.size();i++) {
        if (a1.get(i).getAccno()==t) {
            return i;
        }
    }
    return 0;
    
    
    }
  

    private boolean checkAmount(int ind, String r) {       //check amount of withdraw smaller than amount
         r=withmon.getWithd().getText();
        int y=Integer.parseInt(r);
        if(a1.get(ind).getAmount()<y) 
            return false;
        else
            return true;
    }

  private void sortt(ArrayList<transactions> a2) {      //to sort arraylist according to date
      
      int ind;
       ind= searchAccount(numbers);
       s=new ArrayList<>();
                    for (int i=0;i<a2.size();i++) {
                        if (a1.get(ind).getAccno()==a2.get(i).getAccno()) {
                           s.add(a2.get(i));
                        }
                    }
      Collections.sort(s, new Comparator<transactions>() {
            public int compare(transactions p1, transactions p2) {
                return Long.valueOf(p2.getDatetrans().getTime()).compareTo(p1.getDatetrans().getTime());
            }
        });
    }
    
}
